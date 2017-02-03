package com.yanbal.catalogo.service;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.yanbal.catalogo.bean.AplicacionBean;
import com.yanbal.catalogo.bean.AplicacionVersionBean;
import com.yanbal.catalogo.dao.AplicacionVersionDAO;

@Validated
@Service
public class AplicacionService {
	private static final Logger LOG = Logger.getLogger(AplicacionService.class);
	
	private AplicacionVersionDAO aplicacionVersionDAO = null;

	@Autowired
	public void setAplicacionVersionDAO(AplicacionVersionDAO aplicacionVersionDAO) {
		this.aplicacionVersionDAO = aplicacionVersionDAO;
	}	

	public List<AplicacionVersionBean> getAllAplicaciones() {
		List<AplicacionVersionBean> list = new ArrayList<AplicacionVersionBean>();
		try {
			list = aplicacionVersionDAO.getAllAplicacionVersion();
		} catch (Exception e) {
			LOG.error(e.getMessage(), e);
		}
		return list;
	}	
	
	public AplicacionBean getAplicacionXPk(Integer id) {
		AplicacionBean elemento = null;
		try {
			elemento = aplicacionVersionDAO.getAplicacionxPK(id);
		} catch (Exception e) {
			LOG.error(e.getMessage(), e);			
		}
		return elemento;
	}
	
	public void addAplicacion(@Valid AplicacionBean elemento) {		
		try {
			aplicacionVersionDAO.saveAplicacion(elemento);
		} catch (Exception e) {
			LOG.error(e.getMessage(), e);			
		}
	}

	public void updateAplicacion(AplicacionBean elemento) {
		try {
			aplicacionVersionDAO.updateAplicacion(elemento);
		} catch (Exception e) {
			LOG.error(e.getMessage(), e);			
		}		
	}
	
	public AplicacionVersionBean getAplicacionVersionXPk(
			AplicacionVersionBean aplicacion) {
		AplicacionVersionBean elemento = null;
		try {
			elemento = aplicacionVersionDAO.getAplicacionVersionXPK(aplicacion);
		} catch (Exception e) {
			LOG.error(e.getMessage(), e);			
		}
		return elemento;
	}
}
