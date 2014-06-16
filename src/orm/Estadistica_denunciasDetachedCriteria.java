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

public class Estadistica_denunciasDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ed_id;
	public final StringExpression ed_usuario;
	public final StringExpression ed_tipo;
	public final StringExpression ed_denuncia;
	public final StringExpression ed_ciudad;
	public final StringExpression ed_sector;
	
	public Estadistica_denunciasDetachedCriteria() {
		super(orm.Estadistica_denuncias.class, orm.Estadistica_denunciasCriteria.class);
		ed_id = new IntegerExpression("ed_id", this.getDetachedCriteria());
		ed_usuario = new StringExpression("ed_usuario", this.getDetachedCriteria());
		ed_tipo = new StringExpression("ed_tipo", this.getDetachedCriteria());
		ed_denuncia = new StringExpression("ed_denuncia", this.getDetachedCriteria());
		ed_ciudad = new StringExpression("ed_ciudad", this.getDetachedCriteria());
		ed_sector = new StringExpression("ed_sector", this.getDetachedCriteria());
	}
	
	public Estadistica_denunciasDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.Estadistica_denunciasCriteria.class);
		ed_id = new IntegerExpression("ed_id", this.getDetachedCriteria());
		ed_usuario = new StringExpression("ed_usuario", this.getDetachedCriteria());
		ed_tipo = new StringExpression("ed_tipo", this.getDetachedCriteria());
		ed_denuncia = new StringExpression("ed_denuncia", this.getDetachedCriteria());
		ed_ciudad = new StringExpression("ed_ciudad", this.getDetachedCriteria());
		ed_sector = new StringExpression("ed_sector", this.getDetachedCriteria());
	}
	
	public DenunciaDetachedCriteria createDenunciadenCriteria() {
		return new DenunciaDetachedCriteria(createCriteria("ORM_denunciaden"));
	}
	
	public Estadistica_denuncias uniqueEstadistica_denuncias(PersistentSession session) {
		return (Estadistica_denuncias) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Estadistica_denuncias[] listEstadistica_denuncias(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Estadistica_denuncias[]) list.toArray(new Estadistica_denuncias[list.size()]);
	}
}

