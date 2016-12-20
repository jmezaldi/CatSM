package com.yanbal.catalogo.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yanbal.catalogo.bean.SolucionBean;
import com.yanbal.catalogo.service.SolucionService;

@RestController
@RequestMapping(value = "/api/soluciones")
public class SolucionApiController extends BaseController {
	private static final Logger LOG = Logger.getLogger(SolucionApiController.class);

	private SolucionService solucionService = null;

	@Autowired
	public void setSolucionService(SolucionService solucionService) {
		this.solucionService = solucionService;
	}

	@RequestMapping(method = RequestMethod.GET, headers = "Accept=application/json")
	public List<SolucionBean> listSoluciones() {
		return solucionService.getAllSoluciones();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public SolucionBean getSolucionById(@PathVariable int id) {
		return solucionService.getSolucionXPk(id);
	}

	@RequestMapping(method = RequestMethod.POST, headers = "Accept=application/json")
	public SolucionBean addSolucion(@RequestBody SolucionBean elemento) {
		//TODO add user to elemento
		//elemento.setUsuarioCreacion(usuarioActualizacion);
		solucionService.addSolucion(elemento);
		return elemento;
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, headers = "Accept=application/json")
	public SolucionBean updateSolucion(@PathVariable int id, @RequestBody SolucionBean elemento) {
		//TODO add user to elemento
		//elemento.setUsuarioActualizacion(usuarioActualizacion);
		elemento.setId(id);
		solucionService.updateSolucion(elemento);
		return elemento;
	}
	
	 @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")  
	 public void deleteSolucion(@PathVariable("id") int id) {  
		 SolucionBean elemento = solucionService.getSolucionXPk(id);
		 elemento.setEstado(SolucionBean.ESTADO_INACTIVO);
		 //elemento.setUsuarioActualizacion(usuarioActualizacion);
		 solucionService.updateSolucion(elemento);
	 }
	
}
