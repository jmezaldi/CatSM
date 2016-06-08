package com.yanbal.catalogo.bean;

public class UsuarioBean {
	
	private String  usuario;
	private String  dominio;
	private Integer codTablaRol;
	private Integer codDatoRol;
	private String  desRol;
	private Integer estado;
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getDominio() {
		return dominio;
	}
	public void setDominio(String dominio) {
		this.dominio = dominio;
	}
	public Integer getCodTablaRol() {
		return codTablaRol;
	}
	public void setCodTablaRol(Integer codTablaRol) {
		this.codTablaRol = codTablaRol;
	}
	public Integer getCodDatoRol() {
		return codDatoRol;
	}
	public void setCodDatoRol(Integer codDatoRol) {
		this.codDatoRol = codDatoRol;
	}
	public String getDesRol() {
		return desRol;
	}
	public void setDesRol(String desRol) {
		this.desRol = desRol;
	}
	public Integer getEstado() {
		return estado;
	}
	public void setEstado(Integer estado) {
		this.estado = estado;
	}

}
