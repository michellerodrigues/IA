
package view;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.Usuario;
import controller.EfetuarLogin;
import dao.RegistroDAO;
import dao.UsuarioDAO;


@SuppressWarnings("serial")
public class PainelPrincipal extends JPanel implements ActionListener{
    
    private JButton btLogin;
    private JLabel loginLabel;
    private JTextField loginText;
    private JFrame telaPrincipal;

    //construtor
    public PainelPrincipal (JFrame telaPrincipal)
    {
        RegistroDAO.incluirRegistroMsgId(2001);
        this.telaPrincipal = telaPrincipal;
        loginLabel = new JLabel("Login:");
        loginText = new JTextField(15);
        btLogin = new JButton("Logar");
        
        this.setLayout(new FlowLayout());
        this.add(loginLabel);
        this.add(loginText);
        this.add(btLogin);
        btLogin.addActionListener(this);
    }
    
    public JTextField getLoginText() {
        return loginText;
    }

    public void setLoginText(JTextField loginText) {
        this.loginText = loginText;
    }

    public void actionPerformed(ActionEvent e) 
    {
        String login = this.getLoginText().getText();
        EfetuarLogin fazerLogin = new EfetuarLogin(login);
        
        if(fazerLogin.checkLogin(this) == true)
        {
        	//Caso contrário, o processo deve seguir para a segunda etapa. Pedir a Senha
        	//2a fase
            PainelSenha painelSenha = new PainelSenha(telaPrincipal);
            
            telaPrincipal.setContentPane(painelSenha);
            telaPrincipal.repaint();
            telaPrincipal.validate();
        }
        else{
            Usuario user = UsuarioDAO.consultarUsuario(login);
            //achou usuário
           
            /*Se a identificação for válida e o acesso do usuário
            estiver bloqueado, o mesmo deve ser apropriadamente avisado e o processo deve permanecer na
            primeira etapa*/
            if(user != null)
            {
                if(UsuarioDAO.verificarBloqueio(user))
                {
                	JOptionPane.showMessageDialog(telaPrincipal, "Usuario bloqueado", "Erro 2004", JOptionPane.ERROR_MESSAGE);
                }
                
            }
            else
            { 
            	JOptionPane.showMessageDialog(telaPrincipal, "Login Inválido", "Erro 2005", JOptionPane.WARNING_MESSAGE);
            }
            
        }
        
    }
}
