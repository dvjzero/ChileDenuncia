/**
 * Licensee: Universidad del Pais Vasco
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class ListChileDenunciaData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Usuario...");
		orm.Usuario[] ormUsuarios = orm.UsuarioDAO.listUsuarioByQuery(null, null);
		int length = Math.min(ormUsuarios.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormUsuarios[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Denuncia...");
		orm.Denuncia[] ormDenuncias = orm.DenunciaDAO.listDenunciaByQuery(null, null);
		length = Math.min(ormDenuncias.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormDenuncias[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Estadistica_denuncias...");
		orm.Estadistica_denuncias[] ormEstadistica_denunciases = orm.Estadistica_denunciasDAO.listEstadistica_denunciasByQuery(null, null);
		length = Math.min(ormEstadistica_denunciases.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormEstadistica_denunciases[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Estado_denuncia...");
		orm.Estado_denuncia[] ormEstado_denuncias = orm.Estado_denunciaDAO.listEstado_denunciaByQuery(null, null);
		length = Math.min(ormEstado_denuncias.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormEstado_denuncias[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Autoridad...");
		orm.Autoridad[] ormAutoridads = orm.AutoridadDAO.listAutoridadByQuery(null, null);
		length = Math.min(ormAutoridads.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormAutoridads[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Fichero_evidencia...");
		orm.Fichero_evidencia[] ormFichero_evidencias = orm.Fichero_evidenciaDAO.listFichero_evidenciaByQuery(null, null);
		length = Math.min(ormFichero_evidencias.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormFichero_evidencias[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Tipoautoridad...");
		orm.Tipoautoridad[] ormTipoautoridads = orm.TipoautoridadDAO.listTipoautoridadByQuery(null, null);
		length = Math.min(ormTipoautoridads.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormTipoautoridads[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Login...");
		orm.Login[] ormLogins = orm.LoginDAO.listLoginByQuery(null, null);
		length = Math.min(ormLogins.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormLogins[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Contacto...");
		orm.Contacto[] ormContactos = orm.ContactoDAO.listContactoByQuery(null, null);
		length = Math.min(ormContactos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormContactos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Autentificacion_red_social...");
		orm.Autentificacion_red_social[] ormAutentificacion_red_socials = orm.Autentificacion_red_socialDAO.listAutentificacion_red_socialByQuery(null, null);
		length = Math.min(ormAutentificacion_red_socials.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormAutentificacion_red_socials[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Visardenuncia...");
		orm.Visardenuncia[] ormVisardenuncias = orm.VisardenunciaDAO.listVisardenunciaByQuery(null, null);
		length = Math.min(ormVisardenuncias.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormVisardenuncias[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException  {
		System.out.println("Listing Usuario by Criteria...");
		orm.UsuarioCriteria lormUsuarioCriteria = new orm.UsuarioCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormUsuarioCriteria.usu_id.eq();
		lormUsuarioCriteria.setMaxResults(ROW_COUNT);
		orm.Usuario[] ormUsuarios = lormUsuarioCriteria.listUsuario();
		int length =ormUsuarios== null ? 0 : Math.min(ormUsuarios.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormUsuarios[i]);
		}
		System.out.println(length + " Usuario record(s) retrieved."); 
		
		System.out.println("Listing Denuncia by Criteria...");
		orm.DenunciaCriteria lormDenunciaCriteria = new orm.DenunciaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormDenunciaCriteria.den_id.eq();
		lormDenunciaCriteria.setMaxResults(ROW_COUNT);
		orm.Denuncia[] ormDenuncias = lormDenunciaCriteria.listDenuncia();
		length =ormDenuncias== null ? 0 : Math.min(ormDenuncias.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormDenuncias[i]);
		}
		System.out.println(length + " Denuncia record(s) retrieved."); 
		
		System.out.println("Listing Estadistica_denuncias by Criteria...");
		orm.Estadistica_denunciasCriteria lormEstadistica_denunciasCriteria = new orm.Estadistica_denunciasCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormEstadistica_denunciasCriteria.ed_id.eq();
		lormEstadistica_denunciasCriteria.setMaxResults(ROW_COUNT);
		orm.Estadistica_denuncias[] ormEstadistica_denunciases = lormEstadistica_denunciasCriteria.listEstadistica_denuncias();
		length =ormEstadistica_denunciases== null ? 0 : Math.min(ormEstadistica_denunciases.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormEstadistica_denunciases[i]);
		}
		System.out.println(length + " Estadistica_denuncias record(s) retrieved."); 
		
		System.out.println("Listing Estado_denuncia by Criteria...");
		orm.Estado_denunciaCriteria lormEstado_denunciaCriteria = new orm.Estado_denunciaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormEstado_denunciaCriteria.ed_id.eq();
		lormEstado_denunciaCriteria.setMaxResults(ROW_COUNT);
		orm.Estado_denuncia[] ormEstado_denuncias = lormEstado_denunciaCriteria.listEstado_denuncia();
		length =ormEstado_denuncias== null ? 0 : Math.min(ormEstado_denuncias.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormEstado_denuncias[i]);
		}
		System.out.println(length + " Estado_denuncia record(s) retrieved."); 
		
		System.out.println("Listing Autoridad by Criteria...");
		orm.AutoridadCriteria lormAutoridadCriteria = new orm.AutoridadCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormAutoridadCriteria.au_id.eq();
		lormAutoridadCriteria.setMaxResults(ROW_COUNT);
		orm.Autoridad[] ormAutoridads = lormAutoridadCriteria.listAutoridad();
		length =ormAutoridads== null ? 0 : Math.min(ormAutoridads.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormAutoridads[i]);
		}
		System.out.println(length + " Autoridad record(s) retrieved."); 
		
		System.out.println("Listing Fichero_evidencia by Criteria...");
		orm.Fichero_evidenciaCriteria lormFichero_evidenciaCriteria = new orm.Fichero_evidenciaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormFichero_evidenciaCriteria.fe_id.eq();
		lormFichero_evidenciaCriteria.setMaxResults(ROW_COUNT);
		orm.Fichero_evidencia[] ormFichero_evidencias = lormFichero_evidenciaCriteria.listFichero_evidencia();
		length =ormFichero_evidencias== null ? 0 : Math.min(ormFichero_evidencias.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormFichero_evidencias[i]);
		}
		System.out.println(length + " Fichero_evidencia record(s) retrieved."); 
		
		System.out.println("Listing Tipoautoridad by Criteria...");
		orm.TipoautoridadCriteria lormTipoautoridadCriteria = new orm.TipoautoridadCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormTipoautoridadCriteria.id.eq();
		lormTipoautoridadCriteria.setMaxResults(ROW_COUNT);
		orm.Tipoautoridad[] ormTipoautoridads = lormTipoautoridadCriteria.listTipoautoridad();
		length =ormTipoautoridads== null ? 0 : Math.min(ormTipoautoridads.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormTipoautoridads[i]);
		}
		System.out.println(length + " Tipoautoridad record(s) retrieved."); 
		
		System.out.println("Listing Login by Criteria...");
		orm.LoginCriteria lormLoginCriteria = new orm.LoginCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormLoginCriteria.lo_id.eq();
		lormLoginCriteria.setMaxResults(ROW_COUNT);
		orm.Login[] ormLogins = lormLoginCriteria.listLogin();
		length =ormLogins== null ? 0 : Math.min(ormLogins.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormLogins[i]);
		}
		System.out.println(length + " Login record(s) retrieved."); 
		
		System.out.println("Listing Contacto by Criteria...");
		orm.ContactoCriteria lormContactoCriteria = new orm.ContactoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormContactoCriteria.con_id.eq();
		lormContactoCriteria.setMaxResults(ROW_COUNT);
		orm.Contacto[] ormContactos = lormContactoCriteria.listContacto();
		length =ormContactos== null ? 0 : Math.min(ormContactos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormContactos[i]);
		}
		System.out.println(length + " Contacto record(s) retrieved."); 
		
		System.out.println("Listing Autentificacion_red_social by Criteria...");
		orm.Autentificacion_red_socialCriteria lormAutentificacion_red_socialCriteria = new orm.Autentificacion_red_socialCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormAutentificacion_red_socialCriteria.au_id.eq();
		lormAutentificacion_red_socialCriteria.setMaxResults(ROW_COUNT);
		orm.Autentificacion_red_social[] ormAutentificacion_red_socials = lormAutentificacion_red_socialCriteria.listAutentificacion_red_social();
		length =ormAutentificacion_red_socials== null ? 0 : Math.min(ormAutentificacion_red_socials.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormAutentificacion_red_socials[i]);
		}
		System.out.println(length + " Autentificacion_red_social record(s) retrieved."); 
		
		System.out.println("Listing Visardenuncia by Criteria...");
		orm.VisardenunciaCriteria lormVisardenunciaCriteria = new orm.VisardenunciaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormVisardenunciaCriteria.id.eq();
		lormVisardenunciaCriteria.setMaxResults(ROW_COUNT);
		orm.Visardenuncia[] ormVisardenuncias = lormVisardenunciaCriteria.listVisardenuncia();
		length =ormVisardenuncias== null ? 0 : Math.min(ormVisardenuncias.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormVisardenuncias[i]);
		}
		System.out.println(length + " Visardenuncia record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListChileDenunciaData listChileDenunciaData = new ListChileDenunciaData();
			try {
				listChileDenunciaData.listTestData();
				//listChileDenunciaData.listByCriteria();
			}
			finally {
				orm.ChileDenunciaPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
