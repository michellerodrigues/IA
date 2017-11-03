package controller;

import javax.swing.JPanel;

import Principal.PersistenciaDados;
import dao.RegistroDAO;
import dao.UsuarioDAO;
import model.Usuario;


public class EfetuarLogin {

	private String login;
	Usuario user = new Usuario();

	public EfetuarLogin(String login) {
		this.login = login;
	}

	public boolean checkLogin(JPanel panel) 
	{

		if (login == null || login.isEmpty()) 
		{
			panel.validate();
		} 
		else 
		{

			user = UsuarioDAO.consultarUsuario(login);
			if (user == null) {
				RegistroDAO.incluirRegistroLoginInvalido(2005, login);
				panel.validate();
			} 
			else 
			{

				if (UsuarioDAO.verificarBloqueio(user)) 
				{
					RegistroDAO.incluirRegistroLogin(2004, user.getIdUsuario());
					panel.validate();

				} 
				else 
				{
					PersistenciaDados.getInstance().setUsuarioLogado(user);
					RegistroDAO.incluirRegistroLogin(2003, user.getIdUsuario());
					RegistroDAO.incluirRegistroLogin(2002, user.getIdUsuario());
					return true;

				}
			}
		}

		return false;
	}
}
