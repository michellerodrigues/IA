package t2Seguranca;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class DigestCalculator {

	static String tpDigests= "";
	static int tipo_Digest=-1;
	public DigestCalculator() {
		// TODO Auto-generated constructor stub
	}

	public static String calcularDigest(String mensagemS,String tipoDigestS) throws Exception
	{
		byte[] mensagem;
		MessageDigest messageDigest;
		String hexDigestGerado="";

		mensagem=mensagemS.getBytes("UTF8");

		messageDigest = MessageDigest.getInstance(tipoDigestS);

		messageDigest.update(mensagem);
		byte [] digest = messageDigest.digest();
		System.out.println( "\nDigest length: " + digest.length * 8 + "bits" );

		StringBuffer bufDigest = new StringBuffer();
		for(int i = 0; i < digest.length; i++) {
			String hex = Integer.toHexString(0x0100 + (digest[i] & 0x00FF)).substring(1);
			bufDigest.append((hex.length() < 2 ? "0" : "") + hex);
		}

		// imprime o digest em hexadecimal
		System.out.println( "\nDigest Gerado (hex): " );
		System.out.println( bufDigest.toString() );

		return hexDigestGerado=bufDigest.toString();

	}

	public static int validarTipoDigest(String tipo)
	{
		int tipoDigest=-1;

		if(tipo.equals("SHA1"))
		{
			tipoDigest=1;
		}
		else
		{
			if(tipo.equals("MD5"))
			{
				tipoDigest=0;
			}
			else
			{
				System.err.println("Tipo de Digest incorreto, use MD5 ou SHA1");
				System.exit(1);
			}
		}
		return tipoDigest;
	}

	public static boolean validarArgumentos(int totalArgs)
	{

		if (totalArgs <1) {
			System.err.println("Use: java DigestCalculator Tipo_Digest Caminho_Arq1...Caminho_ArqN Caminho_ArqListaDigest");
			///System.exit(1);
			return false;
		}
		else
		{
			return true;
		}


	}

	@SuppressWarnings("resource")

	public static Arquivo lerArquivoCarregado(String nomeArquivo, int tipoDigest)
	{
		Arquivo arquivo=new Arquivo();
		int iniNomeArq = nomeArquivo.lastIndexOf("\\")+1;

		arquivo.setNomeArquivo(nomeArquivo.substring(iniNomeArq, nomeArquivo.length()));

		Scanner scanner = null;
		String tpDigests = "";

		try {
			scanner = new Scanner(new FileReader(nomeArquivo)).useDelimiter("\\eof");
			System.out.println("Arquivo lido : " + nomeArquivo);
			String msgOriginal = null;

			while (scanner.hasNext()) {
				msgOriginal = scanner.next();					
			}
			//System.out.print("Mensagem lida : "+ msgOriginal);
			String digestGerado = "";
			arquivo.setMensagem(msgOriginal);

			//calcular digest para mensagem carregada
			try {

				if(tipoDigest==1)
				{
					tpDigests="SHA1";
				}
				else
				{
					if(tipoDigest==0)
					{
						tpDigests="MD5";						
					}
				}


				digestGerado = calcularDigest(msgOriginal, tpDigests);
			} 
			catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			//preencher valor de digest de acordo com o tipo passado

			if(tipoDigest==0){
				arquivo.setDigest(0, digestGerado);
				//arquivo.setDigest(1, "");
				arquivo.setTipo0("MD5");

			}
			else //SHA1
			{
				//arquivo.setDigest(0, "");
				arquivo.setDigest(1, digestGerado);
				arquivo.setTipo1("SHA1");
			}

		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		finally 
		{
			if (scanner != null) {
				scanner.close();
			}

		}
		// A principio, todos estão ok
		arquivo.setStatus("OK");
		arquivo.setColisao(0, false);
		arquivo.setColisao(1, false);
		return arquivo;
	}

	@SuppressWarnings("resource")
	public static List<Arquivo> carregarListaDigest(String nomeArquivo) throws IOException
	{
		//Arquivo arquivo=new Arquivo();
		Scanner scanner = null;
		Arquivo arquivo;
		List<Arquivo> lista = new ArrayList<Arquivo>();
		String tipo0="";
		String tipo1="";
		try {
			 BufferedReader br = new BufferedReader(new FileReader(nomeArquivo));  
			 scanner = new Scanner(br).useDelimiter("\\s");
			 /*
			 while(br.ready()){  
	                String linha = br.readLine();  
	                System.out.println(linha);  
	            }  
	            br.close();  */
			
			
			
			//FileReader file = new FileWriter(nomeArquivo);
			//scanner = new Scanner(new FileReader(nomeArquivo)).useDelimiter("\\s");
			System.out.println("Arquivo lido : " + nomeArquivo);

			while (scanner.hasNext() && scanner!=null ) {

				arquivo=new Arquivo();
				arquivo.setNomeArquivo(scanner.next());
				tipo0=scanner.next();
				if(tipo0.equals("MD5"))
				{
					arquivo.setTipo1(tipo0);
					arquivo.setDigest(0, scanner.next());
				}
				else
				{
					arquivo.setTipo1("");
					arquivo.setDigest(1, "");
				}

				tipo1=scanner.next();
				if(tipo1.equals("SHA1"))
				{
					arquivo.setTipo1(tipo1);
					arquivo.setDigest(1, scanner.next());
					scanner.nextLine();
				}
				else
				{
					arquivo.setTipo1("");
					arquivo.setDigest(1, "");

					scanner.nextLine();
				}
				//validar ocorrencia facultativa do SHA1
				arquivo.setColisao(0, false);
				arquivo.setColisao(1, false);
				lista.add(arquivo);
			}


		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		finally 
		{
			if (scanner != null) {
				scanner.close();
			}
		}

		return lista;
	}

	public static void exibirLista(List<Arquivo> lista)
	{
		System.out.println("Lista de arquivos");

		for(int i = 0; i < lista.size(); i++)
		{
			System.out.print(lista.get(i).getNomeArquivo());
			System.out.print(" ");
			System.out.print(lista.get(i).getDigest(0));
			System.out.print(" ");
			System.out.print(lista.get(i).getDigest(1));
			System.out.print(" ");
			if(lista.get(i).getColisao(0))
			{
				System.out.print("COLISÃO MD5"+" ");
			}
			
			if(lista.get(i).getColisao(1))
			{
				System.out.print("COLISÃO SHA1"+" ");
			}	
			System.out.println(" ");
		}


	}

	public static void exibirListaArquivosDigests(List<Arquivo> lista)
	{
		System.out.println("Lista de Digests");

		for(int i = 0; i < lista.size(); i++)
		{
			System.out.print(lista.get(i).getNomeArquivo()+" ");
			System.out.print(lista.get(i).getTipo0()+" ");
			System.out.print(lista.get(i).getDigest(0)+" ");
			System.out.print(lista.get(i).getTipo1()+" ");
			System.out.print(lista.get(i).getDigest(1)+" ");
			if(lista.get(i).getColisao(0))
			{
				System.out.print("COLISÃO MD5"+" ");
			}
			
			if(lista.get(i).getColisao(1))
			{
				System.out.print("COLISÃO SHA1"+" ");
			}	
			System.out.println(" ");
		}


	}

	public static void exibirListaResultados(List<Arquivo> lista)
	{
		System.out.println("Lista de Resultado da Verificação");

		for(int i = 0; i < lista.size(); i++)
		{
				System.out.print(lista.get(i).getNomeArquivo()+" ");
				if(lista.get(i).getDigest(0)!=null)
				{
					System.out.print(lista.get(i).getTipo0()+" ");
					System.out.print(lista.get(i).getDigest(0)+" ");
				}
				if(lista.get(i).getDigest(1)!=null)
				{
					System.out.print(lista.get(i).getTipo1()+" ");
					System.out.print(lista.get(i).getDigest(1)+" ");
				}				
				
				if(lista.get(i).getColisao(0))
				{
					System.out.print("COLISÃO MD5"+" ");
				}
				
				if(lista.get(i).getColisao(1))
				{
					System.out.print("COLISÃO SHA1"+" ");
				}	
				System.out.println(" ");
		}


	}
	//retorna índice
	public static int buscarNomeArquivo(List<Arquivo> lista, String nomeArquivo)
	{
		for(int i=0;i<lista.size();i++)
		{
			if(lista.get(i).getNomeArquivo().equals(nomeArquivo))
			{
				return i;
			}
		}
		//não achou
		return -1;
	}
	public static int buscarDigest(List<Arquivo> lista, String digest,int tipo)
	{
		for(int i=0;i<lista.size();i++)
		{
			if(lista.get(i).getDigest(tipo).equals(digest))
				//if(lista.get(i).getDigest(tipo).equals(digest)&& !lista.get(i).getStatus().equals("COLISION"))  //PERGUNTAR AO PROFESSOR
			{
				return i;
			}
		}
		//não achou
		return -1;
	}

	public static void validarDigestsDaLinhaDeComando(List<Arquivo> lista)
	{

		for(int i=0;i<lista.size();i++)
		{			
			for(int j=0;j<lista.size();j++) 
			{

				String digest = lista.get(i).getDigest(tipo_Digest);
				if(lista.get(j).getDigest(tipo_Digest).equals(digest))
				{
					
					if(i!=j)
					{
						lista.get(i).setColisao(tipo_Digest, true);
						lista.get(j).setColisao(tipo_Digest, true);						
					}
					
				}
				else
				{
					String arquivo = lista.get(i).getNomeArquivo();
					if(lista.get(j).getNomeArquivo().equals(arquivo))
					{
						//DIGESTS DIFERENTES, NOME ARQUIVO IGUAL
						//vou considerar "not ok" na comparação dos digests.
						lista.get(i).setStatus("NOT OK");
						lista.get(j).setStatus("NOT OK");
					}

				}
			}

		}
	}
	
	public static void validarDigestsDaListaDeArquivo(List<Arquivo> lista)
	{

		//aqui é necessário ver os dois tipos de digests
		//implementar
		for(int i=0;i<lista.size();i++)
		{			
			for(int j=0;i<lista.size();j++) 
			{

				String digest0 = lista.get(i).getDigest(0);
				if(digest0!=null)
				{
					if(lista.get(j).getDigest(0).equals(digest0))
					{
						//como i começa logo após o índice encontrado do arquivo, este i aqui já é a colisão
						if(i!=j)
						{
							lista.get(i).setColisao(0, true);
							lista.get(j).setColisao(0, true);						
						}
					}
				}
				
				//compara os dois tipos de Digests
				String digest1 = lista.get(i).getDigest(1);
				if(digest1!=null)
				{
					if(lista.get(j).getDigest(1).equals(digest1))
					{
					
						if(i!=j)
						{
							lista.get(i).setColisao(1, true);
							lista.get(j).setColisao(1, true);	
						}
					}
				}
			}

		}
	}

	public static void validarDigestsDaLinhaDeComandoComAListaDeDigests(List<Arquivo> ArquivosLinhaComandoValidados, List<Arquivo> ArquivosListaDigests)
	{

		for(int i=0;i<ArquivosLinhaComandoValidados.size();i++)
		{
			for(int j=0;i<ArquivosListaDigests.size();j++)
			{			
				String digest = ArquivosLinhaComandoValidados.get(i).getDigest(tipo_Digest);
				String arquivo = ArquivosLinhaComandoValidados.get(i).getNomeArquivo();
							
				
				if(ArquivosListaDigests.get(j).getNomeArquivo().equals(arquivo))
				{
					//status ok Digest e arquivo iguais
					if(ArquivosListaDigests.get(j).getDigest(tipo_Digest).equals(digest))
					{
						if(ArquivosLinhaComandoValidados.get(i).getColisao(tipo_Digest)) //colide
						{
							//tipo de digest colide nos arquivos da linha de comando
							ArquivosListaDigests.get(j).setColisao(tipo_Digest, true);
						}
						else
						{
							ArquivosListaDigests.get(j).setColisao(tipo_Digest, false);
							ArquivosListaDigests.get(j).setStatus("OK");
						}
					}
					else
					{
						ArquivosListaDigests.get(j).setStatus("NOT OK");
					}
					
					
					
				}
				else
				{
					//arquivo não encontrado
					if(ArquivosLinhaComandoValidados.get(i).getColisao(tipo_Digest)) //colide
					{
						//tipo de digest colide nos arquivos da linha de comando
						ArquivosListaDigests.get(j).setColisao(tipo_Digest, true);
					}
					else
					{
						ArquivosListaDigests.get(j).setColisao(tipo_Digest, false);
						ArquivosListaDigests.get(j).setStatus("NOT FOUND");
					}
					
				}
				
			}
		}
	}

	public static void gravaNotFound(String nomeArquivoSaida,String nomeArquivo, String tipoDigest, String digest, String status) throws IOException { 
		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(nomeArquivoSaida,true)); 
		buffWrite.append(nomeArquivo +" "+ tipoDigest+" " +digest + " " + status); 
		buffWrite.newLine();
		buffWrite.close(); 
		buffWrite.
	}



   if()

	@SuppressWarnings("unused")
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub


		//LEITURA E VERIFICAÇÃO DOS PARÂMETROS PASSADOS
		if(validarArgumentos(args.length));

		//VERIFICANDO O PARÂMETRO 1  -TIPO DO DIGEST

		tipo_Digest=validarTipoDigest(args[0].toString());

		//pega o último parâmetro como a lista de Digests calculados		
		String Caminho_ArqListaDigest=args[(args.length)-1].toString();

		//System.out.println("Imprime parâmetros passados");
		if(tipo_Digest==0)
		{
			//System.out.println("Tipo_Digest: MD5");
			tpDigests="MD5";

		}
		if(tipo_Digest==1)
		{
			//System.out.println("Tipo_Digest: SHA1");
			tpDigests="SHA1";
		}
		if(tipo_Digest==-1)
		{
			System.out.println("Houve Erro no tipo de Digest");
		}

		System.out.println("Caminho_ArqListaDigest " + Caminho_ArqListaDigest);

		//  Arquivo arquivo=new Arquivo();
		List<Arquivo> arrayArquivosLista=new ArrayList<Arquivo>();

		//leitura dos parâmetros
		for(int i=1;i<(args.length)-1;i++)
		{
			arrayArquivosLista.add(lerArquivoCarregado(args[i],tipo_Digest));
		}

		validarDigestsDaLinhaDeComando(arrayArquivosLista);
		//validarDigestsDaListaDeArquivo(arrayArquivosLista);
		
		exibirLista(arrayArquivosLista);
		
		List<Arquivo> arrayListaDigests=new ArrayList<Arquivo>();
		arrayListaDigests = carregarListaDigest(Caminho_ArqListaDigest);
		if(arrayListaDigests.size()==0)
		{
			for(int i=0;i<arrayArquivosLista.size();i++)
			{
				if(!(arrayArquivosLista.get(i).getColisao(0) && (arrayArquivosLista.get(i).getColisao(1))) )
				{
					arrayArquivosLista.get(i).setStatus("NOT FOUND");
					gravaNotFound("C:\\FONTES\\FONTES\\ListaDigests2.txt",arrayArquivosLista.get(i).getNomeArquivo(), tpDigests, arrayArquivosLista.get(i).getDigest(tipo_Digest),arrayArquivosLista.get(i).getStatus());
				}
				
			}
		}
		else{
			for(int i=0;i<arrayArquivosLista.size();i++)
			{
				if(arrayArquivosLista.get(i).getStatus().equals("NOT FOUND"))
				{
					gravaNotFound("C:\\FONTES\\FONTES\\ListaDigests2.txt",arrayArquivosLista.get(i).getNomeArquivo(), tpDigests, arrayArquivosLista.get(i).getDigest(tipo_Digest),arrayArquivosLista.get(i).getStatus());
				}
			}
		}
		
		
		
		
	}
}
		
		

/*
 * 
 *
 * OK = Status do arquivo cujo digest calculado é igual ao digest fornecido no arquivo
			ArqListaDigest e não colide com o digist de outro arquivo na linha de comando.
			NOT OK = Status do arquivo cujo digest não é igual ao digest fornecido no arquivo
			ArqListaDigest e não colide com o digist de outro arquivo na linha de comando..
			NOT FOUND = Status do arquivo cujo digest não foi encontrado no arquivo ArqListaDigest e
			não colide com o digest de outro arquivo na linha de comando.
			COLISION = Status do arquivo cujo digest calculado colide com o digest de outro arquivo de
			nome diferente encontrado no arquivo ArqListaDigest ou com o digest de um dos arquivos
			fornecidos na linha de comando.




		}
 */