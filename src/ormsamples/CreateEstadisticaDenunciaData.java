/**
 * Licensee: Universidad del Pais Vasco
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateEstadisticaDenunciaData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = orm.ChileDenunciaPersistentManager.instance().getSession().beginTransaction();
		try {

			orm.Estadistica_denuncias lormEstadistica_denuncias = orm.Estadistica_denunciasDAO.createEstadistica_denuncias();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : denunciaden
			lormEstadistica_denuncias.setEd_usuario("cako");
			lormEstadistica_denuncias.setEd_tipo("robo");
			lormEstadistica_denuncias.setEd_denuncia("tan robandooooo");
			lormEstadistica_denuncias.setEd_ciudad("temuco");
			lormEstadistica_denuncias.setEd_sector("amanecer");
		
			orm.Estadistica_denunciasDAO.save(lormEstadistica_denuncias);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateEstadisticaDenunciaData createChileDenunciaData = new CreateEstadisticaDenunciaData();
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
