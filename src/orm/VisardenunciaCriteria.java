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

public class VisardenunciaCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	
	public VisardenunciaCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
	}
	
	public VisardenunciaCriteria(PersistentSession session) {
		this(session.createCriteria(Visardenuncia.class));
	}
	
	public VisardenunciaCriteria() throws PersistentException {
		this(orm.ChileDenunciaPersistentManager.instance().getSession());
	}
	
	public AutoridadCriteria createAutoridadauCriteria() {
		return new AutoridadCriteria(createCriteria("autoridadau"));
	}
	
	public DenunciaCriteria createDenunciadenCriteria() {
		return new DenunciaCriteria(createCriteria("denunciaden"));
	}
	
	public Visardenuncia uniqueVisardenuncia() {
		return (Visardenuncia) super.uniqueResult();
	}
	
	public Visardenuncia[] listVisardenuncia() {
		java.util.List list = super.list();
		return (Visardenuncia[]) list.toArray(new Visardenuncia[list.size()]);
	}
}

