
package controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.util.ArrayList;
import java.util.List;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

import Principal.PersistenciaDados;
import dao.RegistroDAO;
import dao.UsuarioDAO;
import model.Usuario;


public class ValidarSenha {

	List<String> senhaCapturada = new ArrayList<String>();
	List<String> digitosPressionados;
	static List<String> vetorSenhasCandidatas = new ArrayList<String>();
    
	public ValidarSenha(List<String> senhaCapturada) {
        this.senhaCapturada = senhaCapturada;
     }

    public boolean verificarSenha() {

    	List<String> digitosPressionados = limparSenhaCapturada(this.senhaCapturada);
        this.digitosPressionados = digitosPressionados;
        Usuario usuarioLogado = PersistenciaDados.getInstance().getUsuarioLogado();
        String loginAtual = usuarioLogado.getLogin();
        int salt = usuarioLogado.getSalt();
        
        System.out.println("SALT " + salt);
      //  System.out.println("Digitos pressionados " + digitosPressionados);
        //preenche vetor com senhas candidatas
        GerarSenhasCandidatas(digitosPressionados);
       
        for (int i = 0; i < vetorSenhasCandidatas.size(); i++)
        {
        	//System.out.println("Senha Candidata " + vetorSenhasCandidatas.get(i));
            //String senhaCandidata = vetorSenhasCandidatas.get(i);
            
               // System.out.println("Senha Candidata " + vetorSenhasCandidatas.get(i));
               // System.out.println("salt " + salt);
                String hash = null;
				
                try {
					hash = PersistenciaDados.gerarSenhaComHash(vetorSenhasCandidatas.get(i), salt);
					//System.out.println("Para a senha candidata " + vetorSenhasCandidatas.get(i) + "Configurada  "+ hash);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

            	//System.out.println("Senha Candidata com hash " + hash);
                if (hash.equals(usuarioLogado.getSenha())) {
                	RegistroDAO.incluirRegistroLogin(3002, usuarioLogado.getIdUsuario());
                	RegistroDAO.incluirRegistroLogin(3003, usuarioLogado.getIdUsuario());
                    usuarioLogado.setTentativas_senha(0);
                    return true;
                }
        }
        
        RegistroDAO.incluirRegistroLogin(3004, usuarioLogado.getIdUsuario());
        switch (usuarioLogado.getTentativas_senha())
        {
            case 1:
            	RegistroDAO.incluirRegistroLogin(3005, usuarioLogado.getIdUsuario());
                break;
            case 2:
            	RegistroDAO.incluirRegistroLogin(3006, usuarioLogado.getIdUsuario());
                break;
            case 3:
                RegistroDAO.incluirRegistroLogin(3007, usuarioLogado.getIdUsuario());
                break;
        }
        UsuarioDAO.atualizaNumeroTentativas(2, usuarioLogado);
        return false;
    }

    public List<String> limparSenhaCapturada(List<String> senhaCapturada) {
    	List<String> auxSenha = new ArrayList<String>();
        for (int i = 0; i < 6; i++) {
        	auxSenha.add(2*i, senhaCapturada.get(i).substring(0, 1));
        	auxSenha.add(2*i+1,senhaCapturada.get(i).substring(5));
        }
        return auxSenha;
    }
    public void GerarSenhasCandidatas(List<String> digitosPressionados) {
		// TODO Auto-generated constructor stub
    	
		Arvore arv1 = Arvore.CriarArvore ( digitosPressionados, 0);
		Arvore arv2 = Arvore.CriarArvore ( digitosPressionados, 1);
		
		arv1.armazenarSenhasGeradas(arv1.root,vetorSenhasCandidatas); //0
		arv2.armazenarSenhasGeradas(arv2.root,vetorSenhasCandidatas); //1
		
		
	}

    
}




