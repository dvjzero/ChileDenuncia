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

public class DenunciaDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public DenunciaDetachedCriteria() {
		super(orm.Denuncia.class, orm.DenunciaCriteria.class);
		den_id = new IntegerExpression("den_id", this.getDetachedCriteria());
		den_tipo = new StringExpression("den_tipo", this.getDetachedCriteria());
		den_denuncia = new StringExpression("den_denuncia", this.getDetachedCriteria());
		den_ciudad = new StringExpression("den_ciudad", this.getDetachedCriteria());
		den_sector = new StringExpression("den_sector", this.getDetachedCriteria());
		den_fecha_creacion = new StringExpression("den_fecha_creacion", this.getDetachedCriteria());
		den_fecha_modificacion = new StringExpression("den_fecha_modificacion", this.getDetachedCriteria());
		den_usuario_creador = new StringExpression("den_usuario_creador", this.getDetachedCriteria());
		den_usuario_modificador = new StringExpression("den_usuario_modificador", this.getDetachedCriteria());
		den_fecha_usuario_modifica = new StringExpression("den_fecha_usuario_modifica", this.getDetachedCriteria());
		den_desactivar = new StringExpression("den_desactivar", this.getDetachedCriteria());
	}
	
	public DenunciaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, orm.DenunciaCriteria.class);
		den_id = new IntegerExpression("den_id", this.getDetachedCriteria());
		den_tipo = new StringExpression("den_tipo", this.getDetachedCriteria());
		den_denuncia = new StringExpression("den_denuncia", this.getDetachedCriteria());
		den_ciudad = new StringExpression("den_ciudad", this.getDetachedCriteria());
		den_sector = new StringExpression("den_sector", this.getDetachedCriteria());
		den_fecha_creacion = new StringExpression("den_fecha_creacion", this.getDetachedCriteria());
		den_fecha_modificacion = new StringExpression("den_fecha_modificacion", this.getDetachedCriteria());
		den_usuario_creador = new StringExpression("den_usuario_creador", this.getDetachedCriteria());
		den_usuario_modificador = new StringExpression("den_usuario_modificador", this.getDetachedCriteria());
		den_fecha_usuario_modifica = new StringExpression("den_fecha_usuario_modifica", this.getDetachedCriteria());
		den_desactivar = new StringExpression("den_desactivar", this.getDetachedCriteria());
	}
	
	public UsuarioDetachedCriteria createUsuariousuCriteria() {
		return new UsuarioDetachedCriteria(createCriteria("usuariousu"));
	}
	
	public Estado_denunciaDetachedCriteria createEstado_denunciaedCriteria() {
		return new Estado_denunciaDetachedCriteria(createCriteria("estado_denunciaed"));
	}
	
	public Estadistica_denunciasDetachedCriteria createEstadisticaCriteria() {
		return new Estadistica_denunciasDetachedCriteria(createCriteria("ORM_estadistica"));
	}
	
	public Fichero_evidenciaDetachedCriteria createFichero_evidenciaCriteria() {
		return new Fichero_evidenciaDetachedCriteria(createCriteria("ORM_fichero_evidencia"));
	}
	
	public VisardenunciaDetachedCriteria createVisardenunciaCriteria() {
		return new VisardenunciaDetachedCriteria(createCriteria("visardenuncia"));
	}
	
	public Denuncia uniqueDenuncia(PersistentSession session) {
		return (Denuncia) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Denuncia[] listDenuncia(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Denuncia[]) list.toArray(new Denuncia[list.size()]);
	}
}

