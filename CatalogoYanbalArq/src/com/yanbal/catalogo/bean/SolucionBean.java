package com.yanbal.catalogo.bean;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import com.yanbal.catalogo.util.constantes.ConstantesComunes;

public class SolucionBean implements Serializable {
	

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String  codigo;
	@NotNull
	private String  nombre;
	private String  descripcion;
	private Integer codTablaVertical;
	@NotNull
	private Integer codDatoVertical;
	private String  desVertical;
	private Integer codTablaAmbito;
	@NotNull
	private Integer codDatoAmbito;
	private String  desAmbito;
	private Integer codTablaTipo;
	@NotNull
	private Integer codDatoTipo;
	private String  desTipo;
	private Integer codTablaArea;
	@NotNull
	private Integer codDatoArea;
	private String  desArea;
	@NotNull
	private Integer estado;
	private String  usuarioCreacion;
	private String  usuarioActualizacion;
	
	public static final int ESTADO_ACTIVO = ConstantesComunes.ESTADO_ACTIVO;
	public static final int ESTADO_INACTIVO = ConstantesComunes.ESTADO_INACTIVO;
	
	public SolucionBean() {
		super();
		this.setCodTablaVertical(Integer.parseInt(ConstantesComunes.TablasCodigosVERTICALES));
		this.setCodTablaAmbito(Integer.parseInt(ConstantesComunes.TablasCodigosAMBITO_SOLUCION));
		this.setCodTablaTipo(Integer.parseInt(ConstantesComunes.TablasCodigosTIPO_SOLUCION));
		this.setCodTablaArea(Integer.parseInt(ConstantesComunes.TablasCodigosAREA));

	}
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
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Integer getCodTablaVertical() {
		return codTablaVertical;
	}
	public void setCodTablaVertical(Integer codTablaVertical) {
		this.codTablaVertical = codTablaVertical;
	}
	public Integer getCodDatoVertical() {
		return codDatoVertical;
	}
	public void setCodDatoVertical(Integer codDatoVertical) {
		this.codDatoVertical = codDatoVertical;
	}
	public Integer getCodTablaAmbito() {
		return codTablaAmbito;
	}
	public void setCodTablaAmbito(Integer codTablaAmbito) {
		this.codTablaAmbito = codTablaAmbito;
	}
	public Integer getCodDatoAmbito() {
		return codDatoAmbito;
	}
	public void setCodDatoAmbito(Integer codDatoAmbito) {
		this.codDatoAmbito = codDatoAmbito;
	}
	public Integer getCodTablaTipo() {
		return codTablaTipo;
	}
	public void setCodTablaTipo(Integer codTablaTipo) {
		this.codTablaTipo = codTablaTipo;
	}
	public Integer getCodDatoTipo() {
		return codDatoTipo;
	}
	public void setCodDatoTipo(Integer codDatoTipo) {
		this.codDatoTipo = codDatoTipo;
	}
	public Integer getCodTablaArea() {
		return codTablaArea;
	}
	public void setCodTablaArea(Integer codTablaArea) {
		this.codTablaArea = codTablaArea;
	}
	public Integer getCodDatoArea() {
		return codDatoArea;
	}
	public void setCodDatoArea(Integer codDatoArea) {
		this.codDatoArea = codDatoArea;
	}
	public Integer getEstado() {
		return estado;
	}
	public void setEstado(Integer estado) {
		this.estado = estado;
	}
	public String getUsuarioCreacion() {
		return usuarioCreacion;
	}
	public void setUsuarioCreacion(String usuarioCreacion) {
		this.usuarioCreacion = usuarioCreacion;
	}
	public String getUsuarioActualizacion() {
		return usuarioActualizacion;
	}
	public void setUsuarioActualizacion(String usuarioActualizacion) {
		this.usuarioActualizacion = usuarioActualizacion;
	}
	public String getDesVertical() {
		return desVertical;
	}
	public void setDesVertical(String desVertical) {
		this.desVertical = desVertical;
	}
	public String getDesAmbito() {
		return desAmbito;
	}
	public void setDesAmbito(String desAmbito) {
		this.desAmbito = desAmbito;
	}
	public String getDesTipo() {
		return desTipo;
	}
	public void setDesTipo(String desTipo) {
		this.desTipo = desTipo;
	}
	public String getDesArea() {
		return desArea;
	}
	public void setDesArea(String desArea) {
		this.desArea = desArea;
	}


}
