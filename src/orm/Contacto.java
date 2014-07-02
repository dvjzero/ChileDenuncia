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
@Table(name="contacto")
public class Contacto implements Serializable {
	public Contacto() {
	}
	
	@Column(name="con_id", nullable=false)	
	@Id	
	@GeneratedValue(generator="ORM_CONTACTO_CON_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ORM_CONTACTO_CON_ID_GENERATOR", strategy="increment")	
	private int con_id;
	
	@Column(name="con_nombre", nullable=true, length=50)	
	private String con_nombre;
	
	@Column(name="con_correo", nullable=true, length=50)	
	private String con_correo;
	
	@Column(name="con_asunto", nullable=true, length=50)	
	private String con_asunto;
	
	@Column(name="con_mensaje", nullable=true, length=255)	
	private String con_mensaje;
	
	private void setCon_id(int value) {
		this.con_id = value;
	}
	
	public int getCon_id() {
		return con_id;
	}
	
	public int getORMID() {
		return getCon_id();
	}
	
	public void setCon_nombre(String value) {
		this.con_nombre = value;
	}
	
	public String getCon_nombre() {
		return con_nombre;
	}
	
	public void setCon_correo(String value) {
		this.con_correo = value;
	}
	
	public String getCon_correo() {
		return con_correo;
	}
	
	public void setCon_asunto(String value) {
		this.con_asunto = value;
	}
	
	public String getCon_asunto() {
		return con_asunto;
	}
	
	public void setCon_mensaje(String value) {
		this.con_mensaje = value;
	}
	
	public String getCon_mensaje() {
		return con_mensaje;
	}
	
	public String toString() {
		return String.valueOf(getCon_id());
	}
	
}
