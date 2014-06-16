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
@Table(name="tipoautoridad")
public class Tipoautoridad implements Serializable {
	public Tipoautoridad() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_TIPOAUTORIDAD_AUTORIDAD) {
			return ORM_autoridad;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="id", nullable=false)	
	@Id	
	@GeneratedValue(generator="ORM_TIPOAUTORIDAD_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ORM_TIPOAUTORIDAD_ID_GENERATOR", strategy="native")	
	private int id;
	
	@Column(name="descripcion", nullable=true, length=10)	
	private Integer descripcion;
	
	@OneToMany(mappedBy="tipoautoridad", targetEntity=orm.Autoridad.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_autoridad = new java.util.HashSet();
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setDescripcion(int value) {
		setDescripcion(new Integer(value));
	}
	
	public void setDescripcion(Integer value) {
		this.descripcion = value;
	}
	
	public Integer getDescripcion() {
		return descripcion;
	}
	
	private void setORM_Autoridad(java.util.Set value) {
		this.ORM_autoridad = value;
	}
	
	private java.util.Set getORM_Autoridad() {
		return ORM_autoridad;
	}
	
	@Transient	
	public final orm.AutoridadSetCollection autoridad = new orm.AutoridadSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_TIPOAUTORIDAD_AUTORIDAD, orm.ORMConstants.KEY_AUTORIDAD_TIPOAUTORIDAD, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
