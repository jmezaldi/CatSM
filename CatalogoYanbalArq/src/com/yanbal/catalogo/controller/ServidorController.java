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
import com.yanbal.catalogo.dao.ServidorDAO;
import com.yanbal.catalogo.validator.SolucionValidator;
//import com.yanbal.catalogo.util.constantes.ConstantesComunes.ConstantesComunes;
import com.yanbal.catalogo.bean.ServidorBean;

@Controller
@RequestMapping(value = "/servidor")
public class ServidorController extends BaseController {
	private static final Logger LOG = Logger.getLogger(ServidorController.class);

	private SolucionValidator validator = null;
	
	private ServidorDAO servidorDAO = null;

	@Autowired
	public void setServidorDAO(ServidorDAO servidorDAO) {
		this.servidorDAO = servidorDAO;
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
			List<ServidorBean> servidores = servidorDAO.getAllServidores();
			model.addAttribute("servidores", servidores);
			ServidorBean servidor = new ServidorBean();
			model.addAttribute("servidor", servidor);

		} catch (Exception e) {
			LOG.error(e.getMessage(), e);

		}
		return "servidor";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ModelAndView add(@ModelAttribute(value = "servidor") ServidorBean servidor, BindingResult result) {
		validator.validate(servidor, result);
		LOG.debug("/add ");
		//ModelAndView mv = new ModelAndView(new RedirectView("servidor"));
		ModelAndView mv = new ModelAndView("servidor");
		if (!result.hasErrors()) {
			servidor.setEstado(1);
			try {
				
				servidorDAO.saveServidor(servidor);
				
			} catch (Exception e) {
				LOG.error(e.getMessage(), e);

			}
			servidor = new ServidorBean();			

			mv.addObject("servidor", servidor);
		}
		mv.addObject("servidores", servidorDAO.getAllServidores());
		return mv;
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public ModelAndView update(@ModelAttribute(value = "servidor") ServidorBean servidor, BindingResult result) {
		//validator.validate(user, result);
		LOG.debug("/update ");
		ModelAndView mv = new ModelAndView(new RedirectView("servidor"));
		if (!result.hasErrors()) {
			try {
				
			servidorDAO.updateServidor(servidor);
			} catch (Exception e) {
				LOG.error(e.getMessage(), e);

			}
			
			servidor = new ServidorBean();
			
			mv.addObject("servidor", servidor);
		}
	//	return new ModelAndView(new RedirectView(RUTA_MAPPING_EXITO));
		mv.addObject("servidores", servidorDAO.getAllServidores());
		return mv;
	}

	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public ModelAndView delete(@ModelAttribute(value = "servidor") ServidorBean servidor, BindingResult result) {
		//validator.validate(user, result);
		ModelAndView mv = new ModelAndView("registration");
		if (!result.hasErrors()) {
			try {

				servidorDAO.deleteServidor(servidor.getId());

			} catch (Exception e) {
				LOG.error(e.getMessage(), e);
				return new ModelAndView(new RedirectView(""));
			}
			servidor = new ServidorBean();
			mv.addObject("servidor", servidor);
		}
		mv.addObject("servidores", servidorDAO.getAllServidores());
		return mv;
	}
}
