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
 * Servlet implementation class Editar
 */
@WebServlet("/Editar")
public class Editar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Editar() {
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
	@SuppressWarnings("unused")
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
			msgErro = "*** Erro ao abrir a sess�o";
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
			msgErro = "*** Erro ao come�ar uma transa��o";
			return;
		}
		
		Pessoa pessoa = new Pessoa();
		String id = request.getParameter("id"); 
		int chave =  Integer.parseInt(id);
		String nome = request.getParameter("nome");
		String endereco = request.getParameter("endereco");
		String ip = request.getParameter("ip");
		
		try
		{		
			pessoa = (Pessoa) session.get(Pessoa.class, chave);
			pessoa.setNome(nome);
			pessoa.setEndereco(endereco);
			pessoa.setTelefone(pessoa.getTelefone());
			pessoa.setIp(ip);
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
			//Uma transa��o bem sucedida termina com:
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
			//Salva modifica��es no banco de dados
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
			//ACHO QUE S� SERVE PARA UPDATE OU DELETE. Pois para inserir...
			if (transacao!=null) 
				transacao.rollback(); 
			return;
		}
		request.setAttribute("pessoa", pessoa); 
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
			//Fechar f�brica de sess�o
			sessionFactory.close();
		}
		catch (HibernateException e)
		{
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			System.out.println(e.getClass());
			System.out.println(e.getLocalizedMessage());
			status = false;
			msgErro = "*** Erro ao fechar a f�brica de sessao";
			return;
		}

		request.getRequestDispatcher("/WEB-INF/servlet/ContatoEditado.jsp").forward(request, response);

	}
}
