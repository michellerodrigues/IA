package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Principal.PersistenciaDados;
import model.Usuario;
import controller.Cida;
import controller.ValidarSenha;
import dao.RegistroDAO;
import dao.UsuarioDAO;


@SuppressWarnings("serial")
public class Token extends JPanel implements ActionListener{

	private JFrame mainFrame;
	private JLabel mensagemKey;
	private JLabel mensagemFraseSecreta;
	private JButton btKey;
	private JTextField caminhoChavePrivada;
	private JTextField FraseSecretaTxt;
	String fraseSecreta="";
	String caminhoChavePrivadaString="";

	Usuario usuarioLogado = PersistenciaDados.getInstance().getUsuarioLogado();



	public Token (JFrame mainFrame)
	{
		this.mainFrame = mainFrame;

		this.mainFrame = mainFrame;
		this.mainFrame.setSize(450, 500);
		this.mainFrame.validate();
		mensagemKey = new JLabel("Digite o caminho completo da chave privada");
		mensagemFraseSecreta = new JLabel("Digite a frase secreta");

		fraseSecreta = usuarioLogado.getFraseSecreta();

		caminhoChavePrivada = new JTextField(30);
		btKey = new JButton("Validar");
		btKey.addActionListener(this);
		FraseSecretaTxt= new JTextField(30);

		this.add(mensagemKey);
		this.add(caminhoChavePrivada);
		this.add(mensagemFraseSecreta);
		this.add(FraseSecretaTxt);
		this.add(btKey);
		RegistroDAO.incluirRegistroLogin(4001, usuarioLogado.getIdUsuario());

	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		/*Na terceira e última etapa de autenticação, deve-se verificar a chave privada do usuário
	que se encontra criptografada em um arquivo presente no token do usuário. O sistema deve
	receber o caminho para o arquivo da chave privada e a frase secreta para geração da chave
	simétrica de decriptação.*/	

		fraseSecreta = FraseSecretaTxt.getText();
		if(FraseSecretaTxt.getText().equals(fraseSecreta) && !caminhoChavePrivada.getText().equals(""))
		{
			try {
				if(Cida.verificarChavePrivada(caminhoChavePrivada.getText(), fraseSecreta))
				{
					PersistenciaDados.getInstance();
					//vai para o menu
					PersistenciaDados.setFraseSecretaCorreta(fraseSecreta);
	            	Menu menuPainel = new Menu(mainFrame);
	                
	                mainFrame.setContentPane(menuPainel);
	                mainFrame.repaint();
	                mainFrame.validate();
	                
				}
				else
				{
					//contabiliza erro
					if(!UsuarioDAO.verificarBloqueio(usuarioLogado)){
	                    JOptionPane.showMessageDialog(mainFrame, "Chave privada incorreta, tente novamente", "Erro", JOptionPane.ERROR_MESSAGE);
	                    Token painelToken = new Token(mainFrame);
	                    mainFrame.setContentPane(painelToken);
	                    mainFrame.repaint();
	                    mainFrame.validate();
	                }
	                else
	                {
	                    JOptionPane.showMessageDialog(mainFrame, "Chave privada incorreta, usuário bloqueado", "Erro", JOptionPane.ERROR_MESSAGE);
	                    PainelPrincipal mainPanel = new PainelPrincipal(mainFrame);
	                    mainFrame.setContentPane(mainPanel);
	                    mainFrame.repaint();
	                    mainFrame.validate();
	                }
				}
			} catch (InvalidKeyException  
					| NoSuchAlgorithmException | NoSuchPaddingException
					| BadPaddingException | IllegalBlockSizeException
					| InvalidKeySpecException | SignatureException
					| IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}      	   	
}



