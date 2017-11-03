package util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil
{
	private static final SessionFactory sessionFactory = buildSessionFactory();
	@SuppressWarnings("deprecation")
	private static SessionFactory buildSessionFactory()
	{
		try
		{
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			return cfg.buildSessionFactory();
		}
		catch (Throwable ex)
		{
			System.out.println("A criação do objeto Session Factory falhou. Erro:");
			System.out.println(ex.getCause());
			System.out.println(ex.getMessage());
			System.out.println(ex.getClass());
			System.out.println(ex.getLocalizedMessage());
			throw new ExceptionInInitializerError(ex);
			
		}
	}
	public static SessionFactory getSessionFactory()
	{
		return sessionFactory;
	}
}