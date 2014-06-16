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

public class DenunciaCriteria extends AbstractORMCriteria {
	public final IntegerExpression den_id;
	public final StringExpression den_tipo;
	public final StringExpression den_denuncia;
	public final StringExpression den_ciudad;
	public final StringExpression den_sector;
	public final StringExpression den_fecha_creacion;
	public final StringExpression den_fecha_modificacion;
	public final StringExpression den_usuario_creador;
	public final StringExpression den_usuario_modificador;
	public final StringExpression den_fecha_usuario_modifica;
	public final StringExpression den_desactivar;
	
	public DenunciaCriteria(Criteria criteria) {
		super(criteria);
		den_id = new IntegerExpression("den_id", this);
		den_tipo = new StringExpression("den_tipo", this);
		den_denuncia = new StringExpression("den_denuncia", this);
		den_ciudad = new StringExpression("den_ciudad", this);
		den_sector = new StringExpression("den_sector", this);
		den_fecha_creacion = new StringExpression("den_fecha_creacion", this);
		den_fecha_modificacion = new StringExpression("den_fecha_modificacion", this);
		den_usuario_creador = new StringExpression("den_usuario_creador", this);
		den_usuario_modificador = new StringExpression("den_usuario_modificador", this);
		den_fecha_usuario_modifica = new StringExpression("den_fecha_usuario_modifica", this);
		den_desactivar = new StringExpression("den_desactivar", this);
	}
	
	public DenunciaCriteria(PersistentSession session) {
		this(session.createCriteria(Denuncia.class));
	}
	
	public DenunciaCriteria() throws PersistentException {
		this(orm.ChileDenunciaPersistentManager.instance().getSession());
	}
	
	public UsuarioCriteria createUsuariousuCriteria() {
		return new UsuarioCriteria(createCriteria("usuariousu"));
	}
	
	public Estado_denunciaCriteria createEstado_denunciaedCriteria() {
		return new Estado_denunciaCriteria(createCriteria("estado_denunciaed"));
	}
	
	public Estadistica_denunciasCriteria createEstadisticaCriteria() {
		return new Estadistica_denunciasCriteria(createCriteria("ORM_estadistica"));
	}
	
	public Fichero_evidenciaCriteria createFichero_evidenciaCriteria() {
		return new Fichero_evidenciaCriteria(createCriteria("ORM_fichero_evidencia"));
	}
	
	public VisardenunciaCriteria createVisardenunciaCriteria() {
		return new VisardenunciaCriteria(createCriteria("visardenuncia"));
	}
	
	public Denuncia uniqueDenuncia() {
		return (Denuncia) super.uniqueResult();
	}
	
	public Denuncia[] listDenuncia() {
		java.util.List list = super.list();
		return (Denuncia[]) list.toArray(new Denuncia[list.size()]);
	}
}

