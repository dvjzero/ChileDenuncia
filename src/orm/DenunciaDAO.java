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

public class DenunciaDAO {
	public static Denuncia loadDenunciaByORMID(int den_id) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return loadDenunciaByORMID(session, den_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Denuncia getDenunciaByORMID(int den_id) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return getDenunciaByORMID(session, den_id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Denuncia loadDenunciaByORMID(int den_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return loadDenunciaByORMID(session, den_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Denuncia getDenunciaByORMID(int den_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return getDenunciaByORMID(session, den_id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Denuncia loadDenunciaByORMID(PersistentSession session, int den_id) throws PersistentException {
		try {
			return (Denuncia) session.load(orm.Denuncia.class, new Integer(den_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Denuncia getDenunciaByORMID(PersistentSession session, int den_id) throws PersistentException {
		try {
			return (Denuncia) session.get(orm.Denuncia.class, new Integer(den_id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Denuncia loadDenunciaByORMID(PersistentSession session, int den_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Denuncia) session.load(orm.Denuncia.class, new Integer(den_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Denuncia getDenunciaByORMID(PersistentSession session, int den_id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Denuncia) session.get(orm.Denuncia.class, new Integer(den_id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryDenuncia(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return queryDenuncia(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryDenuncia(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return queryDenuncia(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Denuncia[] listDenunciaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return listDenunciaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Denuncia[] listDenunciaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return listDenunciaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryDenuncia(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Denuncia as Denuncia");
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
	
	public static List queryDenuncia(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Denuncia as Denuncia");
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
	
	public static Denuncia[] listDenunciaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryDenuncia(session, condition, orderBy);
			return (Denuncia[]) list.toArray(new Denuncia[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Denuncia[] listDenunciaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryDenuncia(session, condition, orderBy, lockMode);
			return (Denuncia[]) list.toArray(new Denuncia[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Denuncia loadDenunciaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return loadDenunciaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Denuncia loadDenunciaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return loadDenunciaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Denuncia loadDenunciaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Denuncia[] denuncias = listDenunciaByQuery(session, condition, orderBy);
		if (denuncias != null && denuncias.length > 0)
			return denuncias[0];
		else
			return null;
	}
	
	public static Denuncia loadDenunciaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Denuncia[] denuncias = listDenunciaByQuery(session, condition, orderBy, lockMode);
		if (denuncias != null && denuncias.length > 0)
			return denuncias[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateDenunciaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return iterateDenunciaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateDenunciaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.ChileDenunciaPersistentManager.instance().getSession();
			return iterateDenunciaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateDenunciaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Denuncia as Denuncia");
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
	
	public static java.util.Iterator iterateDenunciaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From orm.Denuncia as Denuncia");
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
	
	public static Denuncia createDenuncia() {
		return new orm.Denuncia();
	}
	
	public static boolean save(orm.Denuncia denuncia) throws PersistentException {
		try {
			orm.ChileDenunciaPersistentManager.instance().saveObject(denuncia);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(orm.Denuncia denuncia) throws PersistentException {
		try {
			orm.ChileDenunciaPersistentManager.instance().deleteObject(denuncia);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Denuncia denuncia)throws PersistentException {
		try {
			if(denuncia.getUsuariousu() != null) {
				denuncia.getUsuariousu().denuncia.remove(denuncia);
			}
			
			if(denuncia.getEstado_denunciaed() != null) {
				denuncia.getEstado_denunciaed().denuncia.remove(denuncia);
			}
			
			orm.Estadistica_denuncias[] lEstadisticas = denuncia.estadistica.toArray();
			for(int i = 0; i < lEstadisticas.length; i++) {
				lEstadisticas[i].denunciaden.remove(denuncia);
			}
			orm.Fichero_evidencia[] lFichero_evidencias = denuncia.fichero_evidencia.toArray();
			for(int i = 0; i < lFichero_evidencias.length; i++) {
				lFichero_evidencias[i].setDenunciaden(null);
			}
			if(denuncia.getVisardenuncia() != null) {
				denuncia.getVisardenuncia().setDenunciaden(null);
			}
			
			return delete(denuncia);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(orm.Denuncia denuncia, org.orm.PersistentSession session)throws PersistentException {
		try {
			if(denuncia.getUsuariousu() != null) {
				denuncia.getUsuariousu().denuncia.remove(denuncia);
			}
			
			if(denuncia.getEstado_denunciaed() != null) {
				denuncia.getEstado_denunciaed().denuncia.remove(denuncia);
			}
			
			orm.Estadistica_denuncias[] lEstadisticas = denuncia.estadistica.toArray();
			for(int i = 0; i < lEstadisticas.length; i++) {
				lEstadisticas[i].denunciaden.remove(denuncia);
			}
			orm.Fichero_evidencia[] lFichero_evidencias = denuncia.fichero_evidencia.toArray();
			for(int i = 0; i < lFichero_evidencias.length; i++) {
				lFichero_evidencias[i].setDenunciaden(null);
			}
			if(denuncia.getVisardenuncia() != null) {
				denuncia.getVisardenuncia().setDenunciaden(null);
			}
			
			try {
				session.delete(denuncia);
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
	
	public static boolean refresh(orm.Denuncia denuncia) throws PersistentException {
		try {
			orm.ChileDenunciaPersistentManager.instance().getSession().refresh(denuncia);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(orm.Denuncia denuncia) throws PersistentException {
		try {
			orm.ChileDenunciaPersistentManager.instance().getSession().evict(denuncia);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Denuncia loadDenunciaByCriteria(DenunciaCriteria denunciaCriteria) {
		Denuncia[] denuncias = listDenunciaByCriteria(denunciaCriteria);
		if(denuncias == null || denuncias.length == 0) {
			return null;
		}
		return denuncias[0];
	}
	
	public static Denuncia[] listDenunciaByCriteria(DenunciaCriteria denunciaCriteria) {
		return denunciaCriteria.listDenuncia();
	}
}
