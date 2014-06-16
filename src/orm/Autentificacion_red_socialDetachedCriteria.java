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

public class Autentificacion_red_socialDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression au_id;
	public final StringExpression au_tipo_red;
	
	public Autentificacion_red_socialDetachedCriteria() {
		super(orm.Autentificacion_red_social.class, orm.Autentificacion_red_socialCriteria.class);
		au_id = new IntegerExpression("au_id", this.getDetachedCriteria());
		au_tipo_red = new StringExpression("au_tipo_red", this.getDetachedCriteria());
	}
	
	public Autentificacion_red_socialDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.Autentificacion_red_socialCriteria.class);
		au_id = new IntegerExpression("au_id", this.getDetachedCriteria());
		au_tipo_red = new StringExpression("au_tipo_red", this.getDetachedCriteria());
	}
	
	public UsuarioDetachedCriteria createUsuarioCriteria() {
		return new UsuarioDetachedCriteria(createCriteria("ORM_usuario"));
	}
	
	public Autentificacion_red_social uniqueAutentificacion_red_social(PersistentSession session) {
		return (Autentificacion_red_social) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Autentificacion_red_social[] listAutentificacion_red_social(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Autentificacion_red_social[]) list.toArray(new Autentificacion_red_social[list.size()]);
	}
}

