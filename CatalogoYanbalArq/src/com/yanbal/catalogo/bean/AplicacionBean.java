package com.yanbal.catalogo.bean;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.yanbal.catalogo.util.constantes.ConstantesComunes;

@JsonInclude(Include.NON_NULL)
public class AplicacionBean {
	
		private Integer id;
		private String  codigo;
		@NotNull
		private String  nombre;
		private String  descripcion;
		private Integer codTablaArea;
		@NotNull
		private Integer codDatoArea;
		private Integer codTablaCriticidad;
		@NotNull
		private Integer codDatoCriticidad;
		private Integer codTablaExposicion;
		@NotNull
		private Integer codDatoExposicion;
		private Integer codTablaCustodio;
		@NotNull
		private Integer codDatoCustodio;
		private Integer codTablaTipoApp;
		@NotNull
		private Integer codDatoTipoApp;
		private Integer codTablaPublico;
		@NotNull
		private Integer codDatoPublico;
		private String  usuarioLider;
		private String  desCriticidad;
		private String  desExposicion;
		private String  desArea;
		private String  desCustodio;
		private String  desTipoApp;
		private String  desPublico;
		@NotNull
		private Integer estado;
		
		private String  usuarioCreacion;
		private String  usuarioActualizacion;
		
		public static final int ESTADO_ACTIVO = ConstantesComunes.ESTADO_ACTIVO;
		public static final int ESTADO_INACTIVO = ConstantesComunes.ESTADO_INACTIVO;
		
		private SolucionBean solucion;
		
		public AplicacionBean(){
			this.setCodTablaCriticidad(Integer.parseInt(ConstantesComunes.TablasCodigosCRITICIDAD_APP));
			this.setCodTablaExposicion(Integer.parseInt(ConstantesComunes.TablasCodigosEXPOSICION_APP));
			this.setCodTablaCustodio(Integer.parseInt(ConstantesComunes.TablasCodigosCUSTODIO_APP));
			this.setCodTablaTipoApp(Integer.parseInt(ConstantesComunes.TablasCodigosTIPO_APP));
			this.setCodTablaPublico(Integer.parseInt(ConstantesComunes.TablasCodigosAPP_PUBLICO));
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
		public Integer getCodTablaCriticidad() {
			return codTablaCriticidad;
		}
		public void setCodTablaCriticidad(Integer codTablaCriticidad) {
			this.codTablaCriticidad = codTablaCriticidad;
		}
		public Integer getCodDatoCriticidad() {
			return codDatoCriticidad;
		}
		public void setCodDatoCriticidad(Integer codDatoCriticidad) {
			this.codDatoCriticidad = codDatoCriticidad;
		}
		public Integer getCodTablaExposicion() {
			return codTablaExposicion;
		}
		public void setCodTablaExposicion(Integer codTablaExposicion) {
			this.codTablaExposicion = codTablaExposicion;
		}
		public Integer getCodDatoExposicion() {
			return codDatoExposicion;
		}
		public void setCodDatoExposicion(Integer codDatoExposicion) {
			this.codDatoExposicion = codDatoExposicion;
		}
		public Integer getCodTablaCustodio() {
			return codTablaCustodio;
		}
		public void setCodTablaCustodio(Integer codTablaCustodio) {
			this.codTablaCustodio = codTablaCustodio;
		}
		public Integer getCodDatoCustodio() {
			return codDatoCustodio;
		}
		public void setCodDatoCustodio(Integer codDatoCustodio) {
			this.codDatoCustodio = codDatoCustodio;
		}
		public String getUsuarioLider() {
			return usuarioLider;
		}
		public void setUsuarioLider(String usuarioLider) {
			this.usuarioLider = usuarioLider;
		}
		public Integer getEstado() {
			return estado;
		}
		public void setEstado(Integer estado) {
			this.estado = estado;
		}
		public String getDesCriticidad() {
			return desCriticidad;
		}
		public void setDesCriticidad(String desCriticidad) {
			this.desCriticidad = desCriticidad;
		}
		public String getDesExposicion() {
			return desExposicion;
		}
		public void setDesExposicion(String desExposicion) {
			this.desExposicion = desExposicion;
		}
		public String getDesArea() {
			return desArea;
		}
		public void setDesArea(String desArea) {
			this.desArea = desArea;
		}
		public String getDesCustodio() {
			return desCustodio;
		}
		public void setDesCustodio(String desCustodio) {
			this.desCustodio = desCustodio;
		}
		public SolucionBean getSolucion() {
			return solucion;
		}
		public void setSolucion(SolucionBean solucion) {
			this.solucion = solucion;
		}
		public Integer getCodTablaTipoApp() {
			return codTablaTipoApp;
		}
		public void setCodTablaTipoApp(Integer codTablaTipoApp) {
			this.codTablaTipoApp = codTablaTipoApp;
		}
		public Integer getCodDatoTipoApp() {
			return codDatoTipoApp;
		}
		public void setCodDatoTipoApp(Integer codDatoTipoApp) {
			this.codDatoTipoApp = codDatoTipoApp;
		}
		public String getDesTipoApp() {
			return desTipoApp;
		}
		public void setDesTipoApp(String desTipoApp) {
			this.desTipoApp = desTipoApp;
		}
		public Integer getCodTablaPublico() {
			return codTablaPublico;
		}
		public void setCodTablaPublico(Integer codTablaPublico) {
			this.codTablaPublico = codTablaPublico;
		}
		public Integer getCodDatoPublico() {
			return codDatoPublico;
		}
		public void setCodDatoPublico(Integer codDatoPublico) {
			this.codDatoPublico = codDatoPublico;
		}
		public String getDesPublico() {
			return desPublico;
		}
		public void setDesPublico(String desPublico) {
			this.desPublico = desPublico;
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


	}
