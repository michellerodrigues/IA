/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutionException;

import view.Login;
import view.TelaPrincipal;
import dao.RegistroDAO;


public class Main {
    
    public static void main(String args[]) throws InterruptedException, ExecutionException, InvocationTargetException
    {
        RegistroDAO.incluirRegistroMsgId(1001);
        
        TelaPrincipal mainframe = new TelaPrincipal();
        /*Na primeira etapa de autentica��o, deve-se solicitar a identifica��o do usu�rio (login name)
no sistema.*/
        Login login = new Login();      
    }
    
}
