package t2Seguranca;

import java.security.MessageDigest;

public class CalcularDigest {
	byte[] mensagem;
	String tipoDigest="";
	MessageDigest messageDigest;
	String hexDigestGerado="";
	public CalcularDigest(){
		
	}

	public String calcularDigest(String mensagem,String tipoDigest) throws Exception
	{
		this.mensagem=mensagem.getBytes("UTF8");
		this.messageDigest = MessageDigest.getInstance(tipoDigest);
		
		this.messageDigest.update( this.mensagem);
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
}
