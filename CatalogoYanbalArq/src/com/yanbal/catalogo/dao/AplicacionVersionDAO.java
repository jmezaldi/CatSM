package com.yanbal.catalogo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yanbal.catalogo.bean.AplicacionBean;
import com.yanbal.catalogo.bean.AplicacionVersionBean;
import com.yanbal.catalogo.bean.AppInstalacionVSBDInstalacionBean;
import com.yanbal.catalogo.bean.BaseDatosVersionBean;
import com.yanbal.catalogo.bean.ClusterServidorBean;
import com.yanbal.catalogo.bean.InstalacionUNBean;
import com.yanbal.catalogo.bean.TablasCodigosUtilBean;;

public interface AplicacionVersionDAO {
	
	public List<AplicacionVersionBean> getAllAplicacionVersionXSolucion(Integer idSolucion);
	public AplicacionBean getAplicacionxPK(Integer id);
	public AplicacionVersionBean getAplicacionVersionXPK(AplicacionVersionBean bean);
	public List<TablasCodigosUtilBean> getAllAppCaracteristicaXCodigoTabla(@Param("idApp") Integer idApp,@Param("corVer")  Integer corVer);
	public List<BaseDatosVersionBean> getAllBaseDatosXIdAppVersion(@Param("idApp") Integer idApp,@Param("corVer")  Integer corVer);
	public List<ClusterServidorBean> getAllClusterServidorXIdAppVersion(@Param("idApp") Integer idApp,@Param("corVer")  Integer corVer);
	public List<AplicacionVersionBean> getAllAplicacionVersion();
	public List<AplicacionVersionBean> getAplicacionVersionXServidor(Integer idServidor);
	public List<AplicacionVersionBean> getAplicacionVersionXCluster(Integer idCluster);
	public List<AplicacionVersionBean> getAplicacionVersionXBDVersion(@Param("id") Integer id,@Param("corVer")  Integer corVer);	
	public List<AplicacionVersionBean> getAplicacionVersionXSwBaseVersion(@Param("id") Integer id,@Param("corVer")  Integer corVer);
	public List<AplicacionVersionBean> getAllUnidadNegocioXAppVersion(@Param("id") Integer id,@Param("corVer")  Integer corVer);
	public List<AplicacionVersionBean> getAllAppVersionHijo(@Param("id") Integer id,@Param("corVer")  Integer corVer);
	public List<AplicacionVersionBean> getAllAppVersionPadre(@Param("id") Integer id,@Param("corVer")  Integer corVer);
	public List<AppInstalacionVSBDInstalacionBean> getAllBDInstalacionvsAppInstalcionXAppVersion(@Param("id") Integer id,@Param("corVer")  Integer corVer);	
	public List<InstalacionUNBean> getAllInstalacionUNXIdAppVersion(@Param("id") Integer id,@Param("corVer")  Integer corVer);
	public void saveAplicacion(AplicacionBean aplicacion);
	public void updateAplicacion(AplicacionBean aplicacion);
	public void deleteAplicacion(Integer id);
}
