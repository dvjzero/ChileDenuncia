package domain;

public class UsuarioVO {
    private int id;
	private String nombre;
	private String clave;
	private String ciudad;
	private String sector;
	private String mail;
	private Integer desactivar;
	public UsuarioVO() {
		super();
	}

	public UsuarioVO(int id, String nombre, String clave, String ciudad,
			String sector, String mail, Integer desactivar) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.clave = clave;
		this.ciudad = ciudad;
		this.sector = sector;
		this.mail = mail;
		this.desactivar = desactivar;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the clave
	 */
	public String getClave() {
		return clave;
	}
	/**
	 * @param clave the clave to set
	 */
	public void setClave(String clave) {
		this.clave = clave;
	}
	/**
	 * @return the ciudad
	 */
	public String getCiudad() {
		return ciudad;
	}
	/**
	 * @param ciudad the ciudad to set
	 */
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	/**
	 * @return the sector
	 */
	public String getSector() {
		return sector;
	}
	/**
	 * @param sector the sector to set
	 */
	public void setSector(String sector) {
		this.sector = sector;
	}
	/**
	 * @return the mail
	 */
	public String getMail() {
		return mail;
	}
	/**
	 * @param mail the mail to set
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}
	/**
	 * @return the desactivar
	 */
	public Integer getDesactivar() {
		return desactivar;
	}
	/**
	 * @param desactivar the desactivar to set
	 */
	public void setDesactivar(Integer desactivar) {
		this.desactivar = desactivar;
	}
	
	
	
	

	
	
	
}
