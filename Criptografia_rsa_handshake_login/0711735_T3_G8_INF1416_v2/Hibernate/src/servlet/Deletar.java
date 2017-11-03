package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Pessoa;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import util.HibernateUtil;

/**
 * Servlet implementation class Deletar
 */
@WebServlet("/Deletar")
public class Deletar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Deletar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		String msgErro;
		boolean status=true;
		Session session;
		SessionFactory sessionFactory;
		Transaction transacao;
	
		
		try
		{
			sessionFactory = HibernateUtil.getSessionFactory();
		}
		catch (HibernateException e)
		{
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			System.out.println(e.getClass());
			System.out.println(e.getLocalizedMessage());
			status = false;
			msgErro = "*** Erro ao criar sessionFactory.";
			return;
		}

		try
		{
			session = sessionFactory.openSession();
		}
		catch(HibernateException e)
		{
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			System.out.println(e.getClass());
			System.out.println(e.getLocalizedMessage());
			status = false;
			msgErro = "*** Erro ao abrir a sessão";
			return;
		}
		try
		{
			transacao = session.beginTransaction();
		}
		catch (HibernateException e)
		{
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			System.out.println(e.getClass());
			System.out.println(e.getLocalizedMessage());
			status = false;
			msgErro = "*** Erro ao começar uma transação";
			return;
		}
		
		String id = request.getParameter("id"); 
		int chave =  Integer.parseInt(id);
		
		try
		{		
			for(int i = 0; i < chave; i++)
			{
				Pessoa pessoa = new Pessoa(chave);
				session.delete(pessoa);
			}
		}
			catch (HibernateException e)
			{
				System.out.println(e.getCause());
				System.out.println(e.getMessage());
				System.out.println(e.getClass());
				System.out.println(e.getLocalizedMessage());
				status = false;
				msgErro = "*** Erro ao carregar a classe pessoa";
				return;
			}
		

		try
		{
			//Uma transação bem sucedida termina com:
			transacao.commit();
		}
		catch (HibernateException e)
		{
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			System.out.println(e.getClass());
			System.out.println(e.getLocalizedMessage());
			status = false;
			msgErro = "*** Erro ao dar commit na transacao";
			return;
		}
		try
		{
			//Salva modificações no banco de dados
			session.flush();
		}
		catch (HibernateException e)
		{
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			System.out.println(e.getClass());
			System.out.println(e.getLocalizedMessage());
			status = false;
			msgErro = "*** Erro ao dar flush";
			//ACHO QUE SÓ SERVE PARA UPDATE OU DELETE. Pois para inserir...
			if (transacao!=null) 
				transacao.rollback(); 
			return;
		}
		try
		{
			session.close();
		}
		catch (HibernateException e)
		{
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			System.out.println(e.getClass());
			System.out.println(e.getLocalizedMessage());
			status = false;
			msgErro = "*** Erro ao fechar a sessao";
			return;
		}
		try
		{
			//Fechar fábrica de sessão
			sessionFactory.close();
		}
		catch (HibernateException e)
		{
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			System.out.println(e.getClass());
			System.out.println(e.getLocalizedMessage());
			status = false;
			msgErro = "*** Erro ao fechar a fábrica de sessao";
			return;
		}

		request.getRequestDispatcher("/WEB-INF/servlet/ContatoDeletado.jsp").forward(request, response);

	}

}
