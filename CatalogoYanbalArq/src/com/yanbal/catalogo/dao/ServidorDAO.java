package com.yanbal.catalogo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yanbal.catalogo.bean.ServidorBean;

public interface ServidorDAO {
	
	public void saveServidor(ServidorBean servidor);
	public void updateServidor(ServidorBean servidor);
	public void deleteServidor(Integer id);
	public List<ServidorBean> getAllServidores();
	public ServidorBean getServidorXPK(Integer id);
	public List<ServidorBean> getAllServidoresXCluster(Integer id);
	public List<ServidorBean> getAllServidoresXSwBaseVersion(@Param("id") Integer id,@Param("corVer")  Integer corVer);
	public List<ServidorBean> getAllIpXServidor(Integer id);
}
