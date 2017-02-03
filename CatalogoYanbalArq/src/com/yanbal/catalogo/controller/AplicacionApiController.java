package com.yanbal.catalogo.controller;

import java.security.Principal;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yanbal.catalogo.bean.AplicacionBean;
import com.yanbal.catalogo.bean.AplicacionVersionBean;
import com.yanbal.catalogo.service.AplicacionService;

@RestController
@RequestMapping(value = "/api/aplicaciones")
public class AplicacionApiController extends BaseController {
	private static final Logger LOG = Logger.getLogger(AplicacionApiController.class);

	private AplicacionService aplicacionService = null;

	@Autowired
	public void setAplicacionService(AplicacionService aplicacionService) {
		this.aplicacionService = aplicacionService;
	}

	@RequestMapping(method = RequestMethod.GET, headers = "Accept=application/json")
	public List<AplicacionVersionBean> list() {
		return aplicacionService.getAllAplicaciones();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public AplicacionBean getAplicacionById(@PathVariable int id) {
		return aplicacionService.getAplicacionXPk(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, headers = "Accept=application/json")
	public AplicacionBean addAplicacion(Principal principal, 
			@RequestBody AplicacionBean elemento) {
		elemento.setUsuarioCreacion(principal.getName());
		aplicacionService.addAplicacion(elemento);
		return elemento;
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, headers = "Accept=application/json")
	public AplicacionBean updateAplicacion(Principal principal,
			@PathVariable int id, @RequestBody AplicacionBean elemento) {		
		elemento.setUsuarioActualizacion(principal.getName());
		elemento.setId(id);
		aplicacionService.updateAplicacion(elemento);
		return elemento;
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	public void deleteAplicacion(Principal principal, @PathVariable("id") int id) {
		AplicacionBean elemento = aplicacionService.getAplicacionXPk(id);
		elemento.setEstado(AplicacionBean.ESTADO_INACTIVO);
		elemento.setUsuarioActualizacion(principal.getName());
		aplicacionService.updateAplicacion(elemento);
	}
	 
	@RequestMapping(value = "/{id}/versiones/{versionId}", method = 
			RequestMethod.GET, headers = "Accept=application/json")
	public AplicacionVersionBean getAplicacionVersionyId(@PathVariable int id, 
			@PathVariable int versionId) {
		AplicacionVersionBean aplicacion = new AplicacionVersionBean();
		aplicacion.setId(id);
		aplicacion.setCorVersion(versionId);
		return aplicacionService.getAplicacionVersionXPk(aplicacion);
	}
}
