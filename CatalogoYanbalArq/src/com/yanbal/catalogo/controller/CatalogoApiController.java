package com.yanbal.catalogo.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yanbal.catalogo.bean.TablasCodigosBean;
import com.yanbal.catalogo.service.TablasCodigosService;

@RestController
@RequestMapping(value = "/api/catalogo")
public class CatalogoApiController extends BaseController {
	private static final Logger LOG = Logger.getLogger(CatalogoApiController.class);

	private TablasCodigosService tablasCodigosService = null;

	@Autowired
	public void setTablasCodigosService(TablasCodigosService tablasCodigosService) {
		this.tablasCodigosService = tablasCodigosService;
	}

	@RequestMapping(value = "/tablas_codigos", 
			method = RequestMethod.GET, headers = "Accept=application/json")
	public List<TablasCodigosBean> listSoluciones() {		
		return tablasCodigosService.obtenerTablasCodigosxCodTabla(TablasCodigosBean.TODOS);
	}
}
