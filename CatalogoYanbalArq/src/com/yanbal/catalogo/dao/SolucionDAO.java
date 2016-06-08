package com.yanbal.catalogo.dao;

import java.util.List;

import com.yanbal.catalogo.bean.SolucionBean;

public interface SolucionDAO {
	
	public void saveSolucion(SolucionBean solucion);
	public void updateSolucion(SolucionBean solucion);
	public void deleteSolucion(Integer id);
	public List<SolucionBean> getAllSoluciones();
	public SolucionBean getSolucionxPK(Integer id);
}
