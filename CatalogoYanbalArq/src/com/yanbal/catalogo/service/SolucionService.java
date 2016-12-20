package com.yanbal.catalogo.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.ManagedBean;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.yanbal.catalogo.bean.SolucionBean;
import com.yanbal.catalogo.dao.SolucionDAO;

@ManagedBean
public class SolucionService {
	private static final Logger LOG = Logger.getLogger(SolucionService.class);
	
	private SolucionDAO solucionDAO = null;

	@Autowired
	public void setSolucionDAO(SolucionDAO solucionDAO) {
		this.solucionDAO = solucionDAO;
	}	

	public List<SolucionBean> getAllSoluciones() {
		List<SolucionBean> list = new ArrayList<SolucionBean>();
		try {
			list = solucionDAO.getAllSoluciones();
		} catch (Exception e) {
			LOG.error(e.getMessage(), e);

		}
		return list;
	}
	public SolucionBean getSolucionXPk(Integer id) {		
		SolucionBean elemento = null;
		try {
			elemento = solucionDAO.getSolucionxPK(id);
		} catch (Exception e) {
			LOG.error(e.getMessage(), e);			
		}
		return elemento;
	}

	public void addSolucion(SolucionBean elemento) {		
		try {
			solucionDAO.saveSolucion(elemento);
		} catch (Exception e) {
			LOG.error(e.getMessage(), e);			
		}
	}

	public void updateSolucion(SolucionBean elemento) {
		try {
			solucionDAO.updateSolucion(elemento);
		} catch (Exception e) {
			LOG.error(e.getMessage(), e);			
		}		
	}
	
}
