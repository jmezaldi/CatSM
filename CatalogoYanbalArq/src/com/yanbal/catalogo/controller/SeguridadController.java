package com.yanbal.catalogo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.yanbal.catalogo.controller.BaseController;
import com.yanbal.catalogo.util.constantes.ConstantesComunes;

@Controller
@RequestMapping(value = "/")
public class SeguridadController extends BaseController {
	private static final Logger LOG = Logger.getLogger(SeguridadController.class);

	@RequestMapping(value = "errorCAT", method = RequestMethod.GET)
    public ModelAndView errorCAT(HttpServletRequest request)
    {
    	HttpSession session = request.getSession(false);
    	ModelAndView mav = new ModelAndView(RUTA_JSP_ERROR);
    	
        if (session == null) {
			//mav.addObject(ConstantesComunes.ERROR_OBJECT,
					//MensajeComun.ERROR_SESSION.getProperty());
			return mav;
		}
    	
        mav.addObject(ConstantesComunes.ERROR_OBJECT, session
        		.getAttribute(ConstantesComunes.KEY_MESSAGE_ERROR));
        return mav;
    }
	@RequestMapping(value = "login",method = RequestMethod.GET)
	public String showForm(@RequestParam(value = "error", required = false) String error,
			@RequestParam(value = "logout", required = false) String logout,ModelMap model) {

		if (error != null) {
			model.addAttribute("error", "Invalid username and password!");
		}

		if (logout != null) {
			model.addAttribute("msg", "You've been logged out successfully.");
		}
		LOG.debug("ingresando al Login");
		return "login";
	}
}
