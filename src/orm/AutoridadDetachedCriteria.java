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

public class AutoridadDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression au_id;
	
	public AutoridadDetachedCriteria() {
		super(orm.Autoridad.class, orm.AutoridadCriteria.class);
		au_id = new IntegerExpression("au_id", this.getDetachedCriteria());
	}
	
	public AutoridadDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.AutoridadCriteria.class);
		au_id = new IntegerExpression("au_id", this.getDetachedCriteria());
	}
	
	public UsuarioDetachedCriteria createUsuariousuCriteria() {
		return new UsuarioDetachedCriteria(createCriteria("usuariousu"));
	}
	
	public TipoautoridadDetachedCriteria createTipoautoridadCriteria() {
		return new TipoautoridadDetachedCriteria(createCriteria("tipoautoridad"));
	}
	
	public VisardenunciaDetachedCriteria createVisardenunciaCriteria() {
		return new VisardenunciaDetachedCriteria(createCriteria("ORM_visardenuncia"));
	}
	
	public Autoridad uniqueAutoridad(PersistentSession session) {
		return (Autoridad) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Autoridad[] listAutoridad(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Autoridad[]) list.toArray(new Autoridad[list.size()]);
	}
}

