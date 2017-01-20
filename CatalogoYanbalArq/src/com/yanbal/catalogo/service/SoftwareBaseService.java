package com.yanbal.catalogo.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.yanbal.catalogo.bean.SoftwareBaseVersionBean;
import com.yanbal.catalogo.dao.SoftwareBaseVersionDAO;

@Validated
@Service
public class SoftwareBaseService {
	private static final Logger LOG = Logger.getLogger(SoftwareBaseService.class);
		
	private SoftwareBaseVersionDAO softwareBaseVersionDAO;

	@Autowired
	public void setSoftwareBaseVersionDAO(SoftwareBaseVersionDAO softwareBaseVersionDAO) {
		this.softwareBaseVersionDAO = softwareBaseVersionDAO;
	}
	
	public List<SoftwareBaseVersionBean> getAllSoftwareBaseVersion() {
		List<SoftwareBaseVersionBean> list = new ArrayList<SoftwareBaseVersionBean>();
		try {
			list = softwareBaseVersionDAO.getAllSoftwareBaseVersion();
		} catch (Exception e) {
			LOG.error(e.getMessage(), e);
		}
		return list;
	}	
	
}
