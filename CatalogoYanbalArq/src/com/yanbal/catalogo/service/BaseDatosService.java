package com.yanbal.catalogo.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.yanbal.catalogo.bean.BaseDatosVersionBean;
import com.yanbal.catalogo.dao.BaseDatosVersionDAO;

@Validated
@Service
public class BaseDatosService {
	private static final Logger LOG = Logger.getLogger(BaseDatosService.class);
		
	private BaseDatosVersionDAO baseDatosVersionDAO;

	@Autowired
	public void setBaseDatosVersionDAO(BaseDatosVersionDAO baseDatosVersionDAO) {
		this.baseDatosVersionDAO = baseDatosVersionDAO;
	}

	public List<BaseDatosVersionBean> getAllBaseDatos() {
		List<BaseDatosVersionBean> list = new ArrayList<BaseDatosVersionBean>();
		try {
			list = baseDatosVersionDAO.getAllBaseDatos();
		} catch (Exception e) {
			LOG.error(e.getMessage(), e);
		}
		return list;
	}	
	
}
