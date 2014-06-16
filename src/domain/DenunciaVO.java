package domain;

import org.orm.PersistentTransaction;

public class DenunciaVO {

	private String tipo;
	private String denuncia;
	private String ciudad;
	private String sector;
	private String fecha_creacion;
	private String fecha_modificacion;
	private String usuario_creador;
	private String usuario_modificador;
	private String fecha_usuario_modifica;
	private String  desactivar;
	public DenunciaVO() {
		super();
	}
	public DenunciaVO(String tipo, String denuncia, String ciudad,
			String sector, String fecha_creacion, String fecha_modificacion,
			String usuario_creador, String usuario_modificador,
			String fecha_usuario_modifica, String desactivar) {
		super();
		this.tipo = tipo;
		this.denuncia = denuncia;
		this.ciudad = ciudad;
		this.sector = sector;
		this.fecha_creacion = fecha_creacion;
		this.fecha_modificacion = fecha_modificacion;
		this.usuario_creador = usuario_creador;
		this.usuario_modificador = usuario_modificador;
		this.fecha_usuario_modifica = fecha_usuario_modifica;
		this.desactivar = desactivar;
	}
	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}
	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	/**
	 * @return the denuncia
	 */
	public String getDenuncia() {
		return denuncia;
	}
	/**
	 * @param denuncia the denuncia to set
	 */
	public void setDenuncia(String denuncia) {
		this.denuncia = denuncia;
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
	 * @return the fecha_creacion
	 */
	public String getFecha_creacion() {
		return fecha_creacion;
	}
	/**
	 * @param fecha_creacion the fecha_creacion to set
	 */
	public void setFecha_creacion(String fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}
	/**
	 * @return the fecha_modificacion
	 */
	public String getFecha_modificacion() {
		return fecha_modificacion;
	}
	/**
	 * @param fecha_modificacion the fecha_modificacion to set
	 */
	public void setFecha_modificacion(String fecha_modificacion) {
		this.fecha_modificacion = fecha_modificacion;
	}
	/**
	 * @return the usuario_creador
	 */
	public String getUsuario_creador() {
		return usuario_creador;
	}
	/**
	 * @param usuario_creador the usuario_creador to set
	 */
	public void setUsuario_creador(String usuario_creador) {
		this.usuario_creador = usuario_creador;
	}
	/**
	 * @return the usuario_modificador
	 */
	public String getUsuario_modificador() {
		return usuario_modificador;
	}
	/**
	 * @param usuario_modificador the usuario_modificador to set
	 */
	public void setUsuario_modificador(String usuario_modificador) {
		this.usuario_modificador = usuario_modificador;
	}
	/**
	 * @return the fecha_usuario_modifica
	 */
	public String getFecha_usuario_modifica() {
		return fecha_usuario_modifica;
	}
	/**
	 * @param fecha_usuario_modifica the fecha_usuario_modifica to set
	 */
	public void setFecha_usuario_modifica(String fecha_usuario_modifica) {
		this.fecha_usuario_modifica = fecha_usuario_modifica;
	}
	/**
	 * @return the desactivar
	 */
	public String getDesactivar() {
		return desactivar;
	}
	/**
	 * @param desactivar the desactivar to set
	 */
	public void setDesactivar(String desactivar) {
		this.desactivar = desactivar;
	}
	
	

	
	
}
