/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Principal.PersistenciaDados;
import controller.RegistrarUsuario;
import dao.RegistroDAO;
import dao.UsuarioDAO;
import model.Grupo;
import model.Usuario;

@SuppressWarnings("serial")
public class CadastrarUsuario extends JPanel implements ActionListener {

    private JFrame mainFrame;
    private JLabel loginLabel;
    private JLabel groupLabel;
    private JLabel nameLabel;
    private JLabel totalUserLabel;
    private JLabel formLabel;
    private JLabel loginText;
    private JLabel groupText;
    private JLabel nameText;
    private JLabel totalUserText;
    
    //campos do registro do novo usuário
    private JLabel nomeRegLabel;
    private JLabel loginRegLabel;
    private JLabel groupRegLabel;
    private JLabel senhaRegLabel;
    private JLabel senhaConfirmadaRegLabel;
    private JLabel caminhoChavePublicaLabel;
    private JLabel descricaoLabel;
    private JTextField nameRegText;
    private JTextField loginRegText;
    @SuppressWarnings("rawtypes")
	private JComboBox groupRegText;
    private JTextField caminhoChavePublicaText;
    private JTextField descricaoText;
    private JPasswordField senhaRegText;
    private JPasswordField senhaConfirmadaRegText;
    private JButton regButton;
    private JButton backButton;
    String[] Grupos = {"Selecione", Grupo.ADMIN.toString(), Grupo.USER.toString()};
    Usuario usuarioLogado =  PersistenciaDados.getInstance().getUsuarioLogado();

    @SuppressWarnings({ "unchecked", "rawtypes" })
	public CadastrarUsuario(JFrame mainFrame) {
        this.mainFrame = mainFrame;
        this.mainFrame.setSize(500, 500);
        this.mainFrame.validate();

        loginLabel = new JLabel("Login: ");
        groupLabel = new JLabel("Grupo: ");
        nameLabel = new JLabel("Nome: ");
        totalUserLabel = new JLabel("Total de usuarios no sistema: ");
        formLabel = new JLabel("Formulario de cadastro: ");

        
        loginText = new JLabel("login");
        loginText.setText(usuarioLogado.getLogin());  
        groupText = new JLabel("Grupo");
        groupText.setText(usuarioLogado.getGroupName().toString());
        nameText = new JLabel("Nome");
        nameText.setText(usuarioLogado.getNomeUsuario());
        totalUserText = new JLabel(String.valueOf(UsuarioDAO.totalUsuarios()));

        nomeRegLabel = new JLabel("Nome do Usuário: ");
        loginRegLabel = new JLabel("Login Name: ");
        groupRegLabel = new JLabel("Grupo: ");
        senhaRegLabel = new JLabel("Senha pessoal: ");
        senhaConfirmadaRegLabel = new JLabel("Confirmacao da senha pessoal: ");
        caminhoChavePublicaLabel = new JLabel("Caminho da chave Pública ");
        descricaoLabel = new JLabel("Descrição Usuário ");

        nameRegText = new JTextField(30);
        loginRegText = new JTextField(20);
        groupRegText = new JComboBox(Grupos);
        senhaRegText = new JPasswordField(6);
        senhaConfirmadaRegText = new JPasswordField(6);
        caminhoChavePublicaText = new JTextField(30);
        descricaoText = new JTextField(30);

        regButton = new JButton("Cadastrar");
        regButton.addActionListener(this);
        backButton = new JButton("Voltar para o menu");
        backButton.addActionListener(this);

        this.add(loginLabel);
        this.add(loginText);
        this.add(groupLabel);
        this.add(groupText);
        this.add(nameLabel);
        this.add(nameText);
        this.add(totalUserLabel);
        this.add(totalUserText);
        this.add(formLabel);

        this.add(nomeRegLabel);
        this.add(nameRegText);
        this.add(loginRegLabel);
        this.add(loginRegText);
        this.add(groupRegLabel);
        this.add(groupRegText);
        this.add(descricaoLabel);
        this.add(descricaoText);
        this.add(senhaRegLabel);
        this.add(senhaRegText);
        this.add(senhaConfirmadaRegLabel);
        this.add(senhaConfirmadaRegText);
        this.add(caminhoChavePublicaLabel);
        this.add(caminhoChavePublicaText);

        this.add(regButton);
        this.add(backButton);
        
        RegistroDAO.incluirRegistroLogin(6001, usuarioLogado.getIdUsuario());

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Cadastrar":
            	RegistroDAO.incluirRegistroLogin(6002, usuarioLogado.getIdUsuario());
                RegistrarUsuario userReg = new RegistrarUsuario();
                String senhaDigitada = new String(senhaRegText.getPassword());
                String senhaDigitadaConfirmacao = new String(senhaConfirmadaRegText.getPassword());
                 if(userReg.senhaValida(senhaDigitada)
                		&& userReg.verificarLogin(loginRegText.getText()) 
                		&& userReg.confirmarSenhas(senhaDigitada, senhaDigitadaConfirmacao) 
                		&& loginRegText.getText() != null && nameRegText.getText() != null 
                		&& groupRegText.getSelectedIndex()!=0 ) //selecione
                {
                    Usuario usuario = new Usuario();
                    usuario.setNomeUsuario(nameRegText.getText());
                    usuario.setLogin(loginRegText.getText());
                    usuario.setSenha(senhaDigitada);
                    usuario.setDescricaoUsuario(descricaoText.getText());
                    if(groupRegText.getSelectedIndex()==1)
                    	usuario.setGroupName(Grupo.ADMIN);
                    else
                    	usuario.setGroupName(Grupo.USER);               
                    try {
						userReg.salvarUsuario(usuario, caminhoChavePublicaText.getText());
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
                    JOptionPane.showMessageDialog(mainFrame, "Usuário criado com sucesso", "Erro", JOptionPane.PLAIN_MESSAGE);
                    mainFrame.setContentPane(new CadastrarUsuario(mainFrame));
                    mainFrame.repaint();
                    mainFrame.validate();
                }
                
                else
                {
                    JOptionPane.showMessageDialog(mainFrame, "Dados incorretos, favor fericiar as informações", "Erro", JOptionPane.ERROR_MESSAGE);
                }
                
                
                break;
            case "Voltar para o menu":
                RegistroDAO.incluirRegistroLogin(6003, usuarioLogado.getIdUsuario());
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
