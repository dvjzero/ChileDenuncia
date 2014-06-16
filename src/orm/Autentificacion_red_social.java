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
@Table(name="autentificacion_red_social")
public class Autentificacion_red_social implements Serializable {
	public Autentificacion_red_social() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == orm.ORMConstants.KEY_AUTENTIFICACION_RED_SOCIAL_USUARIO) {
			return ORM_usuario;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="au_id", nullable=false)	
	@Id	
	@GeneratedValue(generator="ORM_AUTENTIFICACION_RED_SOCIAL_AU_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ORM_AUTENTIFICACION_RED_SOCIAL_AU_ID_GENERATOR", strategy="native")	
	private int au_id;
	
	@Column(name="au_tipo_red", nullable=true, length=10)	
	private String au_tipo_red;
	
	@OneToMany(mappedBy="autentificacion_red_socialau", targetEntity=orm.Usuario.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_usuario = new java.util.HashSet();
	
	private void setAu_id(int value) {
		this.au_id = value;
	}
	
	public int getAu_id() {
		return au_id;
	}
	
	public int getORMID() {
		return getAu_id();
	}
	
	public void setAu_tipo_red(String value) {
		this.au_tipo_red = value;
	}
	
	public String getAu_tipo_red() {
		return au_tipo_red;
	}
	
	private void setORM_Usuario(java.util.Set value) {
		this.ORM_usuario = value;
	}
	
	private java.util.Set getORM_Usuario() {
		return ORM_usuario;
	}
	
	@Transient	
	public final orm.UsuarioSetCollection usuario = new orm.UsuarioSetCollection(this, _ormAdapter, orm.ORMConstants.KEY_AUTENTIFICACION_RED_SOCIAL_USUARIO, orm.ORMConstants.KEY_USUARIO_AUTENTIFICACION_RED_SOCIALAU, orm.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getAu_id());
	}
	
}
