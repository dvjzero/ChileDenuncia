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
@Table(name="estado_denuncia")
public class Estado_denuncia implements Serializable {
	public Estado_denuncia() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_ESTADO_DENUNCIA_DENUNCIA) {
			return ORM_denuncia;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="ed_id", nullable=false)	
	@Id	
	@GeneratedValue(generator="ORM_ESTADO_DENUNCIA_ED_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ORM_ESTADO_DENUNCIA_ED_ID_GENERATOR", strategy="increment")	
	private int ed_id;
	
	@Column(name="ed_estado_actual", nullable=true, length=1)	
	private Integer ed_estado_actual;
	
	@OneToMany(mappedBy="estado_denunciaed", targetEntity=orm.Denuncia.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_denuncia = new java.util.HashSet();
	
	private void setEd_id(int value) {
		this.ed_id = value;
	}
	
	public int getEd_id() {
		return ed_id;
	}
	
	public int getORMID() {
		return getEd_id();
	}
	
	public void setEd_estado_actual(int value) {
		setEd_estado_actual(new Integer(value));
	}
	
	public void setEd_estado_actual(Integer value) {
		this.ed_estado_actual = value;
	}
	
	public Integer getEd_estado_actual() {
		return ed_estado_actual;
	}
	
	private void setORM_Denuncia(java.util.Set value) {
		this.ORM_denuncia = value;
	}
	
	private java.util.Set getORM_Denuncia() {
		return ORM_denuncia;
	}
	
	@Transient	
	public final orm.DenunciaSetCollection denuncia = new orm.DenunciaSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_ESTADO_DENUNCIA_DENUNCIA, orm.ORMConstants.KEY_DENUNCIA_ESTADO_DENUNCIAED, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getEd_id());
	}
	
}
