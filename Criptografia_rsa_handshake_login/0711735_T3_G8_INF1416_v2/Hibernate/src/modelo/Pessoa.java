package modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "CADASTRO")
public class Pessoa implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8831897873330648202L;
	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	@Column(name = "ID")
	private int id;
	@Column(name = "NOME")
	private String nome;
	@Column(name = "ENDERECO")
	private String endereco;
	@Column(name = "TELEFONE")
	private String telefone;
	public Pessoa() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Column(name = "IP")
	private String ip;
	
	private int []vetIds;
	
	public int[] getVetIds() {
		return vetIds;
	}

	public void setVetIds(int[] vetIds) {
		this.vetIds = vetIds;
	}

	public Pessoa(String nome2, String endereco2, String telefone2, String ip2) {
		this.nome = nome2;
		this.endereco = endereco2;
		this.telefone = telefone2;
		this.ip = ip2;
	}

	//usado para deletar
	public Pessoa(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}
}
