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

public class VisardenunciaDAO {
	public static Visardenuncia loadVisardenunciaByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return loadVisardenunciaByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Visardenuncia getVisardenunciaByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return getVisardenunciaByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Visardenuncia loadVisardenunciaByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return loadVisardenunciaByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Visardenuncia getVisardenunciaByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return getVisardenunciaByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Visardenuncia loadVisardenunciaByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Visardenuncia) session.load(orm.Visardenuncia.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Visardenuncia getVisardenunciaByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Visardenuncia) session.get(orm.Visardenuncia.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Visardenuncia loadVisardenunciaByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Visardenuncia) session.load(orm.Visardenuncia.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Visardenuncia getVisardenunciaByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Visardenuncia) session.get(orm.Visardenuncia.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryVisardenuncia(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return queryVisardenuncia(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryVisardenuncia(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return queryVisardenuncia(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Visardenuncia[] listVisardenunciaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return listVisardenunciaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Visardenuncia[] listVisardenunciaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return listVisardenunciaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryVisardenuncia(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Visardenuncia as Visardenuncia");
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
	
	public static List queryVisardenuncia(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Visardenuncia as Visardenuncia");
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
	
	public static Visardenuncia[] listVisardenunciaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryVisardenuncia(session, condition, orderBy);
			return (Visardenuncia[]) list.toArray(new Visardenuncia[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Visardenuncia[] listVisardenunciaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryVisardenuncia(session, condition, orderBy, lockMode);
			return (Visardenuncia[]) list.toArray(new Visardenuncia[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Visardenuncia loadVisardenunciaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return loadVisardenunciaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Visardenuncia loadVisardenunciaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return loadVisardenunciaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Visardenuncia loadVisardenunciaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Visardenuncia[] visardenuncias = listVisardenunciaByQuery(session, condition, orderBy);
		if (visardenuncias != null && visardenuncias.length > 0)
			return visardenuncias[0];
		else
			return null;
	}
	
	public static Visardenuncia loadVisardenunciaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Visardenuncia[] visardenuncias = listVisardenunciaByQuery(session, condition, orderBy, lockMode);
		if (visardenuncias != null && visardenuncias.length > 0)
			return visardenuncias[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateVisardenunciaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return iterateVisardenunciaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateVisardenunciaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return iterateVisardenunciaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateVisardenunciaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Visardenuncia as Visardenuncia");
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
	
	public static java.util.Iterator iterateVisardenunciaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Visardenuncia as Visardenuncia");
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
	
	public static Visardenuncia createVisardenuncia() {
		return new orm.Visardenuncia();
	}
	
	public static boolean save(orm.Visardenuncia visardenuncia) throws PersistentException {
		try {
			orm.ChileDenunciaPersistentManager.instance().saveObject(visardenuncia);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.Visardenuncia visardenuncia) throws PersistentException {
		try {
			orm.ChileDenunciaPersistentManager.instance().deleteObject(visardenuncia);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Visardenuncia visardenuncia)throws PersistentException {
		try {
			if(visardenuncia.getAutoridadau() != null) {
				visardenuncia.getAutoridadau().visardenuncia.remove(visardenuncia);
			}
			
			if(visardenuncia.getDenunciaden() != null) {
				visardenuncia.getDenunciaden().setVisardenuncia(null);
			}
			
			return delete(visardenuncia);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Visardenuncia visardenuncia, org.orm.PersistentSession session)throws PersistentException {
		try {
			if(visardenuncia.getAutoridadau() != null) {
				visardenuncia.getAutoridadau().visardenuncia.remove(visardenuncia);
			}
			
			if(visardenuncia.getDenunciaden() != null) {
				visardenuncia.getDenunciaden().setVisardenuncia(null);
			}
			
			try {
				session.delete(visardenuncia);
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
	
	public static boolean refresh(orm.Visardenuncia visardenuncia) throws PersistentException {
		try {
			orm.ChileDenunciaPersistentManager.instance().getSession().refresh(visardenuncia);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.Visardenuncia visardenuncia) throws PersistentException {
		try {
			orm.ChileDenunciaPersistentManager.instance().getSession().evict(visardenuncia);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Visardenuncia loadVisardenunciaByCriteria(VisardenunciaCriteria visardenunciaCriteria) {
		Visardenuncia[] visardenuncias = listVisardenunciaByCriteria(visardenunciaCriteria);
		if(visardenuncias == null || visardenuncias.length == 0) {
			return null;
		}
		return visardenuncias[0];
	}
	
	public static Visardenuncia[] listVisardenunciaByCriteria(VisardenunciaCriteria visardenunciaCriteria) {
		return visardenunciaCriteria.listVisardenuncia();
	}
}
