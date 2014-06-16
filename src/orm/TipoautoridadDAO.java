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

public class TipoautoridadDAO {
	public static Tipoautoridad loadTipoautoridadByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return loadTipoautoridadByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipoautoridad getTipoautoridadByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return getTipoautoridadByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipoautoridad loadTipoautoridadByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return loadTipoautoridadByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipoautoridad getTipoautoridadByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return getTipoautoridadByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipoautoridad loadTipoautoridadByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Tipoautoridad) session.load(orm.Tipoautoridad.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipoautoridad getTipoautoridadByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Tipoautoridad) session.get(orm.Tipoautoridad.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipoautoridad loadTipoautoridadByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Tipoautoridad) session.load(orm.Tipoautoridad.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipoautoridad getTipoautoridadByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Tipoautoridad) session.get(orm.Tipoautoridad.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTipoautoridad(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return queryTipoautoridad(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTipoautoridad(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return queryTipoautoridad(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipoautoridad[] listTipoautoridadByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return listTipoautoridadByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipoautoridad[] listTipoautoridadByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return listTipoautoridadByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTipoautoridad(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Tipoautoridad as Tipoautoridad");
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
	
	public static List queryTipoautoridad(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Tipoautoridad as Tipoautoridad");
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
	
	public static Tipoautoridad[] listTipoautoridadByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryTipoautoridad(session, condition, orderBy);
			return (Tipoautoridad[]) list.toArray(new Tipoautoridad[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipoautoridad[] listTipoautoridadByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryTipoautoridad(session, condition, orderBy, lockMode);
			return (Tipoautoridad[]) list.toArray(new Tipoautoridad[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipoautoridad loadTipoautoridadByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return loadTipoautoridadByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipoautoridad loadTipoautoridadByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return loadTipoautoridadByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipoautoridad loadTipoautoridadByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Tipoautoridad[] tipoautoridads = listTipoautoridadByQuery(session, condition, orderBy);
		if (tipoautoridads != null && tipoautoridads.length > 0)
			return tipoautoridads[0];
		else
			return null;
	}
	
	public static Tipoautoridad loadTipoautoridadByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Tipoautoridad[] tipoautoridads = listTipoautoridadByQuery(session, condition, orderBy, lockMode);
		if (tipoautoridads != null && tipoautoridads.length > 0)
			return tipoautoridads[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateTipoautoridadByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return iterateTipoautoridadByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTipoautoridadByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return iterateTipoautoridadByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTipoautoridadByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Tipoautoridad as Tipoautoridad");
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
	
	public static java.util.Iterator iterateTipoautoridadByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Tipoautoridad as Tipoautoridad");
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
	
	public static Tipoautoridad createTipoautoridad() {
		return new orm.Tipoautoridad();
	}
	
	public static boolean save(orm.Tipoautoridad tipoautoridad) throws PersistentException {
		try {
			orm.ChileDenunciaPersistentManager.instance().saveObject(tipoautoridad);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.Tipoautoridad tipoautoridad) throws PersistentException {
		try {
			orm.ChileDenunciaPersistentManager.instance().deleteObject(tipoautoridad);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Tipoautoridad tipoautoridad)throws PersistentException {
		try {
			orm.Autoridad[] lAutoridads = tipoautoridad.autoridad.toArray();
			for(int i = 0; i < lAutoridads.length; i++) {
				lAutoridads[i].setTipoautoridad(null);
			}
			return delete(tipoautoridad);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Tipoautoridad tipoautoridad, org.orm.PersistentSession session)throws PersistentException {
		try {
			orm.Autoridad[] lAutoridads = tipoautoridad.autoridad.toArray();
			for(int i = 0; i < lAutoridads.length; i++) {
				lAutoridads[i].setTipoautoridad(null);
			}
			try {
				session.delete(tipoautoridad);
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
	
	public static boolean refresh(orm.Tipoautoridad tipoautoridad) throws PersistentException {
		try {
			orm.ChileDenunciaPersistentManager.instance().getSession().refresh(tipoautoridad);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.Tipoautoridad tipoautoridad) throws PersistentException {
		try {
			orm.ChileDenunciaPersistentManager.instance().getSession().evict(tipoautoridad);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipoautoridad loadTipoautoridadByCriteria(TipoautoridadCriteria tipoautoridadCriteria) {
		Tipoautoridad[] tipoautoridads = listTipoautoridadByCriteria(tipoautoridadCriteria);
		if(tipoautoridads == null || tipoautoridads.length == 0) {
			return null;
		}
		return tipoautoridads[0];
	}
	
	public static Tipoautoridad[] listTipoautoridadByCriteria(TipoautoridadCriteria tipoautoridadCriteria) {
		return tipoautoridadCriteria.listTipoautoridad();
	}
}
