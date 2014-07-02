/**
 * Licensee: Universidad del Pais Vasco
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateDataEstado {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = orm.ChileDenunciaPersistentManager.instance().getSession().beginTransaction();
		try {
			orm.Estado_denuncia lormEstado_denuncia = orm.Estado_denunciaDAO.createEstado_denuncia();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : denuncia
			lormEstado_denuncia.setEd_estado_actual(1);
			orm.Estado_denunciaDAO.save(lormEstado_denuncia);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateDataEstado createChileDenunciaData = new CreateDataEstado();
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
