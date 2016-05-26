package com.yanbal.catalogo.dao;

import java.util.List;

import com.yanbal.catalogo.bean.TablasCodigosBean;

public interface TablasCodigosDAO {
	

	public List<TablasCodigosBean> getAllDatosXCodigoTabla(Integer codTabla);
}
