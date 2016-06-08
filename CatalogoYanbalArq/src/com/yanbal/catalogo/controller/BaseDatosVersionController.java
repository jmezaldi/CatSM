package com.yanbal.catalogo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import com.yanbal.catalogo.controller.BaseController;
import com.yanbal.catalogo.dao.AplicacionVersionDAO;
import com.yanbal.catalogo.dao.BaseDatosVersionDAO;
import com.yanbal.catalogo.validator.SolucionValidator;
//import com.yanbal.catalogo.util.constantes.ConstantesComunes.ConstantesComunes;
import com.yanbal.catalogo.bean.BaseDatosVersionBean;

@Controller
@RequestMapping(value = "/app/basedatosversion")
public class BaseDatosVersionController extends BaseController {
	private static final Logger LOG = Logger.getLogger(BaseDatosVersionController.class);

	private SolucionValidator validator = null;
	
	private BaseDatosVersionDAO baseDatosVersionDAO = null;
	
	private AplicacionVersionDAO aplicacionVersionDAO =null;


	@Autowired
	public void setSolucionDAO(BaseDatosVersionDAO baseDatosVersionDAO) {
		this.baseDatosVersionDAO = baseDatosVersionDAO;
	}
	
	@Autowired
	public void setAplicacionVersionDAO(AplicacionVersionDAO aplicacionVersionDAO) {
		this.aplicacionVersionDAO = aplicacionVersionDAO;
	}
	

	public SolucionValidator getValidator() {
		return validator;
	}

	@Autowired
	public void setValidator(SolucionValidator validator) {
		this.validator = validator;
	}

	@RequestMapping(method = RequestMethod.GET)
	public String showForm(ModelMap model) {
		try {
			LOG.debug("/show ");
			List<BaseDatosVersionBean> basedatosl = baseDatosVersionDAO.getAllBaseDatos();
			model.addAttribute("basedatosl", basedatosl);
			BaseDatosVersionBean basedatos = new BaseDatosVersionBean();
			model.addAttribute("basedatos", basedatos);

		} catch (Exception e) {
			LOG.error(e.getMessage(), e);

		}
		return "baseDatosVersion";
	}
	
	@RequestMapping(value = "/consulta", method = RequestMethod.GET)
	public String consulta(HttpServletRequest request,@RequestParam("id") Integer id, @RequestParam("corVer") Integer corVer, ModelMap model) {
		try {
			LOG.debug("/consulta ");
			BaseDatosVersionBean bd = baseDatosVersionDAO.getBaseDatosVersionXPk(id, corVer);
			model.addAttribute("bd", bd);
			model.addAttribute("appVersiones", aplicacionVersionDAO.getAplicacionVersionXBDVersion(id, corVer));
			model.addAttribute("clusters", baseDatosVersionDAO.getAllClusterServidorXBDVersion(id, corVer));
			

		} catch (Exception e) {
			LOG.error(e.getMessage(), e);

		}
		return "bdVersionXPk";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ModelAndView add(@ModelAttribute(value = "solucion") BaseDatosVersionBean solucion, BindingResult result) {
		validator.validate(solucion, result);
		LOG.debug("/add ");
		//ModelAndView mv = new ModelAndView(new RedirectView("solucion"));
		ModelAndView mv = new ModelAndView("solucion");
		if (!result.hasErrors()) {
			solucion.setEstado(1);
			try {
				
				baseDatosVersionDAO.saveBaseDatosVersion(solucion);
				
			} catch (Exception e) {
				LOG.error(e.getMessage(), e);

			}
			solucion = new BaseDatosVersionBean();			

			mv.addObject("solucion", solucion);
		}
		mv.addObject("soluciones", baseDatosVersionDAO.getAllBaseDatos());
		return mv;
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public ModelAndView update(@ModelAttribute(value = "solucion") BaseDatosVersionBean solucion, BindingResult result) {
		//validator.validate(user, result);
		LOG.debug("/update ");
		ModelAndView mv = new ModelAndView(new RedirectView("solucion"));
		if (!result.hasErrors()) {
			try {
				
			baseDatosVersionDAO.updateBaseDatosVersion(solucion);
			} catch (Exception e) {
				LOG.error(e.getMessage(), e);

			}
			
			solucion = new BaseDatosVersionBean();
			
			mv.addObject("solucion", solucion);
		}
	//	return new ModelAndView(new RedirectView(RUTA_MAPPING_EXITO));
		mv.addObject("soluciones", baseDatosVersionDAO.getAllBaseDatos());
		return mv;
	}

	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public ModelAndView delete(@ModelAttribute(value = "solucion") BaseDatosVersionBean solucion, BindingResult result) {
		//validator.validate(user, result);
		ModelAndView mv = new ModelAndView("registration");
		if (!result.hasErrors()) {
			try {

				baseDatosVersionDAO.deleteBaseDatosVersion(solucion.getId());

			} catch (Exception e) {
				LOG.error(e.getMessage(), e);
				return new ModelAndView(new RedirectView(""));
			}
			solucion = new BaseDatosVersionBean();
			mv.addObject("solucion", solucion);
		}
		mv.addObject("soluciones", baseDatosVersionDAO.getAllBaseDatos());
		return mv;
	}
}
