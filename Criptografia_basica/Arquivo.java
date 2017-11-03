package t2Seguranca;

public class Arquivo {

	private String nomeArquivo;
	private String mensagem;
	private String[] digest = new String[2];
	private String tipo0;
	private String tipo1;
	private boolean[] colisao= new boolean[2];
	
	private String status;
	private int numOcorrencia;
	
	public boolean getColisao(int index) {
		return colisao[index];
	}

	public void setColisao(int index, boolean cond) {
		this.colisao[index] = cond;
	}

	public String getTipo0() {
		return tipo0;
	}

	public void setTipo0(String tipo0) {
		this.tipo0 = tipo0;
	}

	public String getTipo1() {
		return tipo1;
	}

	public void setTipo1(String tipo1) {
		this.tipo1 = tipo1;
	}

	public String getStatus() {
		return status;
	}

	public int getNumOcorrencia() {
		return numOcorrencia;
	}

	public void setNumOcorrencia(int numOcorrencia) {
		this.numOcorrencia = numOcorrencia;
	}

	public void setStatus(String status) {
		this.status = status;
	}


	public String getDigest(int tipo) {
		return this.digest[tipo];
	}

	public void setDigest(int tipo, String digest) {
		this.digest[tipo] = digest;
	}

	public Arquivo(){
	}
	
	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public String getNomeArquivo() {
		return nomeArquivo;
	}

	public void setNomeArquivo(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}

}

