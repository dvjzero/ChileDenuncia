package domain;

public class EstadoDenunciaVO {
	
	private Integer estadoActual;

	public EstadoDenunciaVO() {
		
	}

	public EstadoDenunciaVO(Integer estadoActual) {
		this.estadoActual = estadoActual;
	}

	/**
	 * @return the estadoActual
	 */
	public Integer getEstadoActual() {
		return estadoActual;
	}

	/**
	 * @param estadoActual the estadoActual to set
	 */
	public void setEstadoActual(Integer estadoActual) {
		this.estadoActual = estadoActual;
	}

	
	
	
}
