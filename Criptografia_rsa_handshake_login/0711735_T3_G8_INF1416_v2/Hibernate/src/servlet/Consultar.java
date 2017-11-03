package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import modelo.Pessoa;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import bean.ListaPessoasBean;
import util.HibernateUtil;

/**
 * Servlet implementation class Consultar
 */
@WebServlet("/Consultar")
public class Consultar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Consultar() {
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
	@SuppressWarnings("unchecked")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	
		String nome = request.getParameter("nome"); 
	
		@SuppressWarnings("unused")
		String msgErro;
		@SuppressWarnings("unused")
		boolean status=true;
		
		//Configurar uma fábrica de sessões
		Session session = null;
		SessionFactory sessionFactory;
		Query query;
		
		
		
		
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
		//Criar uma busca usando HQL
		String queryString = "from Pessoa cadastro where nome like '%" + nome + "%' order by nome";
		
		try
		{
			// Realizar a busca
			query = session.createQuery(queryString);
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
		
		//Realizar Busca - O resultado de uma query é uma lista do tipo List:
		List<Pessoa> itens = new ArrayList<Pessoa>();

		try
		{
			//Persistir a nova pessoa
			itens = query.list();
		}
		catch (HibernateException e)
		{
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			System.out.println(e.getClass());
			System.out.println(e.getLocalizedMessage());
			status = false;
			msgErro = "*** Erro ao consultar a pessoa";
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
		ListaPessoasBean listaPessoas = new ListaPessoasBean();
		
		listaPessoas.setListaPessoas(itens);	
		//dados de saída do servlet
		request.setAttribute("listaPessoas", listaPessoas); 
		request.getRequestDispatcher("/WEB-INF/servlet/ContatosEncontrados.jsp").forward(request, response);
	}
}
