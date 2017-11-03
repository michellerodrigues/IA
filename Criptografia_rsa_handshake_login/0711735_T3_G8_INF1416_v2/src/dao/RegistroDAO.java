

package dao;

import java.util.ArrayList;
import java.util.Calendar;

import model.Registro;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class RegistroDAO {
	@SuppressWarnings("unchecked")
	public static ArrayList<Registro> consultarLog() {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		String queryString = "from Registro Registro order by idRegistro";
		Query query = session.createQuery(queryString);
		ArrayList<Registro> logs = (ArrayList<Registro>) query.list();
		transaction.commit();
		session.close();
		return logs;
	}

	public static void incluirRegistroMsgId (int idMensagem){
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();

		Registro registro = new Registro();
		registro.setDataRegistro(Calendar.getInstance().getTime());
		registro.setIdMensagem(idMensagem);
		registro.setIdUsuario(0);

		Transaction tx = session.beginTransaction();
		session.save(registro);
		tx.commit();

		session.close();         
	}

	public static void incluirRegistroLogin (int idMensagem, int idUsuario){
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		Registro registro = new Registro();
		registro.setDataRegistro(Calendar.getInstance().getTime());
		registro.setIdMensagem(idMensagem);
		registro.setIdUsuario(idUsuario);


		Transaction tx = session.beginTransaction();
		session.save(registro);
		tx.commit();

		session.close();                   
	}
	public static void incluirRegistroLoginInvalido (int idMensagem, String auxLogin){
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();

		Registro registro = new Registro();
		registro.setDataRegistro(Calendar.getInstance().getTime());
		registro.setIdMensagem(idMensagem);
		registro.setAuxLogin(auxLogin);

		Transaction tx = session.beginTransaction();
		session.save(registro);
		tx.commit();

		session.close();                   
	}

	public static void incluirRegistroArquivo (int idMensagem, int idUsuario, String arquivo){
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
				
		Registro registro = new Registro();
		registro.setDataRegistro(Calendar.getInstance().getTime());
		registro.setArquivo(arquivo);
		registro.setIdUsuario(idUsuario);
		registro.setIdMensagem(idMensagem);

		Transaction tx = session.beginTransaction();
		session.save(registro);
		tx.commit();

		session.close();          

	}

}
