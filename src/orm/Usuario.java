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
@Table(name="usuario")
public class Usuario implements Serializable {
	public Usuario() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_USUARIO_DENUNCIA) {
			return ORM_denuncia;
		}
		else if (key == orm.ORMConstants.KEY_USUARIO_LOGIN) {
			return ORM_login;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_USUARIO_AUTENTIFICACION_RED_SOCIALAU) {
			this.autentificacion_red_socialau = (orm.Autentificacion_red_social) owner;
		}
		
		else if (key == orm.ORMConstants.KEY_USUARIO_AUTORIDAD) {
			this.autoridad = (orm.Autoridad) owner;
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
	
	@Column(name="usu_id", nullable=false)	
	@Id	
	@GeneratedValue(generator="ORM_USUARIO_USU_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ORM_USUARIO_USU_ID_GENERATOR", strategy="increment")	
	private int usu_id;
	
	@Column(name="usu_nombre", nullable=false, length=50)	
	private String usu_nombre;
	
	@Column(name="usu_clave", nullable=true, length=30)	
	private String usu_clave;
	
	@Column(name="usu_ciudad", nullable=true, length=30)	
	private String usu_ciudad;
	
	@Column(name="usu_sector", nullable=true, length=30)	
	private String usu_sector;
	
	@Column(name="usu_mail", nullable=true, length=50)	
	private String usu_mail;
	
	@Column(name="usu_desactivar", nullable=true, length=1)	
	private Integer usu_desactivar;
	
	@ManyToOne(targetEntity=orm.Autentificacion_red_social.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="autentificacion_red_socialau_id", referencedColumnName="au_id") })	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private orm.Autentificacion_red_social autentificacion_red_socialau;
	
	@OneToMany(mappedBy="usuariousu", targetEntity=orm.Denuncia.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_denuncia = new java.util.HashSet();
	
	@OneToOne(mappedBy="usuariousu", targetEntity=orm.Autoridad.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private orm.Autoridad autoridad;
	
	@OneToMany(mappedBy="usuariousu", targetEntity=orm.Login.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_login = new java.util.HashSet();
	
	private void setUsu_id(int value) {
		this.usu_id = value;
	}
	
	public int getUsu_id() {
		return usu_id;
	}
	
	public int getORMID() {
		return getUsu_id();
	}
	
	public void setUsu_nombre(String value) {
		this.usu_nombre = value;
	}
	
	public String getUsu_nombre() {
		return usu_nombre;
	}
	
	public void setUsu_clave(String value) {
		this.usu_clave = value;
	}
	
	public String getUsu_clave() {
		return usu_clave;
	}
	
	public void setUsu_ciudad(String value) {
		this.usu_ciudad = value;
	}
	
	public String getUsu_ciudad() {
		return usu_ciudad;
	}
	
	public void setUsu_sector(String value) {
		this.usu_sector = value;
	}
	
	public String getUsu_sector() {
		return usu_sector;
	}
	
	public void setUsu_mail(String value) {
		this.usu_mail = value;
	}
	
	public String getUsu_mail() {
		return usu_mail;
	}
	
	public void setUsu_desactivar(int value) {
		setUsu_desactivar(new Integer(value));
	}
	
	public void setUsu_desactivar(Integer value) {
		this.usu_desactivar = value;
	}
	
	public Integer getUsu_desactivar() {
		return usu_desactivar;
	}
	
	public void setAutentificacion_red_socialau(orm.Autentificacion_red_social value) {
		if (autentificacion_red_socialau != null) {
			autentificacion_red_socialau.usuario.remove(this);
		}
		if (value != null) {
			value.usuario.add(this);
		}
	}
	
	public orm.Autentificacion_red_social getAutentificacion_red_socialau() {
		return autentificacion_red_socialau;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Autentificacion_red_socialau(orm.Autentificacion_red_social value) {
		this.autentificacion_red_socialau = value;
	}
	
	private orm.Autentificacion_red_social getORM_Autentificacion_red_socialau() {
		return autentificacion_red_socialau;
	}
	
	private void setORM_Denuncia(java.util.Set value) {
		this.ORM_denuncia = value;
	}
	
	private java.util.Set getORM_Denuncia() {
		return ORM_denuncia;
	}
	
	@Transient	
	public final orm.DenunciaSetCollection denuncia = new orm.DenunciaSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_USUARIO_DENUNCIA, orm.ORMConstants.KEY_DENUNCIA_USUARIOUSU, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void setAutoridad(orm.Autoridad value) {
		if (this.autoridad != value) {
			orm.Autoridad lautoridad = this.autoridad;
			this.autoridad = value;
			if (value != null) {
				autoridad.setUsuariousu(this);
			}
			else {
				lautoridad.setUsuariousu(null);
			}
		}
	}
	
	public orm.Autoridad getAutoridad() {
		return autoridad;
	}
	
	private void setORM_Login(java.util.Set value) {
		this.ORM_login = value;
	}
	
	private java.util.Set getORM_Login() {
		return ORM_login;
	}
	
	@Transient	
	public final orm.LoginSetCollection login = new orm.LoginSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_USUARIO_LOGIN, orm.ORMConstants.KEY_LOGIN_USUARIOUSU, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getUsu_id());
	}
	
}
