package model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;


@Entity
@Table(name="Usuario")
public class Usuario {
    
    @Id 
    @GeneratedValue (strategy=GenerationType.AUTO)
    @Column(name = "idUsuario")
    private int idUsuario;
    
    @Column(name = "grupo")
    @Enumerated(EnumType.STRING)
    private Grupo groupName;
    
    @Column(name = "nomeUsuario")
    private String nomeUsuario;
    
    @Column(name = "login")
    private String login;
    
    @Column(name = "senha")
    private String senha;
    
    public String getFraseSecreta() {
		return fraseSecreta;
	}

	public void setFraseSecreta(String fraseSecreta) {
		this.fraseSecreta = fraseSecreta;
	}

	@Column(name = "fraseSecreta")
    private String fraseSecreta;
    
	
	@Column(name = "chavePublica")
	byte[] chavePublica;
	
	public byte[] getChavePublica() {
		return chavePublica;
	}

	public void setChavePublica(byte[] chavePublica) {
		this.chavePublica = chavePublica;
	}

	@Column(name = "descricaoUsuario")
    private String descricaoUsuario;
    
    
    @Column(name = "salt")
    private int salt;
    
    @Column(name = "tentativas_senha")
    private Integer tentativas_senha;
    
    @Column(name = "acessoBloqueado")
    private Boolean acessoBloqueado;
    
    @Column(name = "data_bloqueio")
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date data_bloqueio;

    
    @Column(name = "totalAcessosUsuario")
    private Integer totalAcessosUsuario;
    
        
    public Integer getTotalAcessosUsuario() {
		return totalAcessosUsuario;
	}

	public void setTotalAcessosUsuario(Integer totalAcessos) {
		totalAcessos++;
		this.totalAcessosUsuario = totalAcessos;
	}

	
	public String getDescricaoUsuario() {
		return descricaoUsuario;
	}

	public void setDescricaoUsuario(String descricaoUsuario) {
		this.descricaoUsuario = descricaoUsuario;
	}

	   
    public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Integer getTentativas_senha() {
		return tentativas_senha;
	}

	public void setTentativas_senha(Integer tentativas_senha) {
		this.tentativas_senha = tentativas_senha;
	}

	public Boolean getAcessoBloqueado() {
		return acessoBloqueado;
	}

	public void setAcessoBloqueado(Boolean acessoBloqueado) {
		this.acessoBloqueado = acessoBloqueado;
	}

	public Date getData_bloqueio() {
		return data_bloqueio;
	}

	public void setData_bloqueio(Date data_bloqueio) {
		this.data_bloqueio = data_bloqueio;
	}

	public String getCaminhoToken() {
		return caminhoToken;
	}

	public void setCaminhoToken(String caminhoToken) {
		this.caminhoToken = caminhoToken;
	}

    
    private String caminhoToken;
    
  
    
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

   
    public int getSalt() {
        return salt;
    }

    public void setSalt(int salt) {
        this.salt = salt;
    }

      public Grupo getGroupName() {
        return groupName;
    }

    public void setGroupName(Grupo group) {
        this.groupName = group;
    }  

    


}
