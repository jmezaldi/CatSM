package com.yanbal.catalogo.bean;

import java.util.Date;

public class UnidadNegocioAppVersionBean {
	
	private Integer id;
	private String  codigo;
	private String  nombre;
	private String  ticketActivacion;
	private Date fechaActivacion;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTicketActivacion() {
		return ticketActivacion;
	}
	public void setTicketActivacion(String ticketActivacion) {
		this.ticketActivacion = ticketActivacion;
	}
	public Date getFechaActivacion() {
		return fechaActivacion;
	}
	public void setFechaActivacion(Date fechaActivacion) {
		this.fechaActivacion = fechaActivacion;
	}	
	


}
