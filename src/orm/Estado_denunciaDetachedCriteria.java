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

public class Estado_denunciaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ed_id;
	public final IntegerExpression ed_estado_actual;
	
	public Estado_denunciaDetachedCriteria() {
		super(orm.Estado_denuncia.class, orm.Estado_denunciaCriteria.class);
		ed_id = new IntegerExpression("ed_id", this.getDetachedCriteria());
		ed_estado_actual = new IntegerExpression("ed_estado_actual", this.getDetachedCriteria());
	}
	
	public Estado_denunciaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.Estado_denunciaCriteria.class);
		ed_id = new IntegerExpression("ed_id", this.getDetachedCriteria());
		ed_estado_actual = new IntegerExpression("ed_estado_actual", this.getDetachedCriteria());
	}
	
	public DenunciaDetachedCriteria createDenunciaCriteria() {
		return new DenunciaDetachedCriteria(createCriteria("ORM_denuncia"));
	}
	
	public Estado_denuncia uniqueEstado_denuncia(PersistentSession session) {
		return (Estado_denuncia) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Estado_denuncia[] listEstado_denuncia(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Estado_denuncia[]) list.toArray(new Estado_denuncia[list.size()]);
	}
}

