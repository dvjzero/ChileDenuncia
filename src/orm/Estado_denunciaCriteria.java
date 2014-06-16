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

public class Estado_denunciaCriteria extends AbstractORMCriteria {
	public final IntegerExpression ed_id;
	public final IntegerExpression ed_estado_actual;
	
	public Estado_denunciaCriteria(Criteria criteria) {
		super(criteria);
		ed_id = new IntegerExpression("ed_id", this);
		ed_estado_actual = new IntegerExpression("ed_estado_actual", this);
	}
	
	public Estado_denunciaCriteria(PersistentSession session) {
		this(session.createCriteria(Estado_denuncia.class));
	}
	
	public Estado_denunciaCriteria() throws PersistentException {
		this(orm.ChileDenunciaPersistentManager.instance().getSession());
	}
	
	public DenunciaCriteria createDenunciaCriteria() {
		return new DenunciaCriteria(createCriteria("ORM_denuncia"));
	}
	
	public Estado_denuncia uniqueEstado_denuncia() {
		return (Estado_denuncia) super.uniqueResult();
	}
	
	public Estado_denuncia[] listEstado_denuncia() {
		java.util.List list = super.list();
		return (Estado_denuncia[]) list.toArray(new Estado_denuncia[list.size()]);
	}
}

