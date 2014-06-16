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
@Table(name="login")
public class Login implements Serializable {
	public Login() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_LOGIN_USUARIOUSU) {
			this.usuariousu = (orm.Usuario) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="lo_id", nullable=false)	
	@Id	
	@GeneratedValue(generator="ORM_LOGIN_LO_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ORM_LOGIN_LO_ID_GENERATOR", strategy="increment")	
	private int lo_id;
	
	@Column(name="lo_usuario", nullable=true, length=50)	
	private String lo_usuario;
	
	@Column(name="lo_clave", nullable=true, length=50)	
	private String lo_clave;
	
	@Column(name="lo_tiempo", nullable=true, length=10)	
	private Integer lo_tiempo;
	
	@ManyToOne(targetEntity=orm.Usuario.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="usuariousu_id", referencedColumnName="usu_id", nullable=false) })	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private orm.Usuario usuariousu;
	
	private void setLo_id(int value) {
		this.lo_id = value;
	}
	
	public int getLo_id() {
		return lo_id;
	}
	
	public int getORMID() {
		return getLo_id();
	}
	
	public void setLo_usuario(String value) {
		this.lo_usuario = value;
	}
	
	public String getLo_usuario() {
		return lo_usuario;
	}
	
	public void setLo_clave(String value) {
		this.lo_clave = value;
	}
	
	public String getLo_clave() {
		return lo_clave;
	}
	
	public void setLo_tiempo(int value) {
		setLo_tiempo(new Integer(value));
	}
	
	public void setLo_tiempo(Integer value) {
		this.lo_tiempo = value;
	}
	
	public Integer getLo_tiempo() {
		return lo_tiempo;
	}
	
	public void setUsuariousu(orm.Usuario value) {
		if (usuariousu != null) {
			usuariousu.login.remove(this);
		}
		if (value != null) {
			value.login.add(this);
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
	
	public String toString() {
		return String.valueOf(getLo_id());
	}
	
}
