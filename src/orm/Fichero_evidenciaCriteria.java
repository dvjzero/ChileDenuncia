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

public class Fichero_evidenciaCriteria extends AbstractORMCriteria {
	public final IntegerExpression fe_id;
	public final StringExpression fe_nombre;
	public final IntegerExpression fe_peso;
	public final StringExpression fe_formato;
	
	public Fichero_evidenciaCriteria(Criteria criteria) {
		super(criteria);
		fe_id = new IntegerExpression("fe_id", this);
		fe_nombre = new StringExpression("fe_nombre", this);
		fe_peso = new IntegerExpression("fe_peso", this);
		fe_formato = new StringExpression("fe_formato", this);
	}
	
	public Fichero_evidenciaCriteria(PersistentSession session) {
		this(session.createCriteria(Fichero_evidencia.class));
	}
	
	public Fichero_evidenciaCriteria() throws PersistentException {
		this(orm.ChileDenunciaPersistentManager.instance().getSession());
	}
	
	public DenunciaCriteria createDenunciadenCriteria() {
		return new DenunciaCriteria(createCriteria("denunciaden"));
	}
	
	public Fichero_evidencia uniqueFichero_evidencia() {
		return (Fichero_evidencia) super.uniqueResult();
	}
	
	public Fichero_evidencia[] listFichero_evidencia() {
		java.util.List list = super.list();
		return (Fichero_evidencia[]) list.toArray(new Fichero_evidencia[list.size()]);
	}
}

