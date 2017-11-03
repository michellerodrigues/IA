package Principal;


import java.security.MessageDigest;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.util.ArrayList;

import model.Usuario;


public class PersistenciaDados {
    
    private static PersistenciaDados dadosPersistentesDoUsuario;
    private Usuario usuarioLogado;
    private ArrayList<String> caminhoArquivos = new ArrayList<String>();
    static PrivateKey chavePrivadaValidada;
    static PublicKey  chavePublicaValidada;
    static String fraseSecretaCorreta;
   
    
    
    public PrivateKey getChavePrivadaValidada() {
		return chavePrivadaValidada;
	}

	public void setChavePrivadaValidada(PrivateKey chavePrivadaValidada) {
		PersistenciaDados.chavePrivadaValidada = chavePrivadaValidada;
	}

	public PublicKey getChavePublicaValidada() {
		return chavePublicaValidada;
	}

	public void setChavePublicaValidada(PublicKey chavePublicaValidada) {
		PersistenciaDados.chavePublicaValidada = chavePublicaValidada;
	}

	public static String getFraseSecretaCorreta() {
		return fraseSecretaCorreta;
	}

	public static void setFraseSecretaCorreta(String fraseSecretaCorreta) {
		PersistenciaDados.fraseSecretaCorreta = fraseSecretaCorreta;
	}

		
	private PersistenciaDados(){
        
    }
    
    public static PersistenciaDados getInstance() {
      if (dadosPersistentesDoUsuario == null)
    	  dadosPersistentesDoUsuario = new PersistenciaDados();
      return dadosPersistentesDoUsuario;
    }
       
       
    public ArrayList<String> getCaminhoArquivos() {
		return caminhoArquivos;
	}

	public void setCaminhoArquivos(ArrayList<String> caminhoArquivos) {
		this.caminhoArquivos = caminhoArquivos;
	}

	public void addCaminhoArquivos(String caminho) {
		this.caminhoArquivos.add(caminho);
	}
	public Usuario getUsuarioLogado() {
		return usuarioLogado;
	}

	public void setUsuarioLogado(Usuario usuarioLogado) {
		this.usuarioLogado = usuarioLogado;
	}

	public static String gerarSenhaComHash (String senhaTextoPlano, Integer salt) throws Exception
	{
		byte[] senhaComSaltHash;
		MessageDigest messageDigest;

		String senhaComSalt = senhaTextoPlano + salt.toString();
		
		senhaComSaltHash=senhaComSalt.getBytes("UTF8");

		messageDigest = MessageDigest.getInstance("MD5");

		messageDigest.update(senhaComSaltHash);
		byte [] digest = messageDigest.digest();

		//converter para Hexadecimal
		StringBuffer bufDigest = new StringBuffer();
		for(int i = 0; i < digest.length; i++) {
			String hex = Integer.toHexString(0x0100 + (digest[i] & 0x00FF)).substring(1);
			bufDigest.append((hex.length() < 2 ? "0" : "") + hex);
		}

		System.out.println("Senha configurada " + bufDigest.toString());
		return bufDigest.toString();

	}   
}



















