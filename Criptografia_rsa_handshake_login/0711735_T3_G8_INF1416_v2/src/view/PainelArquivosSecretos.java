/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import Principal.PersistenciaDados;
import model.Usuario;
import controller.Cida;
import dao.RegistroDAO;


@SuppressWarnings("serial")
public class PainelArquivosSecretos extends JPanel implements ActionListener {

	private JFrame mainFrame;
	private JLabel loginLabel;
	private JLabel groupLabel;
	private JLabel nameLabel;
	private JLabel totalSearchLabel;
	private JLabel loginText;
	private JLabel groupText;
	private JLabel nameText;

	private JTextField caminhoToken;
	private JLabel totalSearchText;
	private JLabel caminhoTokenLabel;
	private JButton listButton;
	private JButton backButton;
	private java.awt.List list;


	public PainelArquivosSecretos(JFrame mainFrame) {
		this.mainFrame = mainFrame;
		mainFrame.setSize(700, 700);

		Usuario usuarioLogado = PersistenciaDados.getInstance().getUsuarioLogado();

		loginLabel = new JLabel("Login: ");
		groupLabel = new JLabel("Grupo: ");
		nameLabel = new JLabel("Nome: ");
		totalSearchLabel = new JLabel("Total de consultas do usuario: ");

		loginText = new JLabel("{login}");
		loginText.setText(usuarioLogado.getLogin());

		groupText = new JLabel("{Grupo}");
		groupText.setText(usuarioLogado.getGroupName().toString());

		nameText = new JLabel("{Nome}");
		nameText.setText(usuarioLogado.getNomeUsuario());


		totalSearchText = new JLabel(String.valueOf(usuarioLogado.getTotalAcessosUsuario()));
		caminhoTokenLabel = new JLabel("Caminho da pasta de arquivos: ");


		list = new java.awt.List() ;
		JScrollPane jscroll = new JScrollPane(list);
		jscroll.getVerticalScrollBar().addAdjustmentListener(new AdjustmentListener() {
			@Override
			public void adjustmentValueChanged(AdjustmentEvent e) {
				e.getAdjustable().setValue(e.getAdjustable().getMaximum());
			}
		});

		list.setVisible(false);

		
		caminhoToken = new JTextField(30);
		

		listButton = new JButton("Listar");
		listButton.addActionListener(this);
		backButton = new JButton("Voltar para o menu");
		backButton.addActionListener(this);

		this.add(loginLabel);
		this.add(loginText);
		this.add(groupLabel);
		this.add(groupText);
		this.add(nameLabel);
		this.add(nameText);
		this.add(totalSearchLabel);
		this.add(totalSearchText);

		this.add(caminhoTokenLabel);
		this.add(caminhoToken);

		this.add(listButton);
		this.add(backButton);

		this.add(list);
		RegistroDAO.incluirRegistroLogin(8001, usuarioLogado.getIdUsuario());

	}

	public void actionPerformed(ActionEvent e) {
		Usuario usuarioLogado = PersistenciaDados.getInstance().getUsuarioLogado();
		String conteudoIndex;
		switch (e.getActionCommand()) {
		case "Listar":
			int totalAcessos = 0;
			PersistenciaDados.getInstance().getUsuarioLogado().setTotalAcessosUsuario(totalAcessos);

			Cida listarArquivos = new Cida();

			//retorna uma string completa com a lista de arquivos secretos
			conteudoIndex = listarArquivos.carregarStatusArquivo(caminhoToken.getText(),"index" );
			
			
			if(conteudoIndex.equals("Error!") || conteudoIndex.equals("NOT OK"))
				JOptionPane.showMessageDialog(mainFrame, "Não pode decriptar o arquivo de index", "Erro", JOptionPane.ERROR_MESSAGE);


			List<String> array = null;
			try {
				array = limparEOL(conteudoIndex);
			} catch (FileNotFoundException ex) {
				Logger.getLogger(PainelArquivosSecretos.class.getName()).log(Level.SEVERE, null, ex);
			} catch (IOException ex) {
				Logger.getLogger(PainelArquivosSecretos.class.getName()).log(Level.SEVERE, null, ex);
			}

			// Monta lista a ser exibida, verificando o status do arquivo
			for (int i = 0; i<array.size(); i++)
			{
				String n = array.get(i);
				String [] a = n.split(" ");
				String nomeFake = a[1];
				String statusArq = listarArquivos.carregarStatusArquivo(caminhoToken.getText(),nomeFake );
				if(statusArq.equals("Error"))
					statusArq = "NOT OK";
				String nomeFinal = n + " " + statusArq;
				list.add(nomeFinal);
			}

			
			this.add(list);
			list.setVisible(true);
			list.addItemListener(new ItemListener() {

				@Override
				public void itemStateChanged(ItemEvent e) {
					Usuario usuarioLogado = PersistenciaDados.getInstance().getUsuarioLogado();
					Cida listFiles = null;
					
					listFiles = new Cida();
					
					JOptionPane.showConfirmDialog(groupText, list.getSelectedItem());
					String [] a = list.getSelectedItem().split(" ");
					String nomeSecreto = a[0];
					String nomeFalsoDoArqSecreto = a[1];
					PersistenciaDados.getInstance().addCaminhoArquivos(caminhoToken.getText() + "\\" + nomeSecreto);
					RegistroDAO.incluirRegistroArquivo(8003, usuarioLogado.getIdUsuario(), nomeSecreto);
					byte[] contentFile=null;
					contentFile = listFiles.carregarConteudoBytesArquivo(caminhoToken.getText(),nomeFalsoDoArqSecreto);
					String statusArq = Cida.statusArquivo;

					if(statusArq.equals("NOT OK")){
						RegistroDAO.incluirRegistroArquivo(8007, usuarioLogado.getIdUsuario(), nomeSecreto);
					}
					else
					{
						RegistroDAO.incluirRegistroArquivo(8005, usuarioLogado.getIdUsuario(), nomeSecreto);
					}

					try {
						if(!statusArq.equals("NOT OK")){                       
							//mostra conteúdo decriptado do arquivo selecionado
							try (FileOutputStream output = new FileOutputStream(caminhoToken.getText() + "\\" + nomeSecreto)) {
								output.write(contentFile);
								RegistroDAO.incluirRegistroArquivo(8004, usuarioLogado.getIdUsuario(), nomeSecreto);
							} 
						}
						else{
							RegistroDAO.incluirRegistroArquivo(8006, usuarioLogado.getIdUsuario(), nomeSecreto);
						}

					} catch (IOException ex) {
						Logger.getLogger(PainelArquivosSecretos.class.getName()).log(Level.SEVERE, null, ex);
					}



				}
			});
			mainFrame.repaint();
			mainFrame.validate();


			break;
		case "Voltar para o menu":
			RegistroDAO.incluirRegistroLogin(8002, usuarioLogado.getIdUsuario());
			Menu menuPainel = new Menu(mainFrame);
			mainFrame.setContentPane(menuPainel);
			mainFrame.repaint();
			mainFrame.validate();
			break;
		default:
			break;

		}
	}

	public List<String> limparEOL(String conteudoCarregado) throws FileNotFoundException, IOException {
		//limpa as quebras de linhas do conteúdo do index.enc
		List<String> listArray = new ArrayList<>();
		String[] resultados = conteudoCarregado.split("\n");
		for (int x = 0; x < resultados.length; x++) {
			listArray.add(resultados[x]);
		}

		return listArray;
	}

}
