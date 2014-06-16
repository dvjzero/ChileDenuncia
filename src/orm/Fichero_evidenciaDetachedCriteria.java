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

public class Fichero_evidenciaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression fe_id;
	public final StringExpression fe_nombre;
	public final IntegerExpression fe_peso;
	public final StringExpression fe_formato;
	
	public Fichero_evidenciaDetachedCriteria() {
		super(orm.Fichero_evidencia.class, orm.Fichero_evidenciaCriteria.class);
		fe_id = new IntegerExpression("fe_id", this.getDetachedCriteria());
		fe_nombre = new StringExpression("fe_nombre", this.getDetachedCriteria());
		fe_peso = new IntegerExpression("fe_peso", this.getDetachedCriteria());
		fe_formato = new StringExpression("fe_formato", this.getDetachedCriteria());
	}
	
	public Fichero_evidenciaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.Fichero_evidenciaCriteria.class);
		fe_id = new IntegerExpression("fe_id", this.getDetachedCriteria());
		fe_nombre = new StringExpression("fe_nombre", this.getDetachedCriteria());
		fe_peso = new IntegerExpression("fe_peso", this.getDetachedCriteria());
		fe_formato = new StringExpression("fe_formato", this.getDetachedCriteria());
	}
	
	public DenunciaDetachedCriteria createDenunciadenCriteria() {
		return new DenunciaDetachedCriteria(createCriteria("denunciaden"));
	}
	
	public Fichero_evidencia uniqueFichero_evidencia(PersistentSession session) {
		return (Fichero_evidencia) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Fichero_evidencia[] listFichero_evidencia(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Fichero_evidencia[]) list.toArray(new Fichero_evidencia[list.size()]);
	}
}

