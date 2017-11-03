
package model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

@SuppressWarnings("serial")
@Entity
@Table(name="Registro")
public class Registro implements Serializable{   
    
    @Id 
    @GeneratedValue (strategy=GenerationType.AUTO)
    @Column(name = "idRegistro")
    private int idRegistro;

    @Column(name = "dataRegistro")
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dataRegistro;

    @Column(name = "idMensagem")
    private int idMensagem;
    
    @Column(name = "idUsuario")
    private int idUsuario;
    
    @Column(name = "arquivo")
    private String arquivo;
    
    //campo utilizado para registrar tentativas de login inexistente
    @Column(name = "auxLogin")
    private String auxLogin;
  
    public String getAuxLogin() {
		return auxLogin;
	}


	public void setAuxLogin(String auxLogin) {
		this.auxLogin = auxLogin;
	}


	public Date getDataRegistro() {
		return dataRegistro;
	}


	public void setDataRegistro(Date dataRegistro) {
		this.dataRegistro = dataRegistro;
	}


	public String getArquivo() {
        return arquivo;
    }

 
    public void setArquivo(String arquivo) {
        this.arquivo = arquivo;
    }


    public int getIdUsuario() {
		return idUsuario;
	}


	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}


	public int getIdRegistro() {
		return idRegistro;
	}

	public void setIdRegistro(int idRegistro) {
		this.idRegistro = idRegistro;
	}

	public int getIdMensagem() {
		return idMensagem;
	}

	public void setIdMensagem(int idMensagem) {
		this.idMensagem = idMensagem;
	}

	
    
}
