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

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="denuncia")
public class Denuncia implements Serializable {
	public Denuncia() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_DENUNCIA_ESTADISTICA) {
			return ORM_estadistica;
		}
		else if (key == orm.ORMConstants.KEY_DENUNCIA_FICHERO_EVIDENCIA) {
			return ORM_fichero_evidencia;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_DENUNCIA_USUARIOUSU) {
			this.usuariousu = (orm.Usuario) owner;
		}
		
		else if (key == orm.ORMConstants.KEY_DENUNCIA_ESTADO_DENUNCIAED) {
			this.estado_denunciaed = (orm.Estado_denuncia) owner;
		}
		
		else if (key == orm.ORMConstants.KEY_DENUNCIA_VISARDENUNCIA) {
			this.visardenuncia = (orm.Visardenuncia) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="den_id", nullable=false)	
	@Id	
	@GeneratedValue(generator="ORM_DENUNCIA_DEN_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ORM_DENUNCIA_DEN_ID_GENERATOR", strategy="increment")	
	private int den_id;
	
	@Column(name="den_tipo", nullable=true, length=20)	
	private String den_tipo;
	
	@Column(name="den_denuncia", nullable=true, length=255)	
	private String den_denuncia;
	
	@Column(name="den_ciudad", nullable=true, length=30)	
	private String den_ciudad;
	
	@Column(name="den_sector", nullable=true, length=30)	
	private String den_sector;
	
	@Column(name="den_fecha_creacion", nullable=true, length=15)	
	private String den_fecha_creacion;
	
	@Column(name="den_fecha_modificacion", nullable=true, length=15)	
	private String den_fecha_modificacion;
	
	@Column(name="den_usuario_creador", nullable=true, length=50)	
	private String den_usuario_creador;
	
	@Column(name="den_usuario_modificador", nullable=true, length=50)	
	private String den_usuario_modificador;
	
	@Column(name="den_fecha_usuario_modifica", nullable=true, length=15)	
	private String den_fecha_usuario_modifica;
	
	@Column(name="den_desactivar", nullable=true, length=10)	
	private String den_desactivar;
	
	@ManyToOne(targetEntity=orm.Usuario.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="Usuariousu_id", referencedColumnName="usu_id", nullable=false) })	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private orm.Usuario usuariousu;
	
	@ManyToOne(targetEntity=orm.Estado_denuncia.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="estado_denunciaed_id", referencedColumnName="ed_id", nullable=false) })	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private orm.Estado_denuncia estado_denunciaed;
	
	@ManyToMany(targetEntity=orm.Estadistica_denuncias.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="denuncia_estadistica_denuncias", joinColumns={ @JoinColumn(name="denunciaden_id") }, inverseJoinColumns={ @JoinColumn(name="estadistica_id") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_estadistica = new java.util.HashSet();
	
	@OneToMany(mappedBy="denunciaden", targetEntity=orm.Fichero_evidencia.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_fichero_evidencia = new java.util.HashSet();
	
	@OneToOne(mappedBy="denunciaden", targetEntity=orm.Visardenuncia.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private orm.Visardenuncia visardenuncia;
	
	private void setDen_id(int value) {
		this.den_id = value;
	}
	
	public int getDen_id() {
		return den_id;
	}
	
	public int getORMID() {
		return getDen_id();
	}
	
	public void setDen_tipo(String value) {
		this.den_tipo = value;
	}
	
	public String getDen_tipo() {
		return den_tipo;
	}
	
	public void setDen_denuncia(String value) {
		this.den_denuncia = value;
	}
	
	public String getDen_denuncia() {
		return den_denuncia;
	}
	
	public void setDen_ciudad(String value) {
		this.den_ciudad = value;
	}
	
	public String getDen_ciudad() {
		return den_ciudad;
	}
	
	public void setDen_sector(String value) {
		this.den_sector = value;
	}
	
	public String getDen_sector() {
		return den_sector;
	}
	
	public void setDen_fecha_creacion(String value) {
		this.den_fecha_creacion = value;
	}
	
	public String getDen_fecha_creacion() {
		return den_fecha_creacion;
	}
	
	public void setDen_fecha_modificacion(String value) {
		this.den_fecha_modificacion = value;
	}
	
	public String getDen_fecha_modificacion() {
		return den_fecha_modificacion;
	}
	
	public void setDen_usuario_creador(String value) {
		this.den_usuario_creador = value;
	}
	
	public String getDen_usuario_creador() {
		return den_usuario_creador;
	}
	
	public void setDen_usuario_modificador(String value) {
		this.den_usuario_modificador = value;
	}
	
	public String getDen_usuario_modificador() {
		return den_usuario_modificador;
	}
	
	public void setDen_fecha_usuario_modifica(String value) {
		this.den_fecha_usuario_modifica = value;
	}
	
	public String getDen_fecha_usuario_modifica() {
		return den_fecha_usuario_modifica;
	}
	
	public void setDen_desactivar(String value) {
		this.den_desactivar = value;
	}
	
	public String getDen_desactivar() {
		return den_desactivar;
	}
	
	public void setUsuariousu(orm.Usuario value) {
		if (usuariousu != null) {
			usuariousu.denuncia.remove(this);
		}
		if (value != null) {
			value.denuncia.add(this);
		}
	}
	
	public orm.Usuario getUsuariousu() {
		return usuariousu;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Usuariousu(orm.Usuario value) {
		this.usuariousu = value;
	}
	
	private orm.Usuario getORM_Usuariousu() {
		return usuariousu;
	}
	
	public void setEstado_denunciaed(orm.Estado_denuncia value) {
		if (estado_denunciaed != null) {
			estado_denunciaed.denuncia.remove(this);
		}
		if (value != null) {
			value.denuncia.add(this);
		}
	}
	
	public orm.Estado_denuncia getEstado_denunciaed() {
		return estado_denunciaed;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Estado_denunciaed(orm.Estado_denuncia value) {
		this.estado_denunciaed = value;
	}
	
	private orm.Estado_denuncia getORM_Estado_denunciaed() {
		return estado_denunciaed;
	}
	
	private void setORM_Estadistica(java.util.Set value) {
		this.ORM_estadistica = value;
	}
	
	private java.util.Set getORM_Estadistica() {
		return ORM_estadistica;
	}
	
	@Transient	
	public final orm.Estadistica_denunciasSetCollection estadistica = new orm.Estadistica_denunciasSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_DENUNCIA_ESTADISTICA, orm.ORMConstants.KEY_ESTADISTICA_DENUNCIAS_DENUNCIADEN, orm.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Fichero_evidencia(java.util.Set value) {
		this.ORM_fichero_evidencia = value;
	}
	
	private java.util.Set getORM_Fichero_evidencia() {
		return ORM_fichero_evidencia;
	}
	
	@Transient	
	public final orm.Fichero_evidenciaSetCollection fichero_evidencia = new orm.Fichero_evidenciaSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_DENUNCIA_FICHERO_EVIDENCIA, orm.ORMConstants.KEY_FICHERO_EVIDENCIA_DENUNCIADEN, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void setVisardenuncia(orm.Visardenuncia value) {
		if (this.visardenuncia != value) {
			orm.Visardenuncia lvisardenuncia = this.visardenuncia;
			this.visardenuncia = value;
			if (value != null) {
				visardenuncia.setDenunciaden(this);
			}
			else {
				lvisardenuncia.setDenunciaden(null);
			}
		}
	}
	
	public orm.Visardenuncia getVisardenuncia() {
		return visardenuncia;
	}
	
	public String toString() {
		return String.valueOf(getDen_id());
	}
	
}
