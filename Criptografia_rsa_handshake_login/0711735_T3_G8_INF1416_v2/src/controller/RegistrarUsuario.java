package controller;

import dao.UsuarioDAO;
import model.Usuario;


public class RegistrarUsuario {

    Usuario usuario = new Usuario();

    public RegistrarUsuario() {
    }

    public boolean senhaValida(String senha) {
        if (tamanhoESohNumeros(senha)) 
        {
        	System.out.println("A senha contém 6 números números");
                if (verificarDigitosConsecutivos(senha)) {
                	System.out.println("a senha não contem digitos consecutivos");
                    return true;
                }
          }
        else
        {
        	System.out.println("a senha não tem o tamanho certo ou não contém só digitos ");
        }
        
        
        return false;
    }

    //verificar
    public static boolean tamanhoESohNumeros(String str) {
        return str.matches("\\d{6}");
    }

      
    public static boolean verificarDigitosConsecutivos(String str) {

        int i = 0;
        int count = 0;
        while (str.length() > i && i != 5) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            }
            i++;
        }

        if (count == 0) {
            
        	return true;
        } else {
            return false;
        }

    }

    public boolean verificarLogin(String login) {
        usuario = UsuarioDAO.consultarUsuario(login);
        if (usuario == null) {
            System.out.println("O login é valido");
        	return true;
        }
        System.out.println("O login NÃO é valido");
        return false;
    }

    public boolean confirmarSenhas(String senha, String senhaConfimada) {
        if (senha.equals(senhaConfimada)) {
        	System.out.println("As senhas foram confirmadas");
        	return true;
        }
        System.out.println("As senhas não foram confirmadas");
        return false;
    }
      
   
    
    public void salvarUsuario(Usuario usuario, String caminhoChavePublica) throws Exception
    {   
        UsuarioDAO.incluirUsuario(usuario,caminhoChavePublica);
    }
}
