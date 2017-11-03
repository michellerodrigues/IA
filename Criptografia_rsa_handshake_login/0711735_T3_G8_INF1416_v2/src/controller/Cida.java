package controller;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Random;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;

import Principal.PersistenciaDados;
import dao.RegistroDAO;
import dao.UsuarioDAO;
import model.Usuario;

public class Cida {

	private static PrivateKey chavePrivada;
	private static PublicKey chavePublica;
	String caminhoChavePublica;
	String caminhoChavePrivada;
	String fraseSecreta;
	String caminhoToken;
	public static String statusArquivo;
	public static byte[] chavePrivadaArquivo;
	public static byte[] chavePublicaBanco;
	byte[] assinaturaDigitalDoArquivoDeIndex;
	byte[] envelopeDigitalDoArquivoDeIndex;
	byte[] arquivoIndexDaPasta; 
	static Usuario usuarioLogado = PersistenciaDados.getInstance().getUsuarioLogado();


	public Cida() {
		// TODO Auto-generated constructor stub
	}

	public Cida(String caminhoChavePrivada, String caminhoChavePublica, String caminhoToken, String fraseSecreta) throws FileNotFoundException, IOException, NoSuchAlgorithmException, InvalidKeySpecException, InvalidKeyException, NoSuchPaddingException, BadPaddingException, IllegalBlockSizeException 
	{
		
		this.caminhoChavePrivada = caminhoChavePrivada;
		this.caminhoChavePublica = caminhoChavePublica;

		try{
			byte[] conteudoArquivoChavePrivada = carregarArquivo(caminhoChavePrivada);
			chavePrivada = recuperarChavePrivada(conteudoArquivoChavePrivada, fraseSecreta);
		}
		catch(BadPaddingException e)
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			System.out.println(e.getClass());
		}
		
		chavePublica = recuperarChavePublica(usuarioLogado.getChavePublica());

