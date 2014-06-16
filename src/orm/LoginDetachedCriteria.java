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

public class LoginDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression lo_id;
	public final StringExpression lo_usuario;
	public final StringExpression lo_clave;
	public final IntegerExpression lo_tiempo;
	
	public LoginDetachedCriteria() {
		super(orm.Login.class, orm.LoginCriteria.class);
		lo_id = new IntegerExpression("lo_id", this.getDetachedCriteria());
		lo_usuario = new StringExpression("lo_usuario", this.getDetachedCriteria());
		lo_clave = new StringExpression("lo_clave", this.getDetachedCriteria());
		lo_tiempo = new IntegerExpression("lo_tiempo", this.getDetachedCriteria());
	}
	
	public LoginDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.LoginCriteria.class);
		lo_id = new IntegerExpression("lo_id", this.getDetachedCriteria());
		lo_usuario = new StringExpression("lo_usuario", this.getDetachedCriteria());
		lo_clave = new StringExpression("lo_clave", this.getDetachedCriteria());
		lo_tiempo = new IntegerExpression("lo_tiempo", this.getDetachedCriteria());
	}
	
	public UsuarioDetachedCriteria createUsuariousuCriteria() {
		return new UsuarioDetachedCriteria(createCriteria("usuariousu"));
	}
	
	public Login uniqueLogin(PersistentSession session) {
		return (Login) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Login[] listLogin(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Login[]) list.toArray(new Login[list.size()]);
	}
}

