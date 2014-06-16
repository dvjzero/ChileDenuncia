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

public class UsuarioCriteria extends AbstractORMCriteria {
	public final IntegerExpression usu_id;
	public final StringExpression usu_nombre;
	public final StringExpression usu_clave;
	public final StringExpression usu_ciudad;
	public final StringExpression usu_sector;
	public final StringExpression usu_mail;
	public final IntegerExpression usu_desactivar;
	
	public UsuarioCriteria(Criteria criteria) {
		super(criteria);
		usu_id = new IntegerExpression("usu_id", this);
		usu_nombre = new StringExpression("usu_nombre", this);
		usu_clave = new StringExpression("usu_clave", this);
		usu_ciudad = new StringExpression("usu_ciudad", this);
		usu_sector = new StringExpression("usu_sector", this);
		usu_mail = new StringExpression("usu_mail", this);
		usu_desactivar = new IntegerExpression("usu_desactivar", this);
	}
	
	public UsuarioCriteria(PersistentSession session) {
		this(session.createCriteria(Usuario.class));
	}
	
	public UsuarioCriteria() throws PersistentException {
		this(orm.ChileDenunciaPersistentManager.instance().getSession());
	}
	
	public Autentificacion_red_socialCriteria createAutentificacion_red_socialauCriteria() {
		return new Autentificacion_red_socialCriteria(createCriteria("autentificacion_red_socialau"));
	}
	
	public DenunciaCriteria createDenunciaCriteria() {
		return new DenunciaCriteria(createCriteria("ORM_denuncia"));
	}
	
	public AutoridadCriteria createAutoridadCriteria() {
		return new AutoridadCriteria(createCriteria("autoridad"));
	}
	
	public LoginCriteria createLoginCriteria() {
		return new LoginCriteria(createCriteria("ORM_login"));
	}
	
	public Usuario uniqueUsuario() {
		return (Usuario) super.uniqueResult();
	}
	
	public Usuario[] listUsuario() {
		java.util.List list = super.list();
		return (Usuario[]) list.toArray(new Usuario[list.size()]);
	}
}

