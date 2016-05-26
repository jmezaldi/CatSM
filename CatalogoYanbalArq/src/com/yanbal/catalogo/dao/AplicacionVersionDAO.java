package com.yanbal.catalogo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yanbal.catalogo.bean.AplicacionVersionBean;
import com.yanbal.catalogo.bean.BaseDatosVersionBean;
import com.yanbal.catalogo.bean.ClusterServidorBean;
import com.yanbal.catalogo.bean.TablasCodigosUtilBean;;

public interface AplicacionVersionDAO {
	
	public void saveSolucion(AplicacionVersionBean appVersion);
	public void updateSolucion(AplicacionVersionBean appVersion);
	public void deleteAppVersion(Integer id);
	public List<AplicacionVersionBean> getAllAplicacionVersionXSolucion(Integer idSolucion);
	public AplicacionVersionBean getAplicacionVersionXPK(AplicacionVersionBean bean);
	public List<TablasCodigosUtilBean> getAllAppCaracteristicaXCodigoTabla(@Param("idApp") Integer idApp,@Param("corVer")  Integer corVer);
	public List<BaseDatosVersionBean> getAllBaseDatosXIdAppVersion(@Param("idApp") Integer idApp,@Param("corVer")  Integer corVer);
	public List<ClusterServidorBean> getAllClusterServidorXIdAppVersion(@Param("idApp") Integer idApp,@Param("corVer")  Integer corVer);
	public List<AplicacionVersionBean> getAllAplicacionVersion();
	
}
