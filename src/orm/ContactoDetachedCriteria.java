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

public class ContactoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression con_id;
	public final StringExpression con_nombre;
	public final StringExpression con_correo;
	public final IntegerExpression con_asunto;
	public final StringExpression con_mensaje;
	public final IntegerExpression usuariousu_id;
	
	public ContactoDetachedCriteria() {
		super(orm.Contacto.class, orm.ContactoCriteria.class);
		con_id = new IntegerExpression("con_id", this.getDetachedCriteria());
		con_nombre = new StringExpression("con_nombre", this.getDetachedCriteria());
		con_correo = new StringExpression("con_correo", this.getDetachedCriteria());
		con_asunto = new IntegerExpression("con_asunto", this.getDetachedCriteria());
		con_mensaje = new StringExpression("con_mensaje", this.getDetachedCriteria());
		usuariousu_id = new IntegerExpression("usuariousu_id", this.getDetachedCriteria());
	}
	
	public ContactoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.ContactoCriteria.class);
		con_id = new IntegerExpression("con_id", this.getDetachedCriteria());
		con_nombre = new StringExpression("con_nombre", this.getDetachedCriteria());
		con_correo = new StringExpression("con_correo", this.getDetachedCriteria());
		con_asunto = new IntegerExpression("con_asunto", this.getDetachedCriteria());
		con_mensaje = new StringExpression("con_mensaje", this.getDetachedCriteria());
		usuariousu_id = new IntegerExpression("usuariousu_id", this.getDetachedCriteria());
	}
	
	public Contacto uniqueContacto(PersistentSession session) {
		return (Contacto) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Contacto[] listContacto(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Contacto[]) list.toArray(new Contacto[list.size()]);
	}
}

