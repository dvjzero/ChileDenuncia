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

public class Estadistica_denunciasCriteria extends AbstractORMCriteria {
	public final IntegerExpression ed_id;
	public final StringExpression ed_usuario;
	public final StringExpression ed_tipo;
	public final StringExpression ed_denuncia;
	public final StringExpression ed_ciudad;
	public final StringExpression ed_sector;
	
	public Estadistica_denunciasCriteria(Criteria criteria) {
		super(criteria);
		ed_id = new IntegerExpression("ed_id", this);
		ed_usuario = new StringExpression("ed_usuario", this);
		ed_tipo = new StringExpression("ed_tipo", this);
		ed_denuncia = new StringExpression("ed_denuncia", this);
		ed_ciudad = new StringExpression("ed_ciudad", this);
		ed_sector = new StringExpression("ed_sector", this);
	}
	
	public Estadistica_denunciasCriteria(PersistentSession session) {
		this(session.createCriteria(Estadistica_denuncias.class));
	}
	
	public Estadistica_denunciasCriteria() throws PersistentException {
		this(orm.ChileDenunciaPersistentManager.instance().getSession());
	}
	
	public DenunciaCriteria createDenunciadenCriteria() {
		return new DenunciaCriteria(createCriteria("ORM_denunciaden"));
	}
	
	public Estadistica_denuncias uniqueEstadistica_denuncias() {
		return (Estadistica_denuncias) super.uniqueResult();
	}
	
	public Estadistica_denuncias[] listEstadistica_denuncias() {
		java.util.List list = super.list();
		return (Estadistica_denuncias[]) list.toArray(new Estadistica_denuncias[list.size()]);
	}
}

