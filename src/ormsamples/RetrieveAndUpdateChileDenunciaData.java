/**
 * Licensee: Universidad del Pais Vasco
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateChileDenunciaData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = orm.ChileDenunciaPersistentManager.instance().getSession().beginTransaction();
		try {
			orm.Usuario lormUsuario = orm.UsuarioDAO.loadUsuarioByQuery(null, null);
			// Update the properties of the persistent object
			orm.UsuarioDAO.save(lormUsuario);
			orm.Denuncia lormDenuncia = orm.DenunciaDAO.loadDenunciaByQuery(null, null);
			// Update the properties of the persistent object
			orm.DenunciaDAO.save(lormDenuncia);
			orm.Estadistica_denuncias lormEstadistica_denuncias = orm.Estadistica_denunciasDAO.loadEstadistica_denunciasByQuery(null, null);
			// Update the properties of the persistent object
			orm.Estadistica_denunciasDAO.save(lormEstadistica_denuncias);
			orm.Estado_denuncia lormEstado_denuncia = orm.Estado_denunciaDAO.loadEstado_denunciaByQuery(null, null);
			// Update the properties of the persistent object
			orm.Estado_denunciaDAO.save(lormEstado_denuncia);
			orm.Autoridad lormAutoridad = orm.AutoridadDAO.loadAutoridadByQuery(null, null);
			// Update the properties of the persistent object
			orm.AutoridadDAO.save(lormAutoridad);
			orm.Fichero_evidencia lormFichero_evidencia = orm.Fichero_evidenciaDAO.loadFichero_evidenciaByQuery(null, null);
			// Update the properties of the persistent object
			orm.Fichero_evidenciaDAO.save(lormFichero_evidencia);
			orm.Tipoautoridad lormTipoautoridad = orm.TipoautoridadDAO.loadTipoautoridadByQuery(null, null);
			// Update the properties of the persistent object
			orm.TipoautoridadDAO.save(lormTipoautoridad);
			orm.Login lormLogin = orm.LoginDAO.loadLoginByQuery(null, null);
			// Update the properties of the persistent object
			orm.LoginDAO.save(lormLogin);
			orm.Contacto lormContacto = orm.ContactoDAO.loadContactoByQuery(null, null);
			// Update the properties of the persistent object
			orm.ContactoDAO.save(lormContacto);
			orm.Autentificacion_red_social lormAutentificacion_red_social = orm.Autentificacion_red_socialDAO.loadAutentificacion_red_socialByQuery(null, null);
			// Update the properties of the persistent object
			orm.Autentificacion_red_socialDAO.save(lormAutentificacion_red_social);
			orm.Visardenuncia lormVisardenuncia = orm.VisardenunciaDAO.loadVisardenunciaByQuery(null, null);
			// Update the properties of the persistent object
			orm.VisardenunciaDAO.save(lormVisardenuncia);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Usuario by UsuarioCriteria");
		orm.UsuarioCriteria lormUsuarioCriteria = new orm.UsuarioCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormUsuarioCriteria.usu_id.eq();
		System.out.println(lormUsuarioCriteria.uniqueUsuario());
		
		System.out.println("Retrieving Denuncia by DenunciaCriteria");
		orm.DenunciaCriteria lormDenunciaCriteria = new orm.DenunciaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormDenunciaCriteria.den_id.eq();
		System.out.println(lormDenunciaCriteria.uniqueDenuncia());
		
		System.out.println("Retrieving Estadistica_denuncias by Estadistica_denunciasCriteria");
		orm.Estadistica_denunciasCriteria lormEstadistica_denunciasCriteria = new orm.Estadistica_denunciasCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormEstadistica_denunciasCriteria.ed_id.eq();
		System.out.println(lormEstadistica_denunciasCriteria.uniqueEstadistica_denuncias());
		
		System.out.println("Retrieving Estado_denuncia by Estado_denunciaCriteria");
		orm.Estado_denunciaCriteria lormEstado_denunciaCriteria = new orm.Estado_denunciaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormEstado_denunciaCriteria.ed_id.eq();
		System.out.println(lormEstado_denunciaCriteria.uniqueEstado_denuncia());
		
		System.out.println("Retrieving Autoridad by AutoridadCriteria");
		orm.AutoridadCriteria lormAutoridadCriteria = new orm.AutoridadCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormAutoridadCriteria.au_id.eq();
		System.out.println(lormAutoridadCriteria.uniqueAutoridad());
		
		System.out.println("Retrieving Fichero_evidencia by Fichero_evidenciaCriteria");
		orm.Fichero_evidenciaCriteria lormFichero_evidenciaCriteria = new orm.Fichero_evidenciaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormFichero_evidenciaCriteria.fe_id.eq();
		System.out.println(lormFichero_evidenciaCriteria.uniqueFichero_evidencia());
		
		System.out.println("Retrieving Tipoautoridad by TipoautoridadCriteria");
		orm.TipoautoridadCriteria lormTipoautoridadCriteria = new orm.TipoautoridadCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormTipoautoridadCriteria.id.eq();
		System.out.println(lormTipoautoridadCriteria.uniqueTipoautoridad());
		
		System.out.println("Retrieving Login by LoginCriteria");
		orm.LoginCriteria lormLoginCriteria = new orm.LoginCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormLoginCriteria.lo_id.eq();
		System.out.println(lormLoginCriteria.uniqueLogin());
		
		System.out.println("Retrieving Contacto by ContactoCriteria");
		orm.ContactoCriteria lormContactoCriteria = new orm.ContactoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormContactoCriteria.con_id.eq();
		System.out.println(lormContactoCriteria.uniqueContacto());
		
		System.out.println("Retrieving Autentificacion_red_social by Autentificacion_red_socialCriteria");
		orm.Autentificacion_red_socialCriteria lormAutentificacion_red_socialCriteria = new orm.Autentificacion_red_socialCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormAutentificacion_red_socialCriteria.au_id.eq();
		System.out.println(lormAutentificacion_red_socialCriteria.uniqueAutentificacion_red_social());
		
		System.out.println("Retrieving Visardenuncia by VisardenunciaCriteria");
		orm.VisardenunciaCriteria lormVisardenunciaCriteria = new orm.VisardenunciaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormVisardenunciaCriteria.id.eq();
		System.out.println(lormVisardenunciaCriteria.uniqueVisardenuncia());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateChileDenunciaData retrieveAndUpdateChileDenunciaData = new RetrieveAndUpdateChileDenunciaData();
			try {
				retrieveAndUpdateChileDenunciaData.retrieveAndUpdateTestData();
				//retrieveAndUpdateChileDenunciaData.retrieveByCriteria();
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
