package com.yanbal.catalogo.bean;

public class ClusterServidorBean extends ClusterBean {
	
	private ServidorBean servidor;
	private BaseDatosVersionBean bdVersion;

	public ServidorBean getServidor() {
		return servidor;
	}

	public void setServidor(ServidorBean servidor) {
		this.servidor = servidor;
	}

	public BaseDatosVersionBean getBdVersion() {
		return bdVersion;
	}

	public void setBdVersion(BaseDatosVersionBean bdVersion) {
		this.bdVersion = bdVersion;
	}
	

}
