/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Universidad del Pais Vasco
 * License Type: Academic
 */
package orm;

import org.orm.*;
import org.hibernate.Query;
import java.util.List;

public class Autentificacion_red_socialDAO {
	public static Autentificacion_red_social loadAutentificacion_red_socialByORMID(int au_id) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return loadAutentificacion_red_socialByORMID(session, au_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Autentificacion_red_social getAutentificacion_red_socialByORMID(int au_id) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return getAutentificacion_red_socialByORMID(session, au_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Autentificacion_red_social loadAutentificacion_red_socialByORMID(int au_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return loadAutentificacion_red_socialByORMID(session, au_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Autentificacion_red_social getAutentificacion_red_socialByORMID(int au_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return getAutentificacion_red_socialByORMID(session, au_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Autentificacion_red_social loadAutentificacion_red_socialByORMID(PersistentSession session, int au_id) throws PersistentException {
		try {
			return (Autentificacion_red_social) session.load(orm.Autentificacion_red_social.class, new Integer(au_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Autentificacion_red_social getAutentificacion_red_socialByORMID(PersistentSession session, int au_id) throws PersistentException {
		try {
			return (Autentificacion_red_social) session.get(orm.Autentificacion_red_social.class, new Integer(au_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Autentificacion_red_social loadAutentificacion_red_socialByORMID(PersistentSession session, int au_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Autentificacion_red_social) session.load(orm.Autentificacion_red_social.class, new Integer(au_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Autentificacion_red_social getAutentificacion_red_socialByORMID(PersistentSession session, int au_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Autentificacion_red_social) session.get(orm.Autentificacion_red_social.class, new Integer(au_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAutentificacion_red_social(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return queryAutentificacion_red_social(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAutentificacion_red_social(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return queryAutentificacion_red_social(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Autentificacion_red_social[] listAutentificacion_red_socialByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return listAutentificacion_red_socialByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Autentificacion_red_social[] listAutentificacion_red_socialByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return listAutentificacion_red_socialByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAutentificacion_red_social(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Autentificacion_red_social as Autentificacion_red_social");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAutentificacion_red_social(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Autentificacion_red_social as Autentificacion_red_social");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Autentificacion_red_social[] listAutentificacion_red_socialByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryAutentificacion_red_social(session, condition, orderBy);
			return (Autentificacion_red_social[]) list.toArray(new Autentificacion_red_social[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Autentificacion_red_social[] listAutentificacion_red_socialByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryAutentificacion_red_social(session, condition, orderBy, lockMode);
			return (Autentificacion_red_social[]) list.toArray(new Autentificacion_red_social[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Autentificacion_red_social loadAutentificacion_red_socialByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return loadAutentificacion_red_socialByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Autentificacion_red_social loadAutentificacion_red_socialByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return loadAutentificacion_red_socialByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Autentificacion_red_social loadAutentificacion_red_socialByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Autentificacion_red_social[] autentificacion_red_socials = listAutentificacion_red_socialByQuery(session, condition, orderBy);
		if (autentificacion_red_socials != null && autentificacion_red_socials.length > 0)
			return autentificacion_red_socials[0];
		else
			return null;
	}
	
	public static Autentificacion_red_social loadAutentificacion_red_socialByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Autentificacion_red_social[] autentificacion_red_socials = listAutentificacion_red_socialByQuery(session, condition, orderBy, lockMode);
		if (autentificacion_red_socials != null && autentificacion_red_socials.length > 0)
			return autentificacion_red_socials[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateAutentificacion_red_socialByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return iterateAutentificacion_red_socialByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAutentificacion_red_socialByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return iterateAutentificacion_red_socialByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAutentificacion_red_socialByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Autentificacion_red_social as Autentificacion_red_social");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAutentificacion_red_socialByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Autentificacion_red_social as Autentificacion_red_social");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Autentificacion_red_social createAutentificacion_red_social() {
		return new orm.Autentificacion_red_social();
	}
	
	public static boolean save(orm.Autentificacion_red_social autentificacion_red_social) throws PersistentException {
		try {
			orm.ChileDenunciaPersistentManager.instance().saveObject(autentificacion_red_social);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.Autentificacion_red_social autentificacion_red_social) throws PersistentException {
		try {
			orm.ChileDenunciaPersistentManager.instance().deleteObject(autentificacion_red_social);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Autentificacion_red_social autentificacion_red_social)throws PersistentException {
		try {
			orm.Usuario[] lUsuarios = autentificacion_red_social.usuario.toArray();
			for(int i = 0; i < lUsuarios.length; i++) {
				lUsuarios[i].setAutentificacion_red_socialau(null);
			}
			return delete(autentificacion_red_social);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Autentificacion_red_social autentificacion_red_social, org.orm.PersistentSession session)throws PersistentException {
		try {
			orm.Usuario[] lUsuarios = autentificacion_red_social.usuario.toArray();
			for(int i = 0; i < lUsuarios.length; i++) {
				lUsuarios[i].setAutentificacion_red_socialau(null);
			}
			try {
				session.delete(autentificacion_red_social);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(orm.Autentificacion_red_social autentificacion_red_social) throws PersistentException {
		try {
			orm.ChileDenunciaPersistentManager.instance().getSession().refresh(autentificacion_red_social);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.Autentificacion_red_social autentificacion_red_social) throws PersistentException {
		try {
			orm.ChileDenunciaPersistentManager.instance().getSession().evict(autentificacion_red_social);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Autentificacion_red_social loadAutentificacion_red_socialByCriteria(Autentificacion_red_socialCriteria autentificacion_red_socialCriteria) {
		Autentificacion_red_social[] autentificacion_red_socials = listAutentificacion_red_socialByCriteria(autentificacion_red_socialCriteria);
		if(autentificacion_red_socials == null || autentificacion_red_socials.length == 0) {
			return null;
		}
		return autentificacion_red_socials[0];
	}
	
	public static Autentificacion_red_social[] listAutentificacion_red_socialByCriteria(Autentificacion_red_socialCriteria autentificacion_red_socialCriteria) {
		return autentificacion_red_socialCriteria.listAutentificacion_red_social();
	}
}
