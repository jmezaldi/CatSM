package com.yanbal.catalogo.bean;

import java.util.Date;

public class SoftwareBaseVersionBean extends SoftwareBaseBean {
		
	private String  corVersion;
	private String  version;
	private String  fix;
	private Date  fechaFinSoporte;
	private String licenciado;
	
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getFix() {
		return fix;
	}
	public void setFix(String fix) {
		this.fix = fix;
	}
	public Date getFechaFinSoporte() {
		return fechaFinSoporte;
	}
	public void setFechaFinSoporte(Date fechaFinSoporte) {
		this.fechaFinSoporte = fechaFinSoporte;
	}
	public String getLicenciado() {
		return licenciado;
	}
	public void setLicenciado(String licenciado) {
		this.licenciado = licenciado;
	}
	public String getCorVersion() {
		return corVersion;
	}
	public void setCorVersion(String corVersion) {
		this.corVersion = corVersion;
	}


}
