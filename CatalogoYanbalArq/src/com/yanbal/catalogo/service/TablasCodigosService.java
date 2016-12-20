package com.yanbal.catalogo.service;

import java.util.List;

import javax.annotation.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;

import com.yanbal.catalogo.bean.TablasCodigosBean;
import com.yanbal.catalogo.dao.TablasCodigosDAO;


@ManagedBean
public class TablasCodigosService {
	
	private TablasCodigosDAO tablasCodigosDAO = null;

	@Autowired
	public void setTablasCodigosDAO(TablasCodigosDAO tablasCodigosDAO) {
		this.tablasCodigosDAO = tablasCodigosDAO;
	}	
	
	public List<TablasCodigosBean> obtenerTablasCodigosxCodTabla(Integer id)
	{
		return tablasCodigosDAO.getAllDatosXCodigoTabla(id);
	}
		
}
