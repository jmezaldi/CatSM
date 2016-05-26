package com.yanbal.catalogo.service;

import java.util.List;
import com.yanbal.catalogo.bean.TablasCodigosBean;
import com.yanbal.catalogo.dao.TablasCodigosDAOImpl;


public class TablasCodigosService {
	
	public static List<TablasCodigosBean> obtenerTablasCodigosxCodTabla(Integer id)
	{
		TablasCodigosDAOImpl dao = new TablasCodigosDAOImpl();
		return dao.getAllDatosXCodigoTabla(id);
	}
		
}
