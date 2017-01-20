package com.yanbal.catalogo.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.yanbal.catalogo.bean.ClusterBean;
import com.yanbal.catalogo.dao.ClusterDAO;

@Validated
@Service
public class ClusterService {
	private static final Logger LOG = Logger.getLogger(ClusterService.class);
		
	private ClusterDAO clusterDAO;
	
	@Autowired
	public void setClusterDAO(ClusterDAO clusterDAO) {
		this.clusterDAO = clusterDAO;
	}	
	
	public List<ClusterBean> getAllClusters() {
		List<ClusterBean> list = new ArrayList<ClusterBean>();
		try {
			list = clusterDAO.getAllClusters();
		} catch (Exception e) {
			LOG.error(e.getMessage(), e);
		}
		return list;
	}	
	
}
