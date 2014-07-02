package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import orm.Usuario;

import com.sun.mail.iap.Response;

import domain.DenunciaVO;
import domain.UsuarioVO;
import domain.ContactanosVO;
public class JunitAgregarUsuario {

	@Test
	public void test() {
		UsuarioVO datos = new UsuarioVO();
		
		
		
		datos.setNombre("Lucho");
		datos.setClave("ohcul");
		datos.setCiudad("Temuco");
		datos.setSector("centro");
		datos.setMail("lucho@ohcul.cl");
		datos.setDesactivar(1);
		
		datos.setNombre(null);
		datos.setClave("ohcul");
		datos.setCiudad("Temuco");
		datos.setSector("centro");
		datos.setMail("lucho@ohcul.cl");
		datos.setDesactivar(1);
		
		datos.setNombre("Lucho");
		datos.setClave(null);
		datos.setCiudad("Temuco");
		datos.setSector("centro");
		datos.setMail("lucho@ohcul.cl");
		datos.setDesactivar(1);
		
		datos.setNombre("Lucho");
		datos.setClave("ohcul");
		datos.setCiudad(null);
		datos.setSector("centro");
		datos.setMail("lucho@ohcul.cl");
		datos.setDesactivar(1);
		
		datos.setNombre("Lucho");
		datos.setClave("ohcul");
		datos.setCiudad("Temuco");
		datos.setSector(null);
		datos.setMail("lucho@ohcul.cl");
		datos.setDesactivar(1);
		
		datos.setNombre("Lucho");
		datos.setClave("ohcul");
		datos.setCiudad("Temuco");
		datos.setSector("centro");
		datos.setMail(null);
		datos.setDesactivar(1);
		
		datos.setNombre("Lucho");
		datos.setClave("ohcul");
		datos.setCiudad("Temuco");
		datos.setSector("centro");
		datos.setMail("lucho@ohcul.cl");
		datos.setDesactivar(null);
		
	}

}
