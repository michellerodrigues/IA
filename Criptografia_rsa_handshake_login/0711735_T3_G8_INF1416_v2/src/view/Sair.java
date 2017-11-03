package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Principal.PersistenciaDados;
import dao.RegistroDAO;
import model.Usuario;


@SuppressWarnings("serial")
public class Sair extends JPanel implements ActionListener{
    
    private JFrame mainFrame;
    private JLabel loginLabel;
    private JLabel groupLabel;
    private JLabel nameLabel;
    private JLabel accessLabel;
    
    private JLabel loginText;
    private JLabel groupText;
    private JLabel nameText;
    private JLabel accessText;
    private JLabel exitLabel;
    private JLabel exitMessageLabel;
    
    private JButton exitButton;
    private JButton backButton;
    public List<String> listaDeArq;
    Usuario usuarioLogado = PersistenciaDados.getInstance().getUsuarioLogado();
    String loginAtual = usuarioLogado.getLogin();
    public Sair (JFrame mainFrame)
    {
        this.mainFrame = mainFrame;
        
        listaDeArq = new ArrayList<String>();
        
        loginLabel = new JLabel("Login: ");
        groupLabel = new JLabel("Grupo: ");
        nameLabel = new JLabel("Nome: ");
        accessLabel = new JLabel("Total de acessos do usuario: ");
        
       
        loginText = new JLabel("login");
        loginText.setText(loginAtual);
        
        groupText = new JLabel("Grupo");
        groupText.setText(usuarioLogado.getGroupName().toString());

        nameText = new JLabel("Nome");
        nameText.setText(usuarioLogado.getNomeUsuario());
        accessText = new JLabel(String.valueOf(usuarioLogado.getTotalAcessosUsuario()));
        
        exitLabel = new JLabel("Saida do sistema:");
        exitMessageLabel = new JLabel("Pressione o Botao Sair para apagar os arquivos decriptados e encerrar o sistema.");
        
        exitButton = new JButton("Sair");
        exitButton.addActionListener(this);
        backButton = new JButton("Voltar para o menu");
        backButton.addActionListener(this);
        
        this.add(loginLabel);
        this.add(loginText);
        
        this.add(groupLabel);
        this.add(groupText);
        
        this.add(nameLabel);
        this.add(nameText);
        
        this.add(accessLabel);
        this.add(accessText);
        
        this.add(exitLabel);
        this.add(exitMessageLabel);
        
        this.add(exitButton);
        this.add(backButton);
        RegistroDAO.incluirRegistroLogin(9001, usuarioLogado.getIdUsuario());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Sair":
            	RegistroDAO.incluirRegistroLogin(9002, usuarioLogado.getIdUsuario());
                for (String path : PersistenciaDados.getInstance().getCaminhoArquivos()){              
                    File file = new File(path);
                    file.delete();
                    RegistroDAO.incluirRegistroLogin(9004, usuarioLogado.getIdUsuario());
                }
                RegistroDAO.incluirRegistroLogin(1002, usuarioLogado.getIdUsuario());
                System.exit(0);
                break;
            case "Voltar para o menu":
            	RegistroDAO.incluirRegistroLogin(9003, usuarioLogado.getIdUsuario());
                Menu menuPanel = new Menu(mainFrame);
                mainFrame.setContentPane(menuPanel);
                mainFrame.repaint();
                mainFrame.validate();
                break;
            default:
                break;
        }
    }
    
}
