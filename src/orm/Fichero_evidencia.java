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
@Table(name="fichero_evidencia")
public class Fichero_evidencia implements Serializable {
	public Fichero_evidencia() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == orm.ORMConstants.KEY_FICHERO_EVIDENCIA_DENUNCIADEN) {
			this.denunciaden = (orm.Denuncia) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="fe_id", nullable=false)	
	@Id	
	@GeneratedValue(generator="ORM_FICHERO_EVIDENCIA_FE_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ORM_FICHERO_EVIDENCIA_FE_ID_GENERATOR", strategy="increment")	
	private int fe_id;
	
	@Column(name="fe_nombre", nullable=true, length=30)	
	private String fe_nombre;
	
	@Column(name="fe_peso", nullable=true, length=10)	
	private Integer fe_peso;
	
	@Column(name="fe_formato", nullable=true, length=30)	
	private String fe_formato;
	
	@ManyToOne(targetEntity=orm.Denuncia.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="denunciaden_id", referencedColumnName="den_id", nullable=false) })	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private orm.Denuncia denunciaden;
	
	private void setFe_id(int value) {
		this.fe_id = value;
	}
	
	public int getFe_id() {
		return fe_id;
	}
	
	public int getORMID() {
		return getFe_id();
	}
	
	public void setFe_nombre(String value) {
		this.fe_nombre = value;
	}
	
	public String getFe_nombre() {
		return fe_nombre;
	}
	
	public void setFe_peso(int value) {
		setFe_peso(new Integer(value));
	}
	
	public void setFe_peso(Integer value) {
		this.fe_peso = value;
	}
	
	public Integer getFe_peso() {
		return fe_peso;
	}
	
	public void setFe_formato(String value) {
		this.fe_formato = value;
	}
	
	public String getFe_formato() {
		return fe_formato;
	}
	
	public void setDenunciaden(orm.Denuncia value) {
		if (denunciaden != null) {
			denunciaden.fichero_evidencia.remove(this);
		}
		if (value != null) {
			value.fichero_evidencia.add(this);
		}
	}
	
	public orm.Denuncia getDenunciaden() {
		return denunciaden;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Denunciaden(orm.Denuncia value) {
		this.denunciaden = value;
	}
	
	private orm.Denuncia getORM_Denunciaden() {
		return denunciaden;
	}
	
	public String toString() {
		return String.valueOf(getFe_id());
	}
	
}
