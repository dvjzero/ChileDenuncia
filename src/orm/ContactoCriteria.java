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

public class ContactoCriteria extends AbstractORMCriteria {
	public final IntegerExpression con_id;
	public final StringExpression con_nombre;
	public final StringExpression con_correo;
	public final IntegerExpression con_asunto;
	public final StringExpression con_mensaje;
	public final IntegerExpression usuariousu_id;
	
	public ContactoCriteria(Criteria criteria) {
		super(criteria);
		con_id = new IntegerExpression("con_id", this);
		con_nombre = new StringExpression("con_nombre", this);
		con_correo = new StringExpression("con_correo", this);
		con_asunto = new IntegerExpression("con_asunto", this);
		con_mensaje = new StringExpression("con_mensaje", this);
		usuariousu_id = new IntegerExpression("usuariousu_id", this);
	}
	
	public ContactoCriteria(PersistentSession session) {
		this(session.createCriteria(Contacto.class));
	}
	
	public ContactoCriteria() throws PersistentException {
		this(orm.ChileDenunciaPersistentManager.instance().getSession());
	}
	
	public Contacto uniqueContacto() {
		return (Contacto) super.uniqueResult();
	}
	
	public Contacto[] listContacto() {
		java.util.List list = super.list();
		return (Contacto[]) list.toArray(new Contacto[list.size()]);
	}
}

