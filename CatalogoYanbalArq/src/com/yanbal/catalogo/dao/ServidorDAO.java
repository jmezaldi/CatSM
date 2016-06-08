package com.yanbal.catalogo.dao;

import java.util.List;

import com.yanbal.catalogo.bean.ServidorBean;

public interface ServidorDAO {
	
	public void saveServidor(ServidorBean servidor);
	public void updateServidor(ServidorBean servidor);
	public void deleteServidor(Integer id);
	public List<ServidorBean> getAllServidores();
	public ServidorBean getServidorXPK(Integer id);
}
