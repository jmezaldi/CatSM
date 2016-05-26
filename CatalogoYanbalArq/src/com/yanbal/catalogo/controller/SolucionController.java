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
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import com.yanbal.catalogo.controller.BaseController;
import com.yanbal.catalogo.dao.SolucionDAO;
import com.yanbal.catalogo.validator.SolucionValidator;
//import com.yanbal.catalogo.util.constantes.ConstantesComunes.ConstantesComunes;
import com.yanbal.catalogo.bean.SolucionBean;

@Controller
@RequestMapping(value = "/solucion")
public class SolucionController extends BaseController {
	private static final Logger LOG = Logger.getLogger(SolucionController.class);

	private SolucionValidator validator = null;
	
	private SolucionDAO solucionDAO = null;

	@Autowired
	public void setSolucionDAO(SolucionDAO solucionDAO) {
		this.solucionDAO = solucionDAO;
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
			List<SolucionBean> soluciones = solucionDAO.getAllSoluciones();
			model.addAttribute("soluciones", soluciones);
			SolucionBean solucion = new SolucionBean();
			model.addAttribute("solucion", solucion);

		} catch (Exception e) {
			LOG.error(e.getMessage(), e);

		}
		return "solucion";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ModelAndView add(@ModelAttribute(value = "solucion") SolucionBean solucion, BindingResult result) {
		validator.validate(solucion, result);
		LOG.debug("/add ");
		//ModelAndView mv = new ModelAndView(new RedirectView("solucion"));
		ModelAndView mv = new ModelAndView("solucion");
		if (!result.hasErrors()) {
			solucion.setEstado(1);
			try {
				
				solucionDAO.saveSolucion(solucion);
				
			} catch (Exception e) {
				LOG.error(e.getMessage(), e);

			}
			solucion = new SolucionBean();			

			mv.addObject("solucion", solucion);
		}
		mv.addObject("soluciones", solucionDAO.getAllSoluciones());
		return mv;
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public ModelAndView update(@ModelAttribute(value = "solucion") SolucionBean solucion, BindingResult result) {
		//validator.validate(user, result);
		LOG.debug("/update ");
		ModelAndView mv = new ModelAndView(new RedirectView("solucion"));
		if (!result.hasErrors()) {
			try {
				
			solucionDAO.updateSolucion(solucion);
			} catch (Exception e) {
				LOG.error(e.getMessage(), e);

			}
			
			solucion = new SolucionBean();
			
			mv.addObject("solucion", solucion);
		}
	//	return new ModelAndView(new RedirectView(RUTA_MAPPING_EXITO));
		mv.addObject("soluciones", solucionDAO.getAllSoluciones());
		return mv;
	}

	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public ModelAndView delete(@ModelAttribute(value = "solucion") SolucionBean solucion, BindingResult result) {
		//validator.validate(user, result);
		ModelAndView mv = new ModelAndView("registration");
		if (!result.hasErrors()) {
			try {

				solucionDAO.deleteSolucion(solucion.getId());

			} catch (Exception e) {
				LOG.error(e.getMessage(), e);
				return new ModelAndView(new RedirectView(""));
			}
			solucion = new SolucionBean();
			mv.addObject("solucion", solucion);
		}
		mv.addObject("soluciones", solucionDAO.getAllSoluciones());
		return mv;
	}
}
