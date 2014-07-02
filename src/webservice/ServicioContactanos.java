package webservice;



import java.util.ArrayList;
import java.util.List;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import com.google.gson.Gson;

import domain.ContactanosVO;
import orm.ContactoDAO;;

public class ServicioContactanos {

	/**
	* Ingreso de registro Contáctanos
	* @param oContactanosVO
	* @return
	*/
	public String agregarContactanos(domain.ContactanosVO oContactanosVO){
	PersistentTransaction t;
	try {
		
		
	t= orm.ChileDenunciaPersistentManager.instance().getSession().beginTransaction();
	
	try {
		
		orm.Contacto lormContacto = orm.ContactoDAO.createContacto();
	lormContacto.setCon_nombre(oContactanosVO.getNombre());
	lormContacto.setCon_correo(oContactanosVO.getCorreo());
	lormContacto.setCon_asunto(oContactanosVO.getAsunto());
	lormContacto.setCon_mensaje(oContactanosVO.getMensaje());
	
	
	System.out.println("Ingreso Exitoso");
	
	/**
	* Valida que el objeto no sea vacio, o  sea que tenga algun valor ingresado
	* @param 
	* @return
	*/
	
	if(lormContacto.getCon_nombre().equals("")||lormContacto.getCon_correo().equals("")||lormContacto.getCon_asunto().equals("")||lormContacto.getCon_mensaje().equals("")){
		return "ingrese todos los campos";	
	}
	else{
		orm.ContactoDAO.save(lormContacto);
		
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
	* Retorna un listado de objeto de la clase ContactanosVO
	* @return List<domain.ContactanosVO>
	*/
	
	public List<domain.ContactanosVO> mostrarContactanos(){
		List<domain.ContactanosVO> contactanos = new ArrayList<domain.ContactanosVO>();
		orm.Contacto[] ormContacto;

		try{
			ormContacto = orm.ContactoDAO.listContactoByQuery(null, null);
			int length = ormContacto.length;
			for (int i = 0; i < length; i++) {
				System.out.println(ormContacto[i]);
				
				contactanos.add(new domain.ContactanosVO(ormContacto[i].getCon_nombre(),
						ormContacto[i].getCon_correo(),
						ormContacto[i].getCon_asunto(),
						ormContacto[i].getCon_mensaje()));		
		}
			return contactanos;
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
			}
			
	}
	
	
	
	
}
