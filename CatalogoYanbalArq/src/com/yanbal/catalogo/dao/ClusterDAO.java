package com.yanbal.catalogo.dao;


import java.util.List;

import com.yanbal.catalogo.bean.ClusterBean;

public interface ClusterDAO {
	
	public ClusterBean consultarCluster(Integer id);
	public List<ClusterBean> getAllClusters();

}
