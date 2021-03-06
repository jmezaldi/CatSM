package com.yanbal.catalogo.controller;

import java.util.List;
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
import com.yanbal.catalogo.dao.ServidorDAO;
import com.yanbal.catalogo.dao.SoftwareBaseVersionDAO;
import com.yanbal.catalogo.validator.SolucionValidator;
//import com.yanbal.catalogo.util.constantes.ConstantesComunes.ConstantesComunes;
import com.yanbal.catalogo.bean.SoftwareBaseVersionBean;

@Controller
@RequestMapping(value = "/app/swBaseVersion")
public class SoftwareBaseVersionController extends BaseController {
	private static final Logger LOG = Logger.getLogger(SoftwareBaseVersionController.class);

	private SolucionValidator validator = null;
	
	private SoftwareBaseVersionDAO softwareBaseVersionDAO = null;
	
	private ServidorDAO servidorDAO = null;
		
	private AplicacionVersionDAO aplicacionVersionDAO =null;
	
	private BaseDatosVersionDAO baseDatosVersionDAO = null;

	@Autowired
	public void setSoftwareBaseVersionDAO(SoftwareBaseVersionDAO softwareBaseVersionDAO) {
		this.softwareBaseVersionDAO = softwareBaseVersionDAO;
	}
	
	@Autowired
	public void setServidorDAO(ServidorDAO servidorDAO) {
		this.servidorDAO = servidorDAO;
	}

	@Autowired
	public void setAplicacionVersionDAO(AplicacionVersionDAO aplicacionVersionDAO) {
		this.aplicacionVersionDAO = aplicacionVersionDAO;
	}
	
	@Autowired
	public void setBaseDatosVersionDAO(BaseDatosVersionDAO baseDatosVersionDAO) {
		this.baseDatosVersionDAO = baseDatosVersionDAO;
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
			List<SoftwareBaseVersionBean> soluciones = softwareBaseVersionDAO.getAllSoftwareBaseVersion();
			model.addAttribute("swBaseVersiones", soluciones);
			SoftwareBaseVersionBean swBaseVersion = new SoftwareBaseVersionBean();
			model.addAttribute("swBaseVersion", swBaseVersion);

		} catch (Exception e) {
			LOG.error(e.getMessage(), e);

		}
		return "swBaseVersion";
	}

	@RequestMapping(value = "/consulta", method = RequestMethod.GET)
	public String consulta(@RequestParam("id") Integer id,@RequestParam("corVer") Integer corVer, ModelMap model) {
		try {
			LOG.debug("/app/swBaseVersion/consulta ");

			model.addAttribute("swBases", softwareBaseVersionDAO.getSoftwareBaseVersionXPk(id, corVer));
			model.addAttribute("apps", aplicacionVersionDAO.getAplicacionVersionXSwBaseVersion(id, corVer));
			model.addAttribute("bds", baseDatosVersionDAO.getAllBaseDatosXSwBaseVersion(id, corVer));
			model.addAttribute("servidores", servidorDAO.getAllServidoresXSwBaseVersion(id, corVer));

		} catch (Exception e) {
			LOG.error(e.getMessage(), e);

		}
		return "swBaseVersionXPk";
	}
	
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ModelAndView add(@ModelAttribute(value = "solucion") SoftwareBaseVersionBean solucion, BindingResult result) {
		validator.validate(solucion, result);
		LOG.debug("/add ");
		//ModelAndView mv = new ModelAndView(new RedirectView("solucion"));
		ModelAndView mv = new ModelAndView("solucion");
		if (!result.hasErrors()) {
			//solucion.setEstado(1);
			try {
				
				softwareBaseVersionDAO.saveSoftwareBaseVersion(solucion);
				
			} catch (Exception e) {
				LOG.error(e.getMessage(), e);

			}
			solucion = new SoftwareBaseVersionBean();			

			mv.addObject("solucion", solucion);
		}
		mv.addObject("soluciones", softwareBaseVersionDAO.getAllSoftwareBaseVersion());
		return mv;
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public ModelAndView update(@ModelAttribute(value = "solucion") SoftwareBaseVersionBean solucion, BindingResult result) {
		//validator.validate(user, result);
		LOG.debug("/update ");
		ModelAndView mv = new ModelAndView(new RedirectView("solucion"));
		if (!result.hasErrors()) {
			try {
				
				softwareBaseVersionDAO.updateSoftwareBaseVersion(solucion);
			} catch (Exception e) {
				LOG.error(e.getMessage(), e);

			}
			
			solucion = new SoftwareBaseVersionBean();
			
			mv.addObject("solucion", solucion);
		}
	//	return new ModelAndView(new RedirectView(RUTA_MAPPING_EXITO));
		mv.addObject("soluciones", softwareBaseVersionDAO.getAllSoftwareBaseVersion());
		return mv;
	}

	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public ModelAndView delete(@ModelAttribute(value = "solucion") SoftwareBaseVersionBean solucion, BindingResult result) {
		//validator.validate(user, result);
		ModelAndView mv = new ModelAndView("registration");
		if (!result.hasErrors()) {
			try {

				softwareBaseVersionDAO.deleteSoftwareBaseVersion(solucion.getId());

			} catch (Exception e) {
				LOG.error(e.getMessage(), e);
				return new ModelAndView(new RedirectView(""));
			}
			solucion = new SoftwareBaseVersionBean();
			mv.addObject("solucion", solucion);
		}
		mv.addObject("soluciones", softwareBaseVersionDAO.getAllSoftwareBaseVersion());
		return mv;
	}
}
