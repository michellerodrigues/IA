package view;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import dao.MensagemDAO;
import dao.RegistroDAO;
import dao.UsuarioDAO;
import model.Registro;
import model.Usuario;


@SuppressWarnings("serial")
public class Login extends JFrame{

	private PainelLog logview;
	private JTable tabelaLog;


	public Login () throws InterruptedException, ExecutionException
	{
		this.setTitle("Login");
		this.setLocation(580, 200);
		this.setSize(700, 600);    
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		logview = new PainelLog();
		this.getContentPane().add(logview);
		DefaultTableModel tabela = new DefaultTableModel();
		tabela.addColumn("Data");
		tabela.addColumn("Mensagem");
		this.tabelaLog = new JTable(tabela);

		JScrollPane scrollPane = new JScrollPane(this.tabelaLog);
		this.tabelaLog.setFillsViewportHeight(true);
		scrollPane.setVisible(true);

		this.tabelaLog.setVisible(true);      
		this.add(scrollPane);
		updateData(tabela);
		this.setVisible(true);
		while(true)
		{		updateData(tabela);	
			try {
				
				//tempo de releitura/atualização do logView 5 segundos
				Thread.sleep(5000);
			} catch (InterruptedException ex) {
				Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
	}

	private void updateData(DefaultTableModel tabela) throws ArrayIndexOutOfBoundsException {
		ArrayList<Registro> vetRegistros = RegistroDAO.consultarLog();
		ArrayList<Object[]> objects = new ArrayList<>();
		String mensagemLOG = null;
		//reseta tabela
		tabela.setRowCount(0);
		for(int k=0; k<vetRegistros.size();k++)
		{
			Registro registroExistente  = new Registro();
			registroExistente = vetRegistros.get(k);
			
			mensagemLOG = MensagemDAO.exibirMsgId(vetRegistros.get(k).getIdMensagem());

			//só tentativa de login
			mensagemLOG = MensagemDAO.exibirMsgLogAuxLogin(vetRegistros.get(k).getIdMensagem(), vetRegistros.get(k).getAuxLogin());

			//se a mensagem contiver campos para substituir
			mensagemLOG = MensagemDAO.exibirMsgLog(vetRegistros.get(k).getIdMensagem(), vetRegistros.get(k).getIdUsuario(), vetRegistros.get(k).getArquivo());      

			objects.add(new Object[]{registroExistente.getDataRegistro(), mensagemLOG});
			//atualiza tabela
			tabela.addRow(objects.get(k));
		}

	}

}


