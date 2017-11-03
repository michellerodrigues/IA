package dao;

import static java.util.concurrent.TimeUnit.MILLISECONDS;
import static java.util.concurrent.TimeUnit.MINUTES;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

import model.Usuario;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import Principal.PersistenciaDados;
import controller.Cida;

public class UsuarioDAO {
		
    public static Usuario consultarUsuario(String login) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        String queryString = "from Usuario Usuario where login = '"
                + login + "'";
        Query query = session.createQuery(queryString);
        Usuario userFound = (Usuario) query.uniqueResult();
        transaction.commit();
        session.close();
        return userFound;
    }
    
    public static Usuario consultarUsuarioID(int idUsuario) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        String queryString = "from Usuario Usuario where idUsuario = " + idUsuario;
        Query query = session.createQuery(queryString);
        Usuario userFound = (Usuario) query.uniqueResult();
        transaction.commit();
        session.close();
        return userFound;
    }
    
    public static void incluirUsuario (Usuario usuario, String caminhoChavePublica) throws Exception{
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transacao = session.beginTransaction();
        Random rand = new Random();
        Integer salt = rand.nextInt(999999999);
        
        try {
            String pwdHash = PersistenciaDados.gerarSenhaComHash(usuario.getSenha(), salt);
            usuario.setSenha(pwdHash);
            usuario.setTentativas_senha(0);
            usuario.setAcessoBloqueado(false);
            usuario.setSalt(salt);
            usuario.setChavePublica(Cida.carregarArquivo(caminhoChavePublica));
            session.save(usuario);
            transacao.commit();
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        session.close(); 
    }
    
    public static void atualizarUsuario (Usuario usuario){
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transacao = session.beginTransaction();
        session.update(usuario);
        transacao.commit();       
        session.close(); 
    }
    
    
    public static Long totalUsuarios(){
    	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        String queryString = "select count(*) from Usuario Usuario";
        Query query = session.createQuery(queryString);
        Long usuariosEncontrados = (Long) query.uniqueResult();
        transaction.commit();
        session.close();
        return usuariosEncontrados;
    }
        
    public static void atualizaNumeroTentativas(int fase,Usuario usuario) 
    {
    	int totalTentativas = usuario.getTentativas_senha();
    	    	
    	totalTentativas++;
    	
        if (totalTentativas >= 3)
        {
            switch (fase)
            {
                case 2:
                    RegistroDAO.incluirRegistroLogin(3008, usuario.getIdUsuario());
                    break;
                case 3:
                    RegistroDAO.incluirRegistroLogin(4007, usuario.getIdUsuario());
                    break;
            }
            bloquearAcesso(usuario); 
        }
        else
        {
        	usuario.setTentativas_senha(totalTentativas);
            update(usuario); 
        }
        
    }
    
	public static boolean verificarBloqueio(Usuario usuario) {
    	if(usuario.getAcessoBloqueado().equals(true) && ! verificaFimTempoBloqueio(usuario))
        {
            return true;
        }
        else
        {
            if(usuario.getAcessoBloqueado().equals(true) && verificaFimTempoBloqueio(usuario))
            {
                desbloquearAcesso(usuario);
            }
            return false;
        }
    }

    public static void bloquearAcesso(Usuario usuario) {
        usuario.setAcessoBloqueado(true);
        usuario.setData_bloqueio(Calendar.getInstance().getTime());
        update(usuario);
    }
        
    public static boolean verificaFimTempoBloqueio(Usuario usuario) {
        Date now = new Date();
        
        /*Após três erros consecutivos sem que ocorra uma verificação positiva entre os erros,
deve-se seguir para a etapa 1 e o acesso do usuário deve ser bloqueado por 2 minutos (outros
usuários poderão tentar ter acesso). Se a verificação for positiva, o processo deve seguir para a
terceira etapa.*/
        long TEMPO_BLOQUEIO = MILLISECONDS.convert(2, MINUTES);

        if (!usuario.getData_bloqueio().equals(null)){
            long tempo_passado = now.getTime() - usuario.getData_bloqueio().getTime();
            if (tempo_passado >= TEMPO_BLOQUEIO) {
                return true;
            }
        }
        
        return false;

    }
    
    public static void desbloquearAcesso(Usuario usuario) {
    	usuario.setAcessoBloqueado(false);
    	usuario.setData_bloqueio(null);
    	usuario.setTentativas_senha(0);
    	update(usuario);
    }

    public static void update(Usuario usuario) {
        UsuarioDAO.atualizarUsuario(usuario);
    }
    
    
}


