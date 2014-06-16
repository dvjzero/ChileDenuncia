/**
 * Licensee: Universidad del Pais Vasco
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateDataUsuario {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = orm.ChileDenunciaPersistentManager.instance().getSession().beginTransaction();
		try {
			orm.Usuario lormUsuario = orm.UsuarioDAO.createUsuario();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : login, autoridad, denuncia, usu_nombre
			lormUsuario.setUsu_nombre("chuña");
			lormUsuario.setUsu_clave("aabb");
			lormUsuario.setUsu_ciudad("Santiago");
			lormUsuario.setUsu_sector("alameda");
			lormUsuario.setUsu_mail("mail@mail.cl");
			lormUsuario.setUsu_desactivar(1);
			
			orm.UsuarioDAO.save(lormUsuario);
			
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateDataUsuario createChileDenunciaData = new CreateDataUsuario();
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
