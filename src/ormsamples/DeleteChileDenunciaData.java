/**
 * Licensee: Universidad del Pais Vasco
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class DeleteChileDenunciaData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = orm.ChileDenunciaPersistentManager.instance().getSession().beginTransaction();
		try {
			orm.Usuario lormUsuario = orm.UsuarioDAO.loadUsuarioByQuery(null, null);
			// Delete the persistent object
			orm.UsuarioDAO.delete(lormUsuario);
			orm.Denuncia lormDenuncia = orm.DenunciaDAO.loadDenunciaByQuery(null, null);
			// Delete the persistent object
			orm.DenunciaDAO.delete(lormDenuncia);
			orm.Estadistica_denuncias lormEstadistica_denuncias = orm.Estadistica_denunciasDAO.loadEstadistica_denunciasByQuery(null, null);
			// Delete the persistent object
			orm.Estadistica_denunciasDAO.delete(lormEstadistica_denuncias);
			orm.Estado_denuncia lormEstado_denuncia = orm.Estado_denunciaDAO.loadEstado_denunciaByQuery(null, null);
			// Delete the persistent object
			orm.Estado_denunciaDAO.delete(lormEstado_denuncia);
			orm.Autoridad lormAutoridad = orm.AutoridadDAO.loadAutoridadByQuery(null, null);
			// Delete the persistent object
			orm.AutoridadDAO.delete(lormAutoridad);
			orm.Fichero_evidencia lormFichero_evidencia = orm.Fichero_evidenciaDAO.loadFichero_evidenciaByQuery(null, null);
			// Delete the persistent object
			orm.Fichero_evidenciaDAO.delete(lormFichero_evidencia);
			orm.Tipoautoridad lormTipoautoridad = orm.TipoautoridadDAO.loadTipoautoridadByQuery(null, null);
			// Delete the persistent object
			orm.TipoautoridadDAO.delete(lormTipoautoridad);
			orm.Contacto lormContacto = orm.ContactoDAO.loadContactoByQuery(null, null);
			// Delete the persistent object
			orm.ContactoDAO.delete(lormContacto);
			orm.Autentificacion_red_social lormAutentificacion_red_social = orm.Autentificacion_red_socialDAO.loadAutentificacion_red_socialByQuery(null, null);
			// Delete the persistent object
			orm.Autentificacion_red_socialDAO.delete(lormAutentificacion_red_social);
			orm.Visardenuncia lormVisardenuncia = orm.VisardenunciaDAO.loadVisardenunciaByQuery(null, null);
			// Delete the persistent object
			orm.VisardenunciaDAO.delete(lormVisardenuncia);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteChileDenunciaData deleteChileDenunciaData = new DeleteChileDenunciaData();
			try {
				deleteChileDenunciaData.deleteTestData();
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
