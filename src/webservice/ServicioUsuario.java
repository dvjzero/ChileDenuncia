package webservice;

import java.util.ArrayList;
import java.util.List;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class ServicioUsuario {

	
	


	

	/**
	* Ingreso de Registro
	* @param oDenunciaVO
	* @return
	*/
	public String agregarUsuario(domain.UsuarioVO oUsuarioVO){
	PersistentTransaction t;
	try {
		
		
	t= orm.ChileDenunciaPersistentManager.instance().getSession().beginTransaction();
	
	try {
	orm.Usuario lormUsuario = orm.UsuarioDAO.createUsuario();
	// Initialize the properties of the persistent object here
	lormUsuario.setUsu_nombre(oUsuarioVO.getNombre());
	lormUsuario.setUsu_clave(oUsuarioVO.getClave());
	lormUsuario.setUsu_ciudad(oUsuarioVO.getCiudad());
	lormUsuario.setUsu_sector(oUsuarioVO.getSector());
	lormUsuario.setUsu_mail(oUsuarioVO.getMail());
	lormUsuario.setUsu_desactivar(oUsuarioVO.getDesactivar());
	
	
	
	System.out.println("Ingreso Exitoso");
	
	/**
	* Valida que el objeto no sea vacio, o  sea que tenga algun valor ingresado
	* @param 
	* @return
	*/
	
	if(lormUsuario.getUsu_nombre().equals("")||lormUsuario.getUsu_clave().equals("")||lormUsuario.getUsu_ciudad().equals("")||lormUsuario.getUsu_sector().equals("")||
			lormUsuario.getUsu_mail().equals("")){
		return "ingrese todos los campos";	
	}
	else{
		orm.UsuarioDAO.save(lormUsuario);
		t.commit();
		return "ingreso de Usuario existoso";
	}
	
	}
	catch (Exception e) {
	t.rollback();
	return "Error-Rollback";
	}
	} catch (PersistentException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
	return "Error persistencia";
	}


}	
	
	

	
	
	
	
	/**
	* Retorna un listado de objeto de la clase DenunciaVO
	* @return List<domain.DenunciaVO>
	*/
	
	public List<domain.UsuarioVO>mostrarUsuario(){
		List<domain.UsuarioVO> usuarios = new ArrayList<domain.UsuarioVO>();
		orm.Usuario[] ormUsuario;
		try{
			ormUsuario = orm.UsuarioDAO.listUsuarioByQuery(null, null);
			int length = ormUsuario.length;
			for (int i = 0; i < length; i++) {
				System.out.println(ormUsuario[i]);
				usuarios.add(new domain.UsuarioVO(ormUsuario[i].getUsu_nombre(),
						ormUsuario[i].getUsu_clave(),
						ormUsuario[i].getUsu_ciudad(),
						ormUsuario[i].getUsu_sector(),
						ormUsuario[i].getUsu_mail(),
						ormUsuario[i].getUsu_desactivar()));		
		}
			return usuarios;
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
			}
			
	}
	
	
	
	
	
	
	
	
	/**
	* Elimina el contacto a traves del nombre en la base de datos
	* @return List<domain.DenunciaVO>
	*/
	public String eliminarUsuario(String nombre) { // domain.UsuarioVO
		// oUsuarioVO,
PersistentTransaction t;
try {
	
	t = orm.ChileDenunciaPersistentManager.instance().getSession().beginTransaction();
try {
	
	orm.Usuario lorUsuario = orm.UsuarioDAO.loadUsuarioByQuery("nombre= '"+ nombre + "'", null);
	
// Delete the persistent object
	
orm.UsuarioDAO.delete(lorUsuario);
t.commit();
return "Usuario Eliminado con Exito";
} catch (Exception e) {
t.rollback();
return "Error-Rollback";
}
} catch (PersistentException e1) {
// TODO Auto-generated catch block
e1.printStackTrace();
return "Error persistencia";
}
}
	
	
	
	
	
	
	public List<domain.UsuarioVO> filtrarUsuario(String nombre)	{

		List<domain.UsuarioVO> usuarios = new ArrayList<domain.UsuarioVO>();
		orm.Usuario[] ormUsuarios;
		try {
			ormUsuarios = orm.UsuarioDAO.listUsuarioByQuery("nombre '"+ nombre+ "'", null);
			int length = ormUsuarios.length;
			for (int i = 0; i < length; i++) {
				System.out.println(ormUsuarios[i]);
			}
			return usuarios;
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
}