		if(!fraseSecreta.equals(""))
		{
			this.fraseSecreta = fraseSecreta;
		}
		if(!caminhoToken.equals(""))
		{
			this.caminhoToken = caminhoToken;
			assinaturaDigitalDoArquivoDeIndex = carregarArquivo(this.caminhoToken + "\\index.asd");
			envelopeDigitalDoArquivoDeIndex = carregarArquivo(this.caminhoToken + "\\index.env");
			arquivoIndexDaPasta = carregarArquivo(this.caminhoToken + "\\index.enc");
		}


	}

	public static boolean verificarChaves(String caminhoChavePrivada, String fraseSecreta, byte[] chavePublicaBanco) throws FileNotFoundException, IOException, NoSuchAlgorithmException, InvalidKeyException, NoSuchPaddingException, BadPaddingException, IllegalBlockSizeException, InvalidKeySpecException, SignatureException
	{
		byte[] conteudoArquivoChavePrivada = carregarArquivo(caminhoChavePrivada);

		//pega o conteudo em Byte[] da chave Publica e aplica o encode do padrão utilizado para chave pública
		//o resultado é uma saída PrivateKey
		chavePublica = recuperarChavePublica(chavePublicaBanco);

		chavePrivada = recuperarChavePrivada(conteudoArquivoChavePrivada,fraseSecreta);
		return verificarAssinatura(chavePrivada, chavePublica);
	}
	//carregar arquivo criptografado
	public static byte[] carregarArquivo(String caminhoArquivo) throws FileNotFoundException, IOException {
		File arquivoLido = new File(caminhoArquivo);

		FileInputStream fileInputStream = new FileInputStream(arquivoLido);
		
		@SuppressWarnings("resource")
		BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
		byte[] conteudoBytes = new byte[(int) arquivoLido.length()];
		//lê o array de bytes
		bufferedInputStream.read(conteudoBytes);
		//bufferedInputStream.close();
		return conteudoBytes;

	}
	public static byte[] decriptarConteudo(byte[] encoded, Key chave, String algoritmo) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, IOException, BadPaddingException, IllegalBlockSizeException, InvalidKeySpecException {
		Cipher cipher = Cipher.getInstance(algoritmo);
		cipher.init(Cipher.DECRYPT_MODE, chave);
		return cipher.doFinal(encoded);
	}
	@SuppressWarnings("static-access")
	public static PublicKey gravarChavePublicaDoArquivoNoBanco(byte[] conteudoArquivo) throws NoSuchAlgorithmException, InvalidKeySpecException {
		Usuario usuarioLogado = PersistenciaDados.getInstance().getUsuarioLogado();
		UsuarioDAO usuario = null;
		usuarioLogado.setChavePublica(conteudoArquivo);
		usuario.atualizarUsuario(usuarioLogado);

		KeyFactory keyFactory = KeyFactory.getInstance("RSA");
		X509EncodedKeySpec encodeX509 = new X509EncodedKeySpec(conteudoArquivo);
		PublicKey publicKey = keyFactory.generatePublic(encodeX509);
		byte[] bytesPublicKey = publicKey.getEncoded();


		StringBuffer bufChavePublica = new StringBuffer();
		for(int i = 0; i < bytesPublicKey.length; i++) {
			String hex = Integer.toHexString(0x0100 + (bytesPublicKey[i] & 0x00FF)).substring(1);
			bufChavePublica.append((hex.length() < 2 ? "0" : "") + hex);
		}

		System.out.println("String chave publica " + bufChavePublica.toString());


		return publicKey;
	}
	public static PublicKey recuperarChavePublica(byte[] conteudoArquivo) throws NoSuchAlgorithmException, InvalidKeySpecException {
		KeyFactory keyFactory = KeyFactory.getInstance("RSA");
		X509EncodedKeySpec encodeX509 = new X509EncodedKeySpec(conteudoArquivo);
		PublicKey publicKey = keyFactory.generatePublic(encodeX509);
		return publicKey;
	}
	public static PrivateKey recuperarChavePrivada(byte[] conteudoArquivo, String fraseSecreta) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, IOException, BadPaddingException, IllegalBlockSizeException, InvalidKeySpecException {
		SecureRandom random = SecureRandom.getInstance("SHA1PRNG");
		random.setSeed(fraseSecreta.getBytes());

		KeyGenerator keyGen = KeyGenerator.getInstance("DES");
		keyGen.init(56, random);
		byte[] pkcs8ChavePrivada = decriptarArquivoPKCS5(conteudoArquivo, keyGen.generateKey());

		//aplicar codificação para obter a chave
		PKCS8EncodedKeySpec pkcs8ChavePrivadaKeySpec = new PKCS8EncodedKeySpec(pkcs8ChavePrivada);

		KeyFactory keyFactory = KeyFactory.getInstance("RSA");

		//retorna na chave privada obtida pela KeyFactory para o byte[] decriptografado com o padrão pkcs8
		PrivateKey chaveprivada = keyFactory.generatePrivate(pkcs8ChavePrivadaKeySpec);

		return chaveprivada;
	}
	public static byte[] decriptarArquivoPKCS5(byte[] encoded, Key key) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, IOException, BadPaddingException, IllegalBlockSizeException, InvalidKeySpecException {
		//http://en.wikipedia.org/wiki/PKCS
		//Password-based Encryption Standard
		Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
		
		//Inicializa esta cifra com uma chave.
		
		cipher.init(Cipher.DECRYPT_MODE, key);
		
		//Finaliza uma criptografia de várias parte ou a operação de decodificação, dependendo de como esta cifra foi inicializado.
		return cipher.doFinal(encoded);
	}
	public static boolean verificarAssinatura(PrivateKey chavePrivada, PublicKey chavePublica) throws InvalidKeyException, NoSuchAlgorithmException, UnsupportedEncodingException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException, InvalidKeySpecException, SignatureException {

		byte[] bytes = new byte[512];
		
		//obtem número aleatório
		Random random = new Random();
		random.nextBytes(bytes);

		//http://docs.oracle.com/javase/7/docs/api/java/security/KeyFactory.html

		/*A assinatura digital baseia-se no fato de que apenas o dono conhece a chave privada e que, 
		 * se ela foi usada para codificar uma informação, então apenas seu dono poderia ter feito isto. 
		 * A verificação da assinatura é feita com o uso da chave pública, pois se o 
		 * texto foi codificado com a chave privada, somente a chave pública correspondente pode decodificá-lo.*/
		Signature assinatura = Signature.getInstance("MD5withRSA");

		assinatura.initSign(chavePrivada);
		//assina conteúdo com chave privada
		assinatura.update(bytes);

		//obtem conteudo assinado
		byte[] signPrivateKey = assinatura.sign();

		//verifica 
		assinatura.initVerify(chavePublica);

		assinatura.update(bytes);

		//decodifica com chave pública
		if (assinatura.verify(signPrivateKey)) {
			
			PersistenciaDados.getInstance().setChavePrivadaValidada(chavePrivada);
			PersistenciaDados.getInstance().setChavePublicaValidada(chavePublica);
			return true;
		}

		return false;
	}
	public byte[] gerarSementeParaEnvelope(byte[] arquivoDesejado, PrivateKey privateKey) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {

		/*Um envelope digital pode ser decifrada usando a 
		 * chave privada de um receptor para descriptografar uma 
		 * chave secreta, ou usando uma chave secreta para 
		 * descriptografar dados criptografados. 
		 * Neste caso, foi usada a chave Privada*/
			
		Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
		cipher.init(Cipher.DECRYPT_MODE, privateKey);
		// decripta utilizando a chave privada
		return cipher.doFinal(arquivoDesejado);
	}

	public Key gerarChavesParaSemente(byte[] seed) throws NoSuchAlgorithmException {
		SecureRandom random = SecureRandom.getInstance("SHA1PRNG");
		random.setSeed(seed);
		KeyGenerator keyGen = KeyGenerator.getInstance("DES");
		keyGen.init(56, random);
		return keyGen.generateKey();
	}

	public boolean checkSign(PublicKey publicKey, byte[] signatureBytes, byte[] signedBytes) throws NoSuchAlgorithmException, InvalidKeyException, SignatureException {
		Signature signature = Signature.getInstance("MD5withRSA");

		signature.initVerify(publicKey);
		signature.update(signedBytes);
		return signature.verify(signatureBytes);
	}

	public String carregarStatusArquivo(String caminhoTokenString, String nomeArq ) {
		byte[] content = null;
		String statusArquivo = null;	
		try {
			byte[] assinaturaDigital = carregarArquivo(caminhoTokenString + "\\" + nomeArq + ".asd");
			byte[] envelopeDigital = carregarArquivo(caminhoTokenString + "\\" + nomeArq + ".env");
			byte[] conteudoSecreto = carregarArquivo(caminhoTokenString + "\\" + nomeArq + ".enc");


			byte[] seed = gerarSementeParaEnvelope(envelopeDigital, chavePrivada);
			Key key = gerarChavesParaSemente(seed);
			content = decriptarArquivoPKCS5(conteudoSecreto, key);

			boolean result = checkSign(Cida.chavePublica, assinaturaDigital, content);
			if(result)
			{
				if(nomeArq.equals("index"))
				{
					//obtem lista arquivos secretos
					statusArquivo=new String(content, "UTF-8");
				}
				else
				{
					//trata-se de um arquivo selecionado, segue status
					statusArquivo = "OK" ;
				}

			}
			else
			{
				statusArquivo = "NOT OK" ;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return statusArquivo;
	}

	public byte[] carregarConteudoBytesArquivo(String caminhoTokenString, String nomeArq ) {
		byte[] content = null;
		try {
			byte[] assinaturaDigital = carregarArquivo(caminhoTokenString + "\\" + nomeArq + ".asd");
			byte[] envelopeDigital = carregarArquivo(caminhoTokenString + "\\" + nomeArq + ".env");
			byte[] conteudoSecreto = carregarArquivo(caminhoTokenString + "\\" + nomeArq + ".enc");


			byte[] seed = gerarSementeParaEnvelope(envelopeDigital, chavePrivada);
			Key key = gerarChavesParaSemente(seed);
			content = decriptarArquivoPKCS5(conteudoSecreto, key);

			boolean result = checkSign(Cida.chavePublica, assinaturaDigital, content);
			if(result)
			{
				statusArquivo = "OK";
				return content;

			}
			else
			{
				statusArquivo = "NOT OK";
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return content;
	}
	public PrivateKey descriptografarChavePrivada(byte[] encodedPrivateKey, String fraseSecreta) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, IOException, BadPaddingException, IllegalBlockSizeException, InvalidKeySpecException {
		/*A chave privada utiliza a codificação PKCS8 e a chave pública utiliza o padrão X.509. O Java
		oferece classes prontas para manipular com os dados codificados que estão armazenados nesses
		arquivos, respectivamente, as classes PKCS8EncodedKeySpec e X509EncodedKeySpec. */
		
		SecureRandom random = SecureRandom.getInstance("SHA1PRNG");
		random.setSeed(fraseSecreta.getBytes());

		
		KeyGenerator keyGen = KeyGenerator.getInstance("DES");
		keyGen.init(56, random);
		byte[] pkcs8PrivateKey = decriptarArquivoPKCS5(encodedPrivateKey, keyGen.generateKey());

		PKCS8EncodedKeySpec pkcs8EncodedKeySpec = new PKCS8EncodedKeySpec(pkcs8PrivateKey);

		//pesquisar RSA
		KeyFactory keyFactory = KeyFactory.getInstance("RSA");
		return keyFactory.generatePrivate(pkcs8EncodedKeySpec);
	}
	public static boolean verificarChavePrivada(String caminhoChavePrivada, String fraseSecreta) throws InvalidKeyException, FileNotFoundException, NoSuchAlgorithmException, NoSuchPaddingException, BadPaddingException, IllegalBlockSizeException, InvalidKeySpecException, SignatureException, IOException {

        Usuario usuarioLogado = PersistenciaDados.getInstance().getUsuarioLogado();
        String loginAtual = usuarioLogado.getLogin();
        int tentativas = usuarioLogado.getTentativas_senha();
        boolean resultado = Cida.verificarChaves(caminhoChavePrivada, fraseSecreta,usuarioLogado.getChavePublica());
        if(resultado==true && tentativas<3 )
        {
        	  RegistroDAO.incluirRegistroLogin(4003, usuarioLogado.getIdUsuario());
              usuarioLogado.setTentativas_senha(0);
              return resultado;
        }
        else
        {
        	tentativas++;
        	usuarioLogado.setTentativas_senha(tentativas);
        }
        switch (usuarioLogado.getTentativas_senha())
        {
            case 1:
            	RegistroDAO.incluirRegistroLogin(4004, usuarioLogado.getIdUsuario());
                break;
            case 2:
            	RegistroDAO.incluirRegistroLogin(4005, usuarioLogado.getIdUsuario());
                break;
            case 3:
                RegistroDAO.incluirRegistroLogin(4006, usuarioLogado.getIdUsuario());
                break;
        }
        UsuarioDAO.atualizaNumeroTentativas(3, usuarioLogado);
        return false;           
    }
}






