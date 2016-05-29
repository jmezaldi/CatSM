package com.yanbal.catalogo.dao;

import java.util.List;

import com.yanbal.catalogo.bean.BaseDatosVersionBean;

public interface BaseDatosVersionDAO {
	
	public void saveBaseDatosVersion(BaseDatosVersionBean servidor);
	public void updateBaseDatosVersion(BaseDatosVersionBean servidor);
	public void deleteBaseDatosVersion(Integer id);
	public List<BaseDatosVersionBean> getAllBaseDatos();
}
