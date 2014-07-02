/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Universidad del Pais Vasco
 * License Type: Academic
 */
package orm;

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class UsuarioDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression usu_id;
	public final StringExpression usu_nombre;
	public final StringExpression usu_clave;
	public final StringExpression usu_ciudad;
	public final StringExpression usu_sector;
	public final StringExpression usu_mail;
	public final IntegerExpression usu_desactivar;
	
	public UsuarioDetachedCriteria() {
		super(orm.Usuario.class, orm.UsuarioCriteria.class);
		usu_id = new IntegerExpression("usu_id", this.getDetachedCriteria());
		usu_nombre = new StringExpression("usu_nombre", this.getDetachedCriteria());
		usu_clave = new StringExpression("usu_clave", this.getDetachedCriteria());
		usu_ciudad = new StringExpression("usu_ciudad", this.getDetachedCriteria());
		usu_sector = new StringExpression("usu_sector", this.getDetachedCriteria());
		usu_mail = new StringExpression("usu_mail", this.getDetachedCriteria());
		usu_desactivar = new IntegerExpression("usu_desactivar", this.getDetachedCriteria());
	}
	
	public UsuarioDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.UsuarioCriteria.class);
		usu_id = new IntegerExpression("usu_id", this.getDetachedCriteria());
		usu_nombre = new StringExpression("usu_nombre", this.getDetachedCriteria());
		usu_clave = new StringExpression("usu_clave", this.getDetachedCriteria());
		usu_ciudad = new StringExpression("usu_ciudad", this.getDetachedCriteria());
		usu_sector = new StringExpression("usu_sector", this.getDetachedCriteria());
		usu_mail = new StringExpression("usu_mail", this.getDetachedCriteria());
		usu_desactivar = new IntegerExpression("usu_desactivar", this.getDetachedCriteria());
	}
	
	public Autentificacion_red_socialDetachedCriteria createAutentificacion_red_socialauCriteria() {
		return new Autentificacion_red_socialDetachedCriteria(createCriteria("autentificacion_red_socialau"));
	}
	
	public DenunciaDetachedCriteria createDenunciaCriteria() {
		return new DenunciaDetachedCriteria(createCriteria("ORM_denuncia"));
	}
	
	public AutoridadDetachedCriteria createAutoridadCriteria() {
		return new AutoridadDetachedCriteria(createCriteria("autoridad"));
	}
	
	public Usuario uniqueUsuario(PersistentSession session) {
		return (Usuario) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Usuario[] listUsuario(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Usuario[]) list.toArray(new Usuario[list.size()]);
	}
}

