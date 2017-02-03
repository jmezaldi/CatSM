package com.yanbal.catalogo.bean;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class SoftwareBaseBean {
	
	private Integer id;
	private String  nombre;
	private Integer idFabricante;
	private String  desFabricante;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getIdFabricante() {
		return idFabricante;
	}
	public void setIdFabricante(Integer idFabricante) {
		this.idFabricante = idFabricante;
	}
	public String getDesFabricante() {
		return desFabricante;
	}
	public void setDesFabricante(String desFabricante) {
		this.desFabricante = desFabricante;
	}

}
