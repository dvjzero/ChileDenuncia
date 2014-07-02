/**
 * Licensee: Universidad del Pais Vasco
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateChileDenunciaData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = orm.ChileDenunciaPersistentManager.instance().getSession().beginTransaction();
		try {
			orm.Usuario lormUsuario = orm.UsuarioDAO.createUsuario();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : autoridad, denuncia, usu_nombre
			orm.UsuarioDAO.save(lormUsuario);
			orm.Denuncia lormDenuncia = orm.DenunciaDAO.createDenuncia();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : visardenuncia, fichero_evidencia, estadistica, estado_denunciaed, usuariousu
			orm.DenunciaDAO.save(lormDenuncia);
			orm.Estadistica_denuncias lormEstadistica_denuncias = orm.Estadistica_denunciasDAO.createEstadistica_denuncias();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : denunciaden
			orm.Estadistica_denunciasDAO.save(lormEstadistica_denuncias);
			orm.Estado_denuncia lormEstado_denuncia = orm.Estado_denunciaDAO.createEstado_denuncia();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : denuncia
			orm.Estado_denunciaDAO.save(lormEstado_denuncia);
			orm.Autoridad lormAutoridad = orm.AutoridadDAO.createAutoridad();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : visardenuncia, usuariousu
			orm.AutoridadDAO.save(lormAutoridad);
			orm.Fichero_evidencia lormFichero_evidencia = orm.Fichero_evidenciaDAO.createFichero_evidencia();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : denunciaden
			orm.Fichero_evidenciaDAO.save(lormFichero_evidencia);
			orm.Tipoautoridad lormTipoautoridad = orm.TipoautoridadDAO.createTipoautoridad();
			// Initialize the properties of the persistent object here
			orm.TipoautoridadDAO.save(lormTipoautoridad);
			orm.Contacto lormContacto = orm.ContactoDAO.createContacto();
			// Initialize the properties of the persistent object here
			orm.ContactoDAO.save(lormContacto);
			orm.Autentificacion_red_social lormAutentificacion_red_social = orm.Autentificacion_red_socialDAO.createAutentificacion_red_social();
			// Initialize the properties of the persistent object here
			orm.Autentificacion_red_socialDAO.save(lormAutentificacion_red_social);
			orm.Visardenuncia lormVisardenuncia = orm.VisardenunciaDAO.createVisardenuncia();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : denunciaden, autoridadau
			orm.VisardenunciaDAO.save(lormVisardenuncia);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateChileDenunciaData createChileDenunciaData = new CreateChileDenunciaData();
			try {
				createChileDenunciaData.createTestData();
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
