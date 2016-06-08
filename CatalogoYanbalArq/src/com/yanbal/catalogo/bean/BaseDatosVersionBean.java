package com.yanbal.catalogo.bean;

public class BaseDatosVersionBean extends BaseDatosBean {
		
	private String  corVersion;
	private String  datSensibles;
	private String  datPersonales;
	private Integer idSoftwareBase;
	private Integer idCorSoftwareBaseVersion;
	private String  desSoftwareBaseVersion;
	private Integer estado;
	private SoftwareBaseVersionBean swBaseVersion;
	private String  comentario;
	private String  nomFisico;
	private String  descripcion;
	
	public String getCorVersion() {
		return corVersion;
	}
	public void setCorVersion(String corVersion) {
		this.corVersion = corVersion;
	}
	public String getDatSensibles() {
		return datSensibles;
	}
	public void setDatSensibles(String datSensibles) {
		this.datSensibles = datSensibles;
	}
	public String getDatPersonales() {
		return datPersonales;
	}
	public void setDatPersonales(String datPersonales) {
		this.datPersonales = datPersonales;
	}
	public Integer getIdSoftwareBase() {
		return idSoftwareBase;
	}
	public void setIdSoftwareBase(Integer idSoftwareBase) {
		this.idSoftwareBase = idSoftwareBase;
	}
	public Integer getIdCorSoftwareBaseVersion() {
		return idCorSoftwareBaseVersion;
	}
	public void setIdCorSoftwareBaseVersion(Integer idCorSoftwareBaseVersion) {
		this.idCorSoftwareBaseVersion = idCorSoftwareBaseVersion;
	}
	public Integer getEstado() {
		return estado;
	}
	public void setEstado(Integer estado) {
		this.estado = estado;
	}
	public String getDesSoftwareBaseVersion() {
		return desSoftwareBaseVersion;
	}
	public void setDesSoftwareBaseVersion(String desSoftwareBaseVersion) {
		this.desSoftwareBaseVersion = desSoftwareBaseVersion;
	}
	public SoftwareBaseVersionBean getSwBaseVersion() {
		return swBaseVersion;
	}
	public void setSwBaseVersion(SoftwareBaseVersionBean swBaseVersion) {
		this.swBaseVersion = swBaseVersion;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	public String getNomFisico() {
		return nomFisico;
	}
	public void setNomFisico(String nomFisico) {
		this.nomFisico = nomFisico;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	

}
