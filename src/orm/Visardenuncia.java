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
@Table(name="visardenuncia")
public class Visardenuncia implements Serializable {
	public Visardenuncia() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_VISARDENUNCIA_AUTORIDADAU) {
			this.autoridadau = (orm.Autoridad) owner;
		}
		
		else if (key == orm.ORMConstants.KEY_VISARDENUNCIA_DENUNCIADEN) {
			this.denunciaden = (orm.Denuncia) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="id", nullable=false)	
	@Id	
	@GeneratedValue(generator="ORM_VISARDENUNCIA_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ORM_VISARDENUNCIA_ID_GENERATOR", strategy="native")	
	private int id;
	
	@ManyToOne(targetEntity=orm.Autoridad.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="autoridadau_id", referencedColumnName="au_id", nullable=false) })	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private orm.Autoridad autoridadau;
	
	@OneToOne(targetEntity=orm.Denuncia.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="denunciaden_id", nullable=false) })	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private orm.Denuncia denunciaden;
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setAutoridadau(orm.Autoridad value) {
		if (autoridadau != null) {
			autoridadau.visardenuncia.remove(this);
		}
		if (value != null) {
			value.visardenuncia.add(this);
		}
	}
	
	public orm.Autoridad getAutoridadau() {
		return autoridadau;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Autoridadau(orm.Autoridad value) {
		this.autoridadau = value;
	}
	
	private orm.Autoridad getORM_Autoridadau() {
		return autoridadau;
	}
	
	public void setDenunciaden(orm.Denuncia value) {
		if (this.denunciaden != value) {
			orm.Denuncia ldenunciaden = this.denunciaden;
			this.denunciaden = value;
			if (value != null) {
				denunciaden.setVisardenuncia(this);
			}
			else {
				ldenunciaden.setVisardenuncia(null);
			}
		}
	}
	
	public orm.Denuncia getDenunciaden() {
		return denunciaden;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
