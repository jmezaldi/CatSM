package com.yanbal.catalogo.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.yanbal.catalogo.bean.ServidorBean;
import com.yanbal.catalogo.dao.ServidorDAO;

@Validated
@Service
public class ServidorService {
	private static final Logger LOG = Logger.getLogger(ServidorService.class);
		
	private ServidorDAO servidorDAO;		

	@Autowired
	public void setServidorDAO(ServidorDAO servidorDAO) {
		this.servidorDAO = servidorDAO;
	}
	
	public List<ServidorBean> getAllServidores() {
		List<ServidorBean> list = new ArrayList<ServidorBean>();
		try {
			list = servidorDAO.getAllServidores();
		} catch (Exception e) {
			LOG.error(e.getMessage(), e);
		}
		return list;
	}	
	
}
