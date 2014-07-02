package junit;

import static org.junit.Assert.*;

import org.junit.Test;



import com.sun.mail.iap.Response;
import domain.ContactanosVO;
import domain.DenunciaVO;
import domain.UsuarioVO;
import domain.ContactanosVO;
public class JunitAgregarContactanos {

	@Test
	public void test() {
		ContactanosVO datos = new ContactanosVO();
		
		
		
		datos.setNombre("Lucho");
		datos.setCorreo("ohcul2@lucho.cl");
		datos.setAsunto("Sugerencias");
		datos.setMensaje("Excelente sitio");

		datos.setNombre(null);
		datos.setCorreo("ohcul2@lucho.cl");
		datos.setAsunto("Sugerencias");
		datos.setMensaje("Excelente sitio");
				
		datos.setNombre("Lucho");
		datos.setCorreo(null);
		datos.setAsunto("Sugerencias");
		datos.setMensaje("Excelente sitio");
				
		datos.setNombre("Lucho");
		datos.setCorreo("ohcul2@lucho.cl");
		datos.setAsunto(null);
		datos.setMensaje("Excelente sitio");
				
		datos.setNombre("Lucho");
		datos.setCorreo("ohcul2@lucho.cl");
		datos.setAsunto("Sugerencias");
		datos.setMensaje(null);
				
	}

}
