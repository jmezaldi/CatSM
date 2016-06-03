package com.yanbal.catalogo.controller;


import java.io.IOException;
import java.util.List;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.log4j.Logger;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.yanbal.catalogo.bean.SolucionBean;
import com.yanbal.catalogo.util.constantes.ConstantesComunes;



/**
 * Clase base para todos los controllers de la aplicación
 * 
 * @version 1.0, 26/10/2015
 * @author JM
 * @since 1.0
 */
public class BaseController {

	/**
	 * Log de la clase.
	 */
	private static final Logger LOG = Logger.getLogger(BaseController.class);

	/**
	 * Página de error genérico.
	 */
	protected static final String RUTA_JSP_ERROR = "error";
	
	/**
	 * Página de inicio.
	 */
	protected static final String RUTA_JSP_INICIO = "inicio";
	
	/**
	 * Mapping del error genérico.
	 */
	protected static final String RUTA_MAPPING_ERROR = "errorCAT";

	public void cerrarOutputStream(ServletOutputStream outputStream) {
		if (outputStream != null) {
			try {
				outputStream.close();
			} catch (IOException e) {
				LOG.error(e.getMessage(), e);
			}
		}
	}
	


}
