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
@Table(name="autoridad")
public class Autoridad implements Serializable {
	public Autoridad() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_AUTORIDAD_VISARDENUNCIA) {
			return ORM_visardenuncia;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_AUTORIDAD_USUARIOUSU) {
			this.usuariousu = (orm.Usuario) owner;
		}
		
		else if (key == orm.ORMConstants.KEY_AUTORIDAD_TIPOAUTORIDAD) {
			this.tipoautoridad = (orm.Tipoautoridad) owner;
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
	
	@Column(name="au_id", nullable=false)	
	@Id	
	@GeneratedValue(generator="ORM_AUTORIDAD_AU_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ORM_AUTORIDAD_AU_ID_GENERATOR", strategy="increment")	
	private int au_id;
	
	@OneToOne(targetEntity=orm.Usuario.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="usuariousu_id", nullable=false) })	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private orm.Usuario usuariousu;
	
	@ManyToOne(targetEntity=orm.Tipoautoridad.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="tipoautoridadid", referencedColumnName="id") })	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private orm.Tipoautoridad tipoautoridad;
	
	@OneToMany(mappedBy="autoridadau", targetEntity=orm.Visardenuncia.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_visardenuncia = new java.util.HashSet();
	
	private void setAu_id(int value) {
		this.au_id = value;
	}
	
	public int getAu_id() {
		return au_id;
	}
	
	public int getORMID() {
		return getAu_id();
	}
	
	public void setUsuariousu(orm.Usuario value) {
		if (this.usuariousu != value) {
			orm.Usuario lusuariousu = this.usuariousu;
			this.usuariousu = value;
			if (value != null) {
				usuariousu.setAutoridad(this);
			}
			else {
				lusuariousu.setAutoridad(null);
			}
		}
	}
	
	public orm.Usuario getUsuariousu() {
		return usuariousu;
	}
	
	public void setTipoautoridad(orm.Tipoautoridad value) {
		if (tipoautoridad != null) {
			tipoautoridad.autoridad.remove(this);
		}
		if (value != null) {
			value.autoridad.add(this);
		}
	}
	
	public orm.Tipoautoridad getTipoautoridad() {
		return tipoautoridad;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Tipoautoridad(orm.Tipoautoridad value) {
		this.tipoautoridad = value;
	}
	
	private orm.Tipoautoridad getORM_Tipoautoridad() {
		return tipoautoridad;
	}
	
	private void setORM_Visardenuncia(java.util.Set value) {
		this.ORM_visardenuncia = value;
	}
	
	private java.util.Set getORM_Visardenuncia() {
		return ORM_visardenuncia;
	}
	
	@Transient	
	public final orm.VisardenunciaSetCollection visardenuncia = new orm.VisardenunciaSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_AUTORIDAD_VISARDENUNCIA, orm.ORMConstants.KEY_VISARDENUNCIA_AUTORIDADAU, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getAu_id());
	}
	
}
