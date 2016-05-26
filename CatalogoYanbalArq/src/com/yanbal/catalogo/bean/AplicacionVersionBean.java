package com.yanbal.catalogo.bean;

public class AplicacionVersionBean extends AplicacionBean {
	
	private Integer corVersion;
	private String  descripcion;
	private String  documentacion;
	private String  fuente;
	private Integer estado;
	private SoftwareBaseVersionBean swbaseVersion;
	
	public Integer getCorVersion() {
		return corVersion;
	}
	public void setCorVersion(Integer corVersion) {
		this.corVersion = corVersion;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getDocumentacion() {
		return documentacion;
	}
	public void setDocumentacion(String documentacion) {
		this.documentacion = documentacion;
	}
	public String getFuente() {
		return fuente;
	}
	public void setFuente(String fuente) {
		this.fuente = fuente;
	}
	public Integer getEstado() {
		return estado;
	}
	public void setEstado(Integer estado) {
		this.estado = estado;
	}
	public SoftwareBaseVersionBean getSwbaseVersion() {
		return swbaseVersion;
	}
	public void setSwbaseVersion(SoftwareBaseVersionBean swbaseVersion) {
		this.swbaseVersion = swbaseVersion;
	}
	
	
}
