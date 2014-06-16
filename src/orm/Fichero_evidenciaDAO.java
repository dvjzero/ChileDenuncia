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

public class Fichero_evidenciaDAO {
	public static Fichero_evidencia loadFichero_evidenciaByORMID(int fe_id) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return loadFichero_evidenciaByORMID(session, fe_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Fichero_evidencia getFichero_evidenciaByORMID(int fe_id) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return getFichero_evidenciaByORMID(session, fe_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Fichero_evidencia loadFichero_evidenciaByORMID(int fe_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return loadFichero_evidenciaByORMID(session, fe_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Fichero_evidencia getFichero_evidenciaByORMID(int fe_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return getFichero_evidenciaByORMID(session, fe_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Fichero_evidencia loadFichero_evidenciaByORMID(PersistentSession session, int fe_id) throws PersistentException {
		try {
			return (Fichero_evidencia) session.load(orm.Fichero_evidencia.class, new Integer(fe_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Fichero_evidencia getFichero_evidenciaByORMID(PersistentSession session, int fe_id) throws PersistentException {
		try {
			return (Fichero_evidencia) session.get(orm.Fichero_evidencia.class, new Integer(fe_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Fichero_evidencia loadFichero_evidenciaByORMID(PersistentSession session, int fe_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Fichero_evidencia) session.load(orm.Fichero_evidencia.class, new Integer(fe_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Fichero_evidencia getFichero_evidenciaByORMID(PersistentSession session, int fe_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Fichero_evidencia) session.get(orm.Fichero_evidencia.class, new Integer(fe_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryFichero_evidencia(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return queryFichero_evidencia(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryFichero_evidencia(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return queryFichero_evidencia(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Fichero_evidencia[] listFichero_evidenciaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return listFichero_evidenciaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Fichero_evidencia[] listFichero_evidenciaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return listFichero_evidenciaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryFichero_evidencia(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Fichero_evidencia as Fichero_evidencia");
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
	
	public static List queryFichero_evidencia(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Fichero_evidencia as Fichero_evidencia");
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
	
	public static Fichero_evidencia[] listFichero_evidenciaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryFichero_evidencia(session, condition, orderBy);
			return (Fichero_evidencia[]) list.toArray(new Fichero_evidencia[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Fichero_evidencia[] listFichero_evidenciaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryFichero_evidencia(session, condition, orderBy, lockMode);
			return (Fichero_evidencia[]) list.toArray(new Fichero_evidencia[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Fichero_evidencia loadFichero_evidenciaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return loadFichero_evidenciaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Fichero_evidencia loadFichero_evidenciaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return loadFichero_evidenciaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Fichero_evidencia loadFichero_evidenciaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Fichero_evidencia[] fichero_evidencias = listFichero_evidenciaByQuery(session, condition, orderBy);
		if (fichero_evidencias != null && fichero_evidencias.length > 0)
			return fichero_evidencias[0];
		else
			return null;
	}
	
	public static Fichero_evidencia loadFichero_evidenciaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Fichero_evidencia[] fichero_evidencias = listFichero_evidenciaByQuery(session, condition, orderBy, lockMode);
		if (fichero_evidencias != null && fichero_evidencias.length > 0)
			return fichero_evidencias[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateFichero_evidenciaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return iterateFichero_evidenciaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateFichero_evidenciaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return iterateFichero_evidenciaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateFichero_evidenciaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Fichero_evidencia as Fichero_evidencia");
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
	
	public static java.util.Iterator iterateFichero_evidenciaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Fichero_evidencia as Fichero_evidencia");
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
	
	public static Fichero_evidencia createFichero_evidencia() {
		return new orm.Fichero_evidencia();
	}
	
	public static boolean save(orm.Fichero_evidencia fichero_evidencia) throws PersistentException {
		try {
			orm.ChileDenunciaPersistentManager.instance().saveObject(fichero_evidencia);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.Fichero_evidencia fichero_evidencia) throws PersistentException {
		try {
			orm.ChileDenunciaPersistentManager.instance().deleteObject(fichero_evidencia);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Fichero_evidencia fichero_evidencia)throws PersistentException {
		try {
			if(fichero_evidencia.getDenunciaden() != null) {
				fichero_evidencia.getDenunciaden().fichero_evidencia.remove(fichero_evidencia);
			}
			
			return delete(fichero_evidencia);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Fichero_evidencia fichero_evidencia, org.orm.PersistentSession session)throws PersistentException {
		try {
			if(fichero_evidencia.getDenunciaden() != null) {
				fichero_evidencia.getDenunciaden().fichero_evidencia.remove(fichero_evidencia);
			}
			
			try {
				session.delete(fichero_evidencia);
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
	
	public static boolean refresh(orm.Fichero_evidencia fichero_evidencia) throws PersistentException {
		try {
			orm.ChileDenunciaPersistentManager.instance().getSession().refresh(fichero_evidencia);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.Fichero_evidencia fichero_evidencia) throws PersistentException {
		try {
			orm.ChileDenunciaPersistentManager.instance().getSession().evict(fichero_evidencia);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Fichero_evidencia loadFichero_evidenciaByCriteria(Fichero_evidenciaCriteria fichero_evidenciaCriteria) {
		Fichero_evidencia[] fichero_evidencias = listFichero_evidenciaByCriteria(fichero_evidenciaCriteria);
		if(fichero_evidencias == null || fichero_evidencias.length == 0) {
			return null;
		}
		return fichero_evidencias[0];
	}
	
	public static Fichero_evidencia[] listFichero_evidenciaByCriteria(Fichero_evidenciaCriteria fichero_evidenciaCriteria) {
		return fichero_evidenciaCriteria.listFichero_evidencia();
	}
}
