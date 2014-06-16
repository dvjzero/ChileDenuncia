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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class LoginCriteria extends AbstractORMCriteria {
	public final IntegerExpression lo_id;
	public final StringExpression lo_usuario;
	public final StringExpression lo_clave;
	public final IntegerExpression lo_tiempo;
	
	public LoginCriteria(Criteria criteria) {
		super(criteria);
		lo_id = new IntegerExpression("lo_id", this);
		lo_usuario = new StringExpression("lo_usuario", this);
		lo_clave = new StringExpression("lo_clave", this);
		lo_tiempo = new IntegerExpression("lo_tiempo", this);
	}
	
	public LoginCriteria(PersistentSession session) {
		this(session.createCriteria(Login.class));
	}
	
	public LoginCriteria() throws PersistentException {
		this(orm.ChileDenunciaPersistentManager.instance().getSession());
	}
	
	public UsuarioCriteria createUsuariousuCriteria() {
		return new UsuarioCriteria(createCriteria("usuariousu"));
	}
	
	public Login uniqueLogin() {
		return (Login) super.uniqueResult();
	}
	
	public Login[] listLogin() {
		java.util.List list = super.list();
		return (Login[]) list.toArray(new Login[list.size()]);
	}
}

