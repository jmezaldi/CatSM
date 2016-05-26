package com.yanbal.catalogo.dao;

import java.util.List;

import com.yanbal.catalogo.bean.TablasCodigosBean;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TablasCodigosDAOImpl implements TablasCodigosDAO {
	/**
     * Referencia de objeto de tipo SqlSession de MyBatis que permite ejecutar
     * comandos y administrar transacciones.
     */
	@Autowired
	SqlSession session;
	
	@Override
	public List<TablasCodigosBean> getAllDatosXCodigoTabla(Integer codTabla) {
		TablasCodigosDAO dao = session.getMapper(TablasCodigosDAO.class);
		return dao.getAllDatosXCodigoTabla(codTabla);

	}

}
