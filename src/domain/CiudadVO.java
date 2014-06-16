package domain;

public class CiudadVO {

	private String ciudad;
	private String comuna;
	private String sector;
	
	public CiudadVO() {
		
	}

	public CiudadVO(String ciudad, String comuna, String sector) {
		
		this.ciudad = ciudad;
		this.comuna = comuna;
		this.sector = sector;
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
	 * @return the comuna
	 */
	public String getComuna() {
		return comuna;
	}

	/**
	 * @param comuna the comuna to set
	 */
	public void setComuna(String comuna) {
		this.comuna = comuna;
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
	
	
	
	
}
