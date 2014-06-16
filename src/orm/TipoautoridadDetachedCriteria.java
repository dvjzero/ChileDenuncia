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

public class TipoautoridadDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression descripcion;
	
	public TipoautoridadDetachedCriteria() {
		super(orm.Tipoautoridad.class, orm.TipoautoridadCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		descripcion = new IntegerExpression("descripcion", this.getDetachedCriteria());
	}
	
	public TipoautoridadDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.TipoautoridadCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		descripcion = new IntegerExpression("descripcion", this.getDetachedCriteria());
	}
	
	public AutoridadDetachedCriteria createAutoridadCriteria() {
		return new AutoridadDetachedCriteria(createCriteria("ORM_autoridad"));
	}
	
	public Tipoautoridad uniqueTipoautoridad(PersistentSession session) {
		return (Tipoautoridad) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Tipoautoridad[] listTipoautoridad(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Tipoautoridad[]) list.toArray(new Tipoautoridad[list.size()]);
	}
}

