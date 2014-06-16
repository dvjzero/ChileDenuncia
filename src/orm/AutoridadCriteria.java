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

public class AutoridadCriteria extends AbstractORMCriteria {
	public final IntegerExpression au_id;
	
	public AutoridadCriteria(Criteria criteria) {
		super(criteria);
		au_id = new IntegerExpression("au_id", this);
	}
	
	public AutoridadCriteria(PersistentSession session) {
		this(session.createCriteria(Autoridad.class));
	}
	
	public AutoridadCriteria() throws PersistentException {
		this(orm.ChileDenunciaPersistentManager.instance().getSession());
	}
	
	public UsuarioCriteria createUsuariousuCriteria() {
		return new UsuarioCriteria(createCriteria("usuariousu"));
	}
	
	public TipoautoridadCriteria createTipoautoridadCriteria() {
		return new TipoautoridadCriteria(createCriteria("tipoautoridad"));
	}
	
	public VisardenunciaCriteria createVisardenunciaCriteria() {
		return new VisardenunciaCriteria(createCriteria("ORM_visardenuncia"));
	}
	
	public Autoridad uniqueAutoridad() {
		return (Autoridad) super.uniqueResult();
	}
	
	public Autoridad[] listAutoridad() {
		java.util.List list = super.list();
		return (Autoridad[]) list.toArray(new Autoridad[list.size()]);
	}
}

