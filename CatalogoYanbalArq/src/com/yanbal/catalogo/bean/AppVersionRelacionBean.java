package com.yanbal.catalogo.bean;


public class AppVersionRelacionBean extends AplicacionBean {
	

	private Integer corVersion;
	private String  comentario;
	private Integer codDatoRelacion;
	private String  desRelacion;

	public Integer getCorVersion() {
		return corVersion;
	}
	public void setCorVersion(Integer corVersion) {
		this.corVersion = corVersion;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	public String getDesRelacion() {
		return desRelacion;
	}
	public void setDesRelacion(String desRelacion) {
		this.desRelacion = desRelacion;
	}
	public Integer getCodDatoRelacion() {
		return codDatoRelacion;
	}
	public void setCodDatoRelacion(Integer codDatoRelacion) {
		this.codDatoRelacion = codDatoRelacion;
	}
}
