
package dao;

import model.Mensagem;
import model.Usuario;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class MensagemDAO {
    
        public static Mensagem consultarIdMensagem(int idMensagem) {        
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        String queryString = "from Mensagem Mensagem where idMensagem = '"
                + idMensagem + "'";
        Query query = session.createQuery(queryString);
        Mensagem mensagemEncontrada = (Mensagem) query.uniqueResult();
        transaction.commit();
        session.close();
        return mensagemEncontrada;
    }
        
        public static String exibirMsgLog (int id, int idUsuario, String file){
            Mensagem mensagem = consultarIdMensagem(id);
            Usuario usuario = UsuarioDAO.consultarUsuarioID(idUsuario);
            String msg = mensagem.getMensagem();
                      	
            if(idUsuario!=0)
            {
            	msg = msg.replace("<login_name>", usuario.getLogin());
            }
           	if(file!=null)
           	{
            	msg = msg.replace("<arq_name>", file);
            }
            
                       
             return msg;
        }
        public static String exibirMsgId (int id){
            Mensagem mensagem = consultarIdMensagem(id);
            String msg = null;
            if(mensagem!=null)
            {
            	msg = mensagem.getMensagem();
            }
            return msg;
        }
        
        public static String exibirMsgLogAuxLogin (int id, String auxLogin){
            Mensagem mensagem = consultarIdMensagem(id);
            String msg = mensagem.getMensagem();
            if(auxLogin!=null)
            {
            	msg = msg.replace("<login_name>", auxLogin);
            }
  
            return msg;
        }
       
}
