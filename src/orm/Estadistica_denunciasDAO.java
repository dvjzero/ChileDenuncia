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

public class Estadistica_denunciasDAO {
	public static Estadistica_denuncias loadEstadistica_denunciasByORMID(int ed_id) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return loadEstadistica_denunciasByORMID(session, ed_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estadistica_denuncias getEstadistica_denunciasByORMID(int ed_id) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return getEstadistica_denunciasByORMID(session, ed_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estadistica_denuncias loadEstadistica_denunciasByORMID(int ed_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return loadEstadistica_denunciasByORMID(session, ed_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estadistica_denuncias getEstadistica_denunciasByORMID(int ed_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return getEstadistica_denunciasByORMID(session, ed_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estadistica_denuncias loadEstadistica_denunciasByORMID(PersistentSession session, int ed_id) throws PersistentException {
		try {
			return (Estadistica_denuncias) session.load(orm.Estadistica_denuncias.class, new Integer(ed_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estadistica_denuncias getEstadistica_denunciasByORMID(PersistentSession session, int ed_id) throws PersistentException {
		try {
			return (Estadistica_denuncias) session.get(orm.Estadistica_denuncias.class, new Integer(ed_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estadistica_denuncias loadEstadistica_denunciasByORMID(PersistentSession session, int ed_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Estadistica_denuncias) session.load(orm.Estadistica_denuncias.class, new Integer(ed_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estadistica_denuncias getEstadistica_denunciasByORMID(PersistentSession session, int ed_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Estadistica_denuncias) session.get(orm.Estadistica_denuncias.class, new Integer(ed_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEstadistica_denuncias(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return queryEstadistica_denuncias(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEstadistica_denuncias(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return queryEstadistica_denuncias(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estadistica_denuncias[] listEstadistica_denunciasByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return listEstadistica_denunciasByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estadistica_denuncias[] listEstadistica_denunciasByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return listEstadistica_denunciasByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEstadistica_denuncias(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Estadistica_denuncias as Estadistica_denuncias");
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
	
	public static List queryEstadistica_denuncias(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Estadistica_denuncias as Estadistica_denuncias");
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
	
	public static Estadistica_denuncias[] listEstadistica_denunciasByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryEstadistica_denuncias(session, condition, orderBy);
			return (Estadistica_denuncias[]) list.toArray(new Estadistica_denuncias[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estadistica_denuncias[] listEstadistica_denunciasByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryEstadistica_denuncias(session, condition, orderBy, lockMode);
			return (Estadistica_denuncias[]) list.toArray(new Estadistica_denuncias[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estadistica_denuncias loadEstadistica_denunciasByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return loadEstadistica_denunciasByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estadistica_denuncias loadEstadistica_denunciasByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return loadEstadistica_denunciasByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estadistica_denuncias loadEstadistica_denunciasByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Estadistica_denuncias[] estadistica_denunciases = listEstadistica_denunciasByQuery(session, condition, orderBy);
		if (estadistica_denunciases != null && estadistica_denunciases.length > 0)
			return estadistica_denunciases[0];
		else
			return null;
	}
	
	public static Estadistica_denuncias loadEstadistica_denunciasByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Estadistica_denuncias[] estadistica_denunciases = listEstadistica_denunciasByQuery(session, condition, orderBy, lockMode);
		if (estadistica_denunciases != null && estadistica_denunciases.length > 0)
			return estadistica_denunciases[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateEstadistica_denunciasByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return iterateEstadistica_denunciasByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEstadistica_denunciasByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return iterateEstadistica_denunciasByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEstadistica_denunciasByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Estadistica_denuncias as Estadistica_denuncias");
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
	
	public static java.util.Iterator iterateEstadistica_denunciasByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Estadistica_denuncias as Estadistica_denuncias");
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
	
	public static Estadistica_denuncias createEstadistica_denuncias() {
		return new orm.Estadistica_denuncias();
	}
	
	public static boolean save(orm.Estadistica_denuncias estadistica_denuncias) throws PersistentException {
		try {
			orm.ChileDenunciaPersistentManager.instance().saveObject(estadistica_denuncias);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.Estadistica_denuncias estadistica_denuncias) throws PersistentException {
		try {
			orm.ChileDenunciaPersistentManager.instance().deleteObject(estadistica_denuncias);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Estadistica_denuncias estadistica_denuncias)throws PersistentException {
		try {
			orm.Denuncia[] lDenunciadens = estadistica_denuncias.denunciaden.toArray();
			for(int i = 0; i < lDenunciadens.length; i++) {
				lDenunciadens[i].estadistica.remove(estadistica_denuncias);
			}
			return delete(estadistica_denuncias);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Estadistica_denuncias estadistica_denuncias, org.orm.PersistentSession session)throws PersistentException {
		try {
			orm.Denuncia[] lDenunciadens = estadistica_denuncias.denunciaden.toArray();
			for(int i = 0; i < lDenunciadens.length; i++) {
				lDenunciadens[i].estadistica.remove(estadistica_denuncias);
			}
			try {
				session.delete(estadistica_denuncias);
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
	
	public static boolean refresh(orm.Estadistica_denuncias estadistica_denuncias) throws PersistentException {
		try {
			orm.ChileDenunciaPersistentManager.instance().getSession().refresh(estadistica_denuncias);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.Estadistica_denuncias estadistica_denuncias) throws PersistentException {
		try {
			orm.ChileDenunciaPersistentManager.instance().getSession().evict(estadistica_denuncias);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Estadistica_denuncias loadEstadistica_denunciasByCriteria(Estadistica_denunciasCriteria estadistica_denunciasCriteria) {
		Estadistica_denuncias[] estadistica_denunciases = listEstadistica_denunciasByCriteria(estadistica_denunciasCriteria);
		if(estadistica_denunciases == null || estadistica_denunciases.length == 0) {
			return null;
		}
		return estadistica_denunciases[0];
	}
	
	public static Estadistica_denuncias[] listEstadistica_denunciasByCriteria(Estadistica_denunciasCriteria estadistica_denunciasCriteria) {
		return estadistica_denunciasCriteria.listEstadistica_denuncias();
	}
}
