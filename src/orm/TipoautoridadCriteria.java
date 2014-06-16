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

public class TipoautoridadCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final IntegerExpression descripcion;
	
	public TipoautoridadCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		descripcion = new IntegerExpression("descripcion", this);
	}
	
	public TipoautoridadCriteria(PersistentSession session) {
		this(session.createCriteria(Tipoautoridad.class));
	}
	
	public TipoautoridadCriteria() throws PersistentException {
		this(orm.ChileDenunciaPersistentManager.instance().getSession());
	}
	
	public AutoridadCriteria createAutoridadCriteria() {
		return new AutoridadCriteria(createCriteria("ORM_autoridad"));
	}
	
	public Tipoautoridad uniqueTipoautoridad() {
		return (Tipoautoridad) super.uniqueResult();
	}
	
	public Tipoautoridad[] listTipoautoridad() {
		java.util.List list = super.list();
		return (Tipoautoridad[]) list.toArray(new Tipoautoridad[list.size()]);
	}
}

