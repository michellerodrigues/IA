package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Principal.PersistenciaDados;
import dao.RegistroDAO;
import model.Grupo;
import model.Usuario;


@SuppressWarnings("serial")
public class Menu extends JPanel implements ActionListener{
   
    private JFrame mainFrame;
    private JLabel loginLabel;
    private JLabel groupLabel;
    private JLabel descriptionLabel;
    private JLabel accessLabel;
    private JLabel menuLabel;
    
    private JLabel loginText;
    private JLabel groupText;
    private JLabel descriptionText;
    private JLabel accessText;
    
    private JButton userRegButton;
    private JButton getUserFolderButton;
    private JButton ExitButton;
    
    Usuario usuarioLogado=null;

    public Menu (JFrame mainframe)
    {
    	usuarioLogado = PersistenciaDados.getInstance().getUsuarioLogado();
    	RegistroDAO.incluirRegistroLogin(5001,usuarioLogado.getIdUsuario());
        this.mainFrame = mainframe;
        this.mainFrame.setSize(500, 500);
        this.mainFrame.validate();
        
        
        loginLabel = new JLabel("Login: ");  
        
        groupLabel = new JLabel("Grupo: ");  
        						
        descriptionLabel = new JLabel("Descricao: ");
        						
        accessLabel = new JLabel("Total de acessos do usuario: ");   
        						accessText = new JLabel(String.valueOf(usuarioLogado.getTotalAcessosUsuario()));
        loginText = new JLabel(usuarioLogado.getLogin());  
        groupText = new JLabel(usuarioLogado.getGroupName().toString());  
        descriptionText = new JLabel(usuarioLogado.getDescricaoUsuario());  
        
        menuLabel = new JLabel("Menu Principal: ");
        

        userRegButton = new JButton("Cadastrar um novo usuario");
        getUserFolderButton = new JButton("Consultar pasta de arquivos secretos de um usuario");
        ExitButton = new JButton("Sair do Sistema");
        
        this.add(loginLabel);
        this.add(loginText);
        
        this.add(groupLabel);
        this.add(groupText);
        
        this.add(descriptionLabel);
        this.add(descriptionText);
        
        this.add(accessLabel);
        this.add(accessText);
        
        this.add(menuLabel);  
        
        if(usuarioLogado.getGroupName() != Grupo.ADMIN)
        {
            userRegButton.setVisible(false);
        }
        
        this.add(userRegButton);
        this.add(getUserFolderButton);
        this.add(ExitButton);
        
        userRegButton.addActionListener(this);
        getUserFolderButton.addActionListener(this);
        ExitButton.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        switch (e.getActionCommand()) {
            case "Cadastrar um novo usuario":
            	RegistroDAO.incluirRegistroLogin(5002, usuarioLogado.getIdUsuario());
                CadastrarUsuario userRegPanel = new CadastrarUsuario(mainFrame);                
                mainFrame.setContentPane(userRegPanel);
                mainFrame.repaint();
                mainFrame.validate();
                break;
            case "Consultar pasta de arquivos secretos de um usuario":
            	RegistroDAO.incluirRegistroLogin(5003, usuarioLogado.getIdUsuario());
                PainelArquivosSecretos painelArquivosSecretos = new PainelArquivosSecretos(mainFrame);               
                mainFrame.setContentPane(painelArquivosSecretos);
                mainFrame.repaint();
                mainFrame.validate();
                break;
            case "Sair do Sistema":
                RegistroDAO.incluirRegistroLogin(5005, usuarioLogado.getIdUsuario());
                Sair exitPanel = new Sair(mainFrame);
                mainFrame.setContentPane(exitPanel);
                mainFrame.repaint();
                mainFrame.validate();
                break;
            default:
                break;
            
        }
    }
    
}
