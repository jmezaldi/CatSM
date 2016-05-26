package com.yanbal.catalogo.dao;

import java.util.List;

import com.yanbal.catalogo.bean.SoftwareBaseVersionBean;

public interface SoftwareBaseVersionDAO {
	
	public void saveSoftwareBaseVersion(SoftwareBaseVersionBean servidor);
	public void updateSoftwareBaseVersion(SoftwareBaseVersionBean servidor);
	public void deleteSoftwareBaseVersion(Integer id);
	public List<SoftwareBaseVersionBean> getAllSoftwareBaseVersion();
}
