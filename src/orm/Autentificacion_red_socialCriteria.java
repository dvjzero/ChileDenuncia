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

public class Autentificacion_red_socialCriteria extends AbstractORMCriteria {
	public final IntegerExpression au_id;
	public final StringExpression au_tipo_red;
	
	public Autentificacion_red_socialCriteria(Criteria criteria) {
		super(criteria);
		au_id = new IntegerExpression("au_id", this);
		au_tipo_red = new StringExpression("au_tipo_red", this);
	}
	
	public Autentificacion_red_socialCriteria(PersistentSession session) {
		this(session.createCriteria(Autentificacion_red_social.class));
	}
	
	public Autentificacion_red_socialCriteria() throws PersistentException {
		this(orm.ChileDenunciaPersistentManager.instance().getSession());
	}
	
	public UsuarioCriteria createUsuarioCriteria() {
		return new UsuarioCriteria(createCriteria("ORM_usuario"));
	}
	
	public Autentificacion_red_social uniqueAutentificacion_red_social() {
		return (Autentificacion_red_social) super.uniqueResult();
	}
	
	public Autentificacion_red_social[] listAutentificacion_red_social() {
		java.util.List list = super.list();
		return (Autentificacion_red_social[]) list.toArray(new Autentificacion_red_social[list.size()]);
	}
}

