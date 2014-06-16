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
@Table(name="estadistica_denuncias")
public class Estadistica_denuncias implements Serializable {
	public Estadistica_denuncias() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_ESTADISTICA_DENUNCIAS_DENUNCIADEN) {
			return ORM_denunciaden;
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
	@GeneratedValue(generator="ORM_ESTADISTICA_DENUNCIAS_ED_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ORM_ESTADISTICA_DENUNCIAS_ED_ID_GENERATOR", strategy="increment")	
	private int ed_id;
	
	@Column(name="ed_usuario", nullable=true, length=50)	
	private String ed_usuario;
	
	@Column(name="ed_tipo", nullable=true, length=30)	
	private String ed_tipo;
	
	@Column(name="ed_denuncia", nullable=true, length=50)	
	private String ed_denuncia;
	
	@Column(name="ed_ciudad", nullable=true, length=20)	
	private String ed_ciudad;
	
	@Column(name="ed_sector", nullable=true, length=20)	
	private String ed_sector;
	
	@ManyToMany(mappedBy="ORM_estadistica", targetEntity=orm.Denuncia.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_denunciaden = new java.util.HashSet();
	
	private void setEd_id(int value) {
		this.ed_id = value;
	}
	
	public int getEd_id() {
		return ed_id;
	}
	
	public int getORMID() {
		return getEd_id();
	}
	
	public void setEd_usuario(String value) {
		this.ed_usuario = value;
	}
	
	public String getEd_usuario() {
		return ed_usuario;
	}
	
	public void setEd_tipo(String value) {
		this.ed_tipo = value;
	}
	
	public String getEd_tipo() {
		return ed_tipo;
	}
	
	public void setEd_denuncia(String value) {
		this.ed_denuncia = value;
	}
	
	public String getEd_denuncia() {
		return ed_denuncia;
	}
	
	public void setEd_ciudad(String value) {
		this.ed_ciudad = value;
	}
	
	public String getEd_ciudad() {
		return ed_ciudad;
	}
	
	public void setEd_sector(String value) {
		this.ed_sector = value;
	}
	
	public String getEd_sector() {
		return ed_sector;
	}
	
	private void setORM_Denunciaden(java.util.Set value) {
		this.ORM_denunciaden = value;
	}
	
	private java.util.Set getORM_Denunciaden() {
		return ORM_denunciaden;
	}
	
	@Transient	
	public final orm.DenunciaSetCollection denunciaden = new orm.DenunciaSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_ESTADISTICA_DENUNCIAS_DENUNCIADEN, orm.ORMConstants.KEY_DENUNCIA_ESTADISTICA, orm.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getEd_id());
	}
	
}
