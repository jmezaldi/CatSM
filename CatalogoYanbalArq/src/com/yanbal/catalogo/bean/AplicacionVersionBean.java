package com.yanbal.catalogo.bean;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
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
	private List<SolucionBean> soluciones;
	private List<BaseDatosVersionBean> basesDatos;
	private List<ClusterServidorBean> clustersServidores;//instalaciones//instancias
	private List<UnidadNegocioAppVersionBean> unidadesNegocio;
	private List<TablasCodigosBean> tablasCodigosCaracteristicas;
	private List<AppVersionRelacionBean> hijos;
	private List<AppVersionRelacionBean> padres;
		
	public Integer getCorVersion() {		
		return corVersion;
	}
	public void setCorVersion(Integer corVersion) {
		this.corVersion = corVersion;
	}
	public String getDescripcionVersion() {
		return descripcion;
	}
	public void setDescripcionVersion(String descripcion) {
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
	public Integer getEstadoVersion() {
		return estado;
	}
	public void setEstadoVersion(Integer estado) {
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
	public List<SolucionBean> getSoluciones() {
		return soluciones;
	}
	public void setSoluciones(List<SolucionBean> soluciones) {
		this.soluciones = soluciones;
	}
	public List<BaseDatosVersionBean> getBasesDatos() {
		return basesDatos;
	}
	public void setBasesDatos(List<BaseDatosVersionBean> basesDatos) {
		this.basesDatos = basesDatos;
	}
	public List<ClusterServidorBean> getClustersServidores() {
		return clustersServidores;
	}
	public void setClustersServidores(List<ClusterServidorBean> clustersServidores) {
		this.clustersServidores = clustersServidores;
	}
	public List<UnidadNegocioAppVersionBean> getUnidadesNegocio() {
		return unidadesNegocio;
	}
	public void setUnidadesNegocio(List<UnidadNegocioAppVersionBean> unidadesNegocio) {
		this.unidadesNegocio = unidadesNegocio;
	}
	public List<TablasCodigosBean> getTablasCodigosCaracteristicas() {
		return tablasCodigosCaracteristicas;
	}
	public void setTablasCodigosCaracteristicas(List<TablasCodigosBean> tablasCodigosCaracteristicas) {
		this.tablasCodigosCaracteristicas = tablasCodigosCaracteristicas;
	}
	public List<AppVersionRelacionBean> getHijos() {
		return hijos;
	}
	public void setHijos(List<AppVersionRelacionBean> hijos) {
		this.hijos = hijos;
	}
	public List<AppVersionRelacionBean> getPadres() {
		return padres;
	}
	public void setPadres(List<AppVersionRelacionBean> padres) {
		this.padres = padres;
	}	
}
