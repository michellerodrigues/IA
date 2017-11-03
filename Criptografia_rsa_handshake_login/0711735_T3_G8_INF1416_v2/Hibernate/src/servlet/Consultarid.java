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

import util.HibernateUtil;

/**
 * Servlet implementation class Consultarid
 */
@WebServlet("/Consultarid")
public class Consultarid extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Consultarid() {
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
		
	
		String id = request.getParameter("idSelecionado"); 
	
		@SuppressWarnings("unused")
		String msgErro;
		@SuppressWarnings("unused")
		boolean status=true;
		
		//Configurar uma fábrica de sessões
		Session session = null;
		SessionFactory sessionFactory;
		
		
		try
		{
			//1 - Obter um sessão da fábrica de sessões
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
		

		/*
		try
		{
			//Fechar a sessão
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
		*/
		Pessoa pessoa = new Pessoa();
		int chave =  Integer.parseInt(id);
		pessoa = (Pessoa) session.get(Pessoa.class,chave);
		
		//dados de saída do servlet
		request.setAttribute("pessoa", pessoa);
		if(request.getParameter("opcao").equals("Deletar"))
		{
			request.getRequestDispatcher("/WEB-INF/servlet/PessoaSelecionadaDelecao.jsp").forward(request, response);
		}
		else
		{
			request.getRequestDispatcher("/WEB-INF/servlet/PessoaSelecionada.jsp").forward(request, response);
		}
		
	}

}
