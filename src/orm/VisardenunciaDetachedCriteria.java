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

public class VisardenunciaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	
	public VisardenunciaDetachedCriteria() {
		super(orm.Visardenuncia.class, orm.VisardenunciaCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
	}
	
	public VisardenunciaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.VisardenunciaCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
	}
	
	public AutoridadDetachedCriteria createAutoridadauCriteria() {
		return new AutoridadDetachedCriteria(createCriteria("autoridadau"));
	}
	
	public DenunciaDetachedCriteria createDenunciadenCriteria() {
		return new DenunciaDetachedCriteria(createCriteria("denunciaden"));
	}
	
	public Visardenuncia uniqueVisardenuncia(PersistentSession session) {
		return (Visardenuncia) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Visardenuncia[] listVisardenuncia(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Visardenuncia[]) list.toArray(new Visardenuncia[list.size()]);
	}
}

