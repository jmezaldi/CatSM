package com.yanbal.catalogo.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yanbal.catalogo.bean.ServidorBean;
import com.yanbal.catalogo.service.ServidorService;

@RestController
@RequestMapping(value = "/api/servidores")
public class ServidorApiController extends BaseController {
	private static final Logger LOG = Logger.getLogger(ServidorApiController.class);

	private ServidorService servidorService = null;

	@Autowired
	public void setServidorService(ServidorService servidorService) {
		this.servidorService = servidorService;
	}

	@RequestMapping(method = RequestMethod.GET, headers = "Accept=application/json")
	public List<ServidorBean> list() {
		return servidorService.getAllServidores();
	}

	/*@RequestMapping(value = "/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public SolucionBean getSolucionById(@PathVariable int id) {
		return solucionService.getSolucionXPk(id);
	}

	@RequestMapping(method = RequestMethod.POST, headers = "Accept=application/json")
	public SolucionBean addSolucion(Principal principal, 
			@RequestBody SolucionBean elemento) {
		elemento.setUsuarioCreacion(principal.getName());
		solucionService.addSolucion(elemento);
		return elemento;
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, headers = "Accept=application/json")
	public SolucionBean updateSolucion(Principal principal,
			@PathVariable int id, @RequestBody SolucionBean elemento) {		
		elemento.setUsuarioActualizacion(principal.getName());
		elemento.setId(id);
		solucionService.updateSolucion(elemento);
		return elemento;
	}
	
	 @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")  
	 public void deleteSolucion(Principal principal, 
			 @PathVariable("id") int id) {  
		 SolucionBean elemento = solucionService.getSolucionXPk(id);
		 elemento.setEstado(SolucionBean.ESTADO_INACTIVO);
		 elemento.setUsuarioActualizacion(principal.getName());
		 solucionService.updateSolucion(elemento);
	 }*/
	
}
