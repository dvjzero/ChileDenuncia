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

public class Estado_denunciaDAO {
	public static Estado_denuncia loadEstado_denunciaByORMID(int ed_id) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return loadEstado_denunciaByORMID(session, ed_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estado_denuncia getEstado_denunciaByORMID(int ed_id) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return getEstado_denunciaByORMID(session, ed_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estado_denuncia loadEstado_denunciaByORMID(int ed_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return loadEstado_denunciaByORMID(session, ed_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estado_denuncia getEstado_denunciaByORMID(int ed_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return getEstado_denunciaByORMID(session, ed_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estado_denuncia loadEstado_denunciaByORMID(PersistentSession session, int ed_id) throws PersistentException {
		try {
			return (Estado_denuncia) session.load(orm.Estado_denuncia.class, new Integer(ed_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estado_denuncia getEstado_denunciaByORMID(PersistentSession session, int ed_id) throws PersistentException {
		try {
			return (Estado_denuncia) session.get(orm.Estado_denuncia.class, new Integer(ed_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estado_denuncia loadEstado_denunciaByORMID(PersistentSession session, int ed_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Estado_denuncia) session.load(orm.Estado_denuncia.class, new Integer(ed_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estado_denuncia getEstado_denunciaByORMID(PersistentSession session, int ed_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Estado_denuncia) session.get(orm.Estado_denuncia.class, new Integer(ed_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEstado_denuncia(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return queryEstado_denuncia(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEstado_denuncia(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return queryEstado_denuncia(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estado_denuncia[] listEstado_denunciaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return listEstado_denunciaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estado_denuncia[] listEstado_denunciaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return listEstado_denunciaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEstado_denuncia(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Estado_denuncia as Estado_denuncia");
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
	
	public static List queryEstado_denuncia(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Estado_denuncia as Estado_denuncia");
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
	
	public static Estado_denuncia[] listEstado_denunciaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryEstado_denuncia(session, condition, orderBy);
			return (Estado_denuncia[]) list.toArray(new Estado_denuncia[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estado_denuncia[] listEstado_denunciaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryEstado_denuncia(session, condition, orderBy, lockMode);
			return (Estado_denuncia[]) list.toArray(new Estado_denuncia[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estado_denuncia loadEstado_denunciaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return loadEstado_denunciaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estado_denuncia loadEstado_denunciaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return loadEstado_denunciaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estado_denuncia loadEstado_denunciaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Estado_denuncia[] estado_denuncias = listEstado_denunciaByQuery(session, condition, orderBy);
		if (estado_denuncias != null && estado_denuncias.length > 0)
			return estado_denuncias[0];
		else
			return null;
	}
	
	public static Estado_denuncia loadEstado_denunciaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Estado_denuncia[] estado_denuncias = listEstado_denunciaByQuery(session, condition, orderBy, lockMode);
		if (estado_denuncias != null && estado_denuncias.length > 0)
			return estado_denuncias[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateEstado_denunciaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return iterateEstado_denunciaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEstado_denunciaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return iterateEstado_denunciaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEstado_denunciaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Estado_denuncia as Estado_denuncia");
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
	
	public static java.util.Iterator iterateEstado_denunciaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Estado_denuncia as Estado_denuncia");
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
	
	public static Estado_denuncia createEstado_denuncia() {
		return new orm.Estado_denuncia();
	}
	
	public static boolean save(orm.Estado_denuncia estado_denuncia) throws PersistentException {
		try {
			orm.ChileDenunciaPersistentManager.instance().saveObject(estado_denuncia);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.Estado_denuncia estado_denuncia) throws PersistentException {
		try {
			orm.ChileDenunciaPersistentManager.instance().deleteObject(estado_denuncia);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Estado_denuncia estado_denuncia)throws PersistentException {
		try {
			orm.Denuncia[] lDenuncias = estado_denuncia.denuncia.toArray();
			for(int i = 0; i < lDenuncias.length; i++) {
				lDenuncias[i].setEstado_denunciaed(null);
			}
			return delete(estado_denuncia);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Estado_denuncia estado_denuncia, org.orm.PersistentSession session)throws PersistentException {
		try {
			orm.Denuncia[] lDenuncias = estado_denuncia.denuncia.toArray();
			for(int i = 0; i < lDenuncias.length; i++) {
				lDenuncias[i].setEstado_denunciaed(null);
			}
			try {
				session.delete(estado_denuncia);
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
	
	public static boolean refresh(orm.Estado_denuncia estado_denuncia) throws PersistentException {
		try {
			orm.ChileDenunciaPersistentManager.instance().getSession().refresh(estado_denuncia);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.Estado_denuncia estado_denuncia) throws PersistentException {
		try {
			orm.ChileDenunciaPersistentManager.instance().getSession().evict(estado_denuncia);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estado_denuncia loadEstado_denunciaByCriteria(Estado_denunciaCriteria estado_denunciaCriteria) {
		Estado_denuncia[] estado_denuncias = listEstado_denunciaByCriteria(estado_denunciaCriteria);
		if(estado_denuncias == null || estado_denuncias.length == 0) {
			return null;
		}
		return estado_denuncias[0];
	}
	
	public static Estado_denuncia[] listEstado_denunciaByCriteria(Estado_denunciaCriteria estado_denunciaCriteria) {
		return estado_denunciaCriteria.listEstado_denuncia();
	}
}
