package com.yanbal.catalogo.bean;

public class ServidorIPBean {
	
	private Integer id;
	private Integer idServidor;
	private Integer codTablaTipoIp;
	private Integer codDatoTipoIp;
	private String  ip;
	private String  desTipoIp;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getIdServidor() {
		return idServidor;
	}
	public void setIdServidor(Integer idServidor) {
		this.idServidor = idServidor;
	}
	public Integer getCodTablaTipoIp() {
		return codTablaTipoIp;
	}
	public void setCodTablaTipoIp(Integer codTablaTipoIp) {
		this.codTablaTipoIp = codTablaTipoIp;
	}
	public Integer getCodDatoTipoIp() {
		return codDatoTipoIp;
	}
	public void setCodDatoTipoIp(Integer codDatoTipoIp) {
		this.codDatoTipoIp = codDatoTipoIp;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getDesTipoIp() {
		return desTipoIp;
	}
	public void setDesTipoIp(String desTipoIp) {
		this.desTipoIp = desTipoIp;
	}


}
