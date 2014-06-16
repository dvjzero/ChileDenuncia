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

public class AutoridadDAO {
	public static Autoridad loadAutoridadByORMID(int au_id) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return loadAutoridadByORMID(session, au_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Autoridad getAutoridadByORMID(int au_id) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return getAutoridadByORMID(session, au_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Autoridad loadAutoridadByORMID(int au_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return loadAutoridadByORMID(session, au_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Autoridad getAutoridadByORMID(int au_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return getAutoridadByORMID(session, au_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Autoridad loadAutoridadByORMID(PersistentSession session, int au_id) throws PersistentException {
		try {
			return (Autoridad) session.load(orm.Autoridad.class, new Integer(au_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Autoridad getAutoridadByORMID(PersistentSession session, int au_id) throws PersistentException {
		try {
			return (Autoridad) session.get(orm.Autoridad.class, new Integer(au_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Autoridad loadAutoridadByORMID(PersistentSession session, int au_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Autoridad) session.load(orm.Autoridad.class, new Integer(au_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Autoridad getAutoridadByORMID(PersistentSession session, int au_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Autoridad) session.get(orm.Autoridad.class, new Integer(au_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAutoridad(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return queryAutoridad(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAutoridad(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return queryAutoridad(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Autoridad[] listAutoridadByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return listAutoridadByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Autoridad[] listAutoridadByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return listAutoridadByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAutoridad(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Autoridad as Autoridad");
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
	
	public static List queryAutoridad(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Autoridad as Autoridad");
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
	
	public static Autoridad[] listAutoridadByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryAutoridad(session, condition, orderBy);
			return (Autoridad[]) list.toArray(new Autoridad[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Autoridad[] listAutoridadByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryAutoridad(session, condition, orderBy, lockMode);
			return (Autoridad[]) list.toArray(new Autoridad[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Autoridad loadAutoridadByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return loadAutoridadByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Autoridad loadAutoridadByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return loadAutoridadByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Autoridad loadAutoridadByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Autoridad[] autoridads = listAutoridadByQuery(session, condition, orderBy);
		if (autoridads != null && autoridads.length > 0)
			return autoridads[0];
		else
			return null;
	}
	
	public static Autoridad loadAutoridadByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Autoridad[] autoridads = listAutoridadByQuery(session, condition, orderBy, lockMode);
		if (autoridads != null && autoridads.length > 0)
			return autoridads[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateAutoridadByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return iterateAutoridadByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAutoridadByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return iterateAutoridadByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAutoridadByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Autoridad as Autoridad");
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
	
	public static java.util.Iterator iterateAutoridadByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Autoridad as Autoridad");
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
	
	public static Autoridad createAutoridad() {
		return new orm.Autoridad();
	}
	
	public static boolean save(orm.Autoridad autoridad) throws PersistentException {
		try {
			orm.ChileDenunciaPersistentManager.instance().saveObject(autoridad);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.Autoridad autoridad) throws PersistentException {
		try {
			orm.ChileDenunciaPersistentManager.instance().deleteObject(autoridad);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Autoridad autoridad)throws PersistentException {
		try {
			if(autoridad.getUsuariousu() != null) {
				autoridad.getUsuariousu().setAutoridad(null);
			}
			
			if(autoridad.getTipoautoridad() != null) {
				autoridad.getTipoautoridad().autoridad.remove(autoridad);
			}
			
			orm.Visardenuncia[] lVisardenuncias = autoridad.visardenuncia.toArray();
			for(int i = 0; i < lVisardenuncias.length; i++) {
				lVisardenuncias[i].setAutoridadau(null);
			}
			return delete(autoridad);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Autoridad autoridad, org.orm.PersistentSession session)throws PersistentException {
		try {
			if(autoridad.getUsuariousu() != null) {
				autoridad.getUsuariousu().setAutoridad(null);
			}
			
			if(autoridad.getTipoautoridad() != null) {
				autoridad.getTipoautoridad().autoridad.remove(autoridad);
			}
			
			orm.Visardenuncia[] lVisardenuncias = autoridad.visardenuncia.toArray();
			for(int i = 0; i < lVisardenuncias.length; i++) {
				lVisardenuncias[i].setAutoridadau(null);
			}
			try {
				session.delete(autoridad);
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
	
	public static boolean refresh(orm.Autoridad autoridad) throws PersistentException {
		try {
			orm.ChileDenunciaPersistentManager.instance().getSession().refresh(autoridad);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.Autoridad autoridad) throws PersistentException {
		try {
			orm.ChileDenunciaPersistentManager.instance().getSession().evict(autoridad);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Autoridad loadAutoridadByCriteria(AutoridadCriteria autoridadCriteria) {
		Autoridad[] autoridads = listAutoridadByCriteria(autoridadCriteria);
		if(autoridads == null || autoridads.length == 0) {
			return null;
		}
		return autoridads[0];
	}
	
	public static Autoridad[] listAutoridadByCriteria(AutoridadCriteria autoridadCriteria) {
		return autoridadCriteria.listAutoridad();
	}
}
