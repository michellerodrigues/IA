package view;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Principal.PersistenciaDados;
import controller.ValidarSenha;
import dao.RegistroDAO;
import dao.UsuarioDAO;
import model.Usuario;

/*
 * Na segunda etapa, deve-se verificar a senha pessoal do usuário (algo que ele conhece)
fornecida através de um teclado virtual numérico com 5 botões, cada um com dois dígitos, que
são selecionados aleatoriamente e sem repetição entre todos os botões. Após cada clique em um
botão de dígitos, o sistema deve redistribuir os dígitos entre os 5 botões aleatoriamente. As
senhas pessoais são sempre formadas por 6 dígitos. Se a verificação for negativa, o usuário deve
ser apropriadamente avisado e o processo deve contabilizar um erro de verificação de senha
pessoal. Após três erros consecutivos sem que ocorra uma verificação positiva entre os erros,
deve-se seguir para a etapa 1 e o acesso do usuário deve ser bloqueado por 2 minutos (outros
usuários poderão tentar ter acesso). Se a verificação for positiva, o processo deve seguir para a
terceira etapa.
 * 
 * */
@SuppressWarnings("serial")
public class PainelSenha extends JPanel implements ActionListener {

    private JButton[] botoesSenha;
    private JLabel messageLabel;
    private JFrame mainFrame;
    private JLabel senhaLabel;

    //para cada botão da senha, 2 possibildiades, armazenadas como "x ou y"
    List<String> vetSenha = new ArrayList<String>();
    int idx = 0;
    List<String> ListaTxtBtSenha = randomizarListaTxtBtSenha();
    int indexSenha;
    Usuario usuarioLogado = PersistenciaDados.getInstance().getUsuarioLogado();


    public PainelSenha(JFrame mainFrame) {

    
        this.mainFrame = mainFrame;
        this.mainFrame.setSize(450, 500);
        this.mainFrame.validate();
        messageLabel = new JLabel("Atenção: digite a sua senha eletrônica\n"
                + "no teclado abaixo:");
        
        senhaLabel = new JLabel("");
        
        botoesSenha = new JButton[5];
        
        this.indexSenha = 0;
        this.add(messageLabel);  
        for (int i = 0; i < botoesSenha.length; i++) {            
        	botoesSenha[i] = new JButton();
            botoesSenha[i].addActionListener(this);
        	botoesSenha[i].setText(ListaTxtBtSenha.get(2*i) + " ou " + ListaTxtBtSenha.get(2*i+1));
            this.add(botoesSenha[i]);
        }

                
        this.add(senhaLabel, BorderLayout.CENTER);
        RegistroDAO.incluirRegistroLogin(3001, usuarioLogado.getIdUsuario());

    }

    @Override
    public void actionPerformed(ActionEvent e) {       
        
        this.indexSenha++;
        this.senhaLabel.setText(senhaLabel.getText() + "*");
        vetSenha.add(idx, e.getActionCommand());
        idx++;
       
        this.ListaTxtBtSenha = randomizarListaTxtBtSenha();
        for (int i = 0; i <botoesSenha.length; i++) {
            botoesSenha[i].setText(this.ListaTxtBtSenha.get(2*i) + " ou " + this.ListaTxtBtSenha.get(2*i + 1));
        }
        
        
        if (indexSenha > 5) {
            for (int i = 0; i < 5; i++)
                botoesSenha[i].setEnabled(false);
            
            ValidarSenha pwdController = new ValidarSenha(vetSenha);
            boolean checkPwd = pwdController.verificarSenha();

            if(checkPwd == true)
            {
            	Token tokenPainel = new Token(mainFrame);
                
                mainFrame.setContentPane(tokenPainel);
                mainFrame.repaint();
                mainFrame.validate();
            }
            else
            {
            	if(!UsuarioDAO.verificarBloqueio(usuarioLogado)){
                    JOptionPane.showMessageDialog(mainFrame, "Senha incorreta, tente novamente", "Erro", JOptionPane.ERROR_MESSAGE);
                    PainelSenha pwdPanel = new PainelSenha(mainFrame);
                    mainFrame.setContentPane(pwdPanel);
                    mainFrame.repaint();
                    mainFrame.validate();
                }
                else{
                    JOptionPane.showMessageDialog(mainFrame, "Senha incorreta, usuário bloqueado", "Erro", JOptionPane.ERROR_MESSAGE);
                    PainelPrincipal mainPanel = new PainelPrincipal(mainFrame);
                    mainFrame.setContentPane(mainPanel);
                    mainFrame.repaint();
                    mainFrame.validate();
                }
            }
        }
    }

    public static List<String> inicializarListaTxtBtSenha() {
        List<String> ListaTxtBtSenha = new ArrayList<>();
        
        for(Integer i=0; i<10; i++)
        {
        	ListaTxtBtSenha.add(i.toString());
        }
        
        return ListaTxtBtSenha;
    }

    public static List<String> randomizarListaTxtBtSenha() {
        List<String> ListaTxtBtSenha = inicializarListaTxtBtSenha();
        Collections.shuffle(ListaTxtBtSenha);

        return ListaTxtBtSenha;
    }
}




