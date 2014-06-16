package webservice;
import java.util.ArrayList;
import java.util.List;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;


import domain.DenunciaVO;


public class ServicioDenuncia {

	

	/**
	* Ingreso de Registro
	* @param oDenunciaVO
	* @return
	*/
	public String agregarDenuncia(domain.DenunciaVO oDenunciaVO, String ciudad){
	PersistentTransaction t;
	try {
		//TODO  - TENGO QUE BUSCA EL OBJETO CIUDAD PRIMERO
		
	t= orm.ChileDenunciaPersistentManager.instance().getSession().beginTransaction();
	
	try {
	orm.Denuncia lormDenuncia = orm.DenunciaDAO.createDenuncia();
	// Initialize the properties of the persistent object here

	
	orm.Estado_denuncia lormEstado_denuncia = orm.Estado_denunciaDAO.getEstado_denunciaByORMID(1);
	orm.Usuario usuarioDenuncia = orm.UsuarioDAO.getUsuarioByORMID(1);
	lormDenuncia.setEstado_denunciaed(lormEstado_denuncia);
	lormDenuncia.setDen_tipo(oDenunciaVO.getTipo());
	lormDenuncia.setUsuariousu(usuarioDenuncia);
	lormDenuncia.setDen_denuncia(oDenunciaVO.getDenuncia());
	lormDenuncia.setDen_ciudad(oDenunciaVO.getCiudad());
	lormDenuncia.setDen_sector(oDenunciaVO.getSector());
	lormDenuncia.setDen_fecha_creacion(oDenunciaVO.getFecha_creacion());
	lormDenuncia.setDen_fecha_modificacion(oDenunciaVO.getFecha_modificacion());
	lormDenuncia.setDen_usuario_creador(oDenunciaVO.getUsuario_creador());
	lormDenuncia.setDen_usuario_modificador(oDenunciaVO.getUsuario_modificador());
	lormDenuncia.setDen_fecha_usuario_modifica(oDenunciaVO.getFecha_usuario_modifica());
	lormDenuncia.setDen_desactivar(oDenunciaVO.getDesactivar());
	
	
	System.out.println("Ingreso Exitoso");
	
	/**
	* Valida que el objeto no sea vacio, o  sea que tenga algun valor ingresado
	* @param 
	* @return
	*/
	
	if(lormDenuncia.getDen_tipo().equals("")||lormDenuncia.getDen_denuncia().equals("")||lormDenuncia.getDen_ciudad().equals("")||lormDenuncia.getDen_sector().equals("")||
			lormDenuncia.getDen_usuario_creador().equals("")){
		return "ingrese todos los campos";	
	}
	else{
		orm.DenunciaDAO.save(lormDenuncia);
		t.commit();
		return "ingreso existoso";
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
	
	public List<domain.DenunciaVO>mostrarDenuncia(){
		List<domain.DenunciaVO> denuncias = new ArrayList<domain.DenunciaVO>();
		orm.Denuncia[] ormDenuncias;
		try{
			ormDenuncias = orm.DenunciaDAO.listDenunciaByQuery(null, null);
			int length = ormDenuncias.length;
			for (int i = 0; i < length; i++) {
				System.out.println(ormDenuncias[i]);
				denuncias.add(new domain.DenunciaVO(ormDenuncias[i].getDen_tipo(),
						ormDenuncias[i].getDen_denuncia(),
						ormDenuncias[i].getDen_ciudad(),
						ormDenuncias[i].getDen_sector(),
						ormDenuncias[i].getDen_fecha_creacion(),
						ormDenuncias[i].getDen_fecha_modificacion(),
						ormDenuncias[i].getDen_usuario_creador(),
						ormDenuncias[i].getDen_usuario_modificador(),
						ormDenuncias[i].getDen_fecha_usuario_modifica(),
						ormDenuncias[i].getDen_desactivar()));		
		}
			return denuncias;
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
	public String eliminarDenuncia(String fecha_creacion) { // domain.DenunciaVO
		// oDenunciaVO,
PersistentTransaction t;
try {
	
	t = orm.ChileDenunciaPersistentManager.instance().getSession().beginTransaction();
try {
	
	orm.Denuncia lorDenuncia = orm.DenunciaDAO.loadDenunciaByQuery("fecha creacion= '"+ fecha_creacion + "'", null);
	
// Delete the persistent object
	
orm.DenunciaDAO.delete(lorDenuncia);
t.commit();
return "Contacto Eliminado con Exito";
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
	
	
	
	
	
	
	public List<domain.DenunciaVO> filtrarDenuncia(String usuario_creador)	{

		List<domain.DenunciaVO> denuncias = new ArrayList<domain.DenunciaVO>();
		orm.Denuncia[] ormDenuncias;
		try {
			ormDenuncias = orm.DenunciaDAO.listDenunciaByQuery("usuario_creador= '"+ usuario_creador + "'", null);
			int length = ormDenuncias.length;
			for (int i = 0; i < length; i++) {
				System.out.println(ormDenuncias[i]);
			}
			return denuncias;
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	}

	
	
	
	
	
	
	
	



