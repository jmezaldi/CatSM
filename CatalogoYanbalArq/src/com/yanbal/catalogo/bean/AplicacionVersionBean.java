package com.yanbal.catalogo.bean;

import java.util.Date;

public class AplicacionVersionBean extends AplicacionBean {
	
	private Integer corVersion;
	private String  descripcion;
	private String  documentacion;
	private String  fuente;
	private Integer estado;
	private SoftwareBaseVersionBean swbaseVersion;
	private Date fechaVersion;
	private String  comentario;
	private String  ticketPase;
		
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
	public Date getFechaVersion() {
		return fechaVersion;
	}
	public void setFechaVersion(Date fechaVersion) {
		this.fechaVersion = fechaVersion;
	}
	public void setSwbaseVersion(SoftwareBaseVersionBean swbaseVersion) {
		this.swbaseVersion = swbaseVersion;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	public String getTicketPase() {
		return ticketPase;
	}
	public void setTicketPase(String ticketPase) {
		this.ticketPase = ticketPase;
	}
	
	
}
