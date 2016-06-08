package com.yanbal.catalogo.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.yanbal.catalogo.bean.BaseDatosVersionBean;
import com.yanbal.catalogo.bean.ClusterServidorBean;

public interface BaseDatosVersionDAO {
	
	public void saveBaseDatosVersion(BaseDatosVersionBean servidor);
	public void updateBaseDatosVersion(BaseDatosVersionBean servidor);
	public void deleteBaseDatosVersion(Integer id);
	public List<BaseDatosVersionBean> getAllBaseDatos();
	public List<BaseDatosVersionBean> getAllBaseDatosXServidor(Integer IdServidor);
	public BaseDatosVersionBean getBaseDatosVersionXPk(@Param("id") Integer id,@Param("corVer")  Integer corVer);
	public List<ClusterServidorBean> getAllClusterServidorXBDVersion(@Param("id") Integer id,@Param("corVer")  Integer corVer);
}
