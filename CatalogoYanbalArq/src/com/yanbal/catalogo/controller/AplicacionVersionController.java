package com.yanbal.catalogo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
import com.yanbal.catalogo.dao.TablasCodigosDAO;
import com.yanbal.catalogo.util.constantes.ConstantesComunes;
import com.yanbal.catalogo.validator.SolucionValidator;
import com.yanbal.catalogo.bean.AplicacionVersionBean;

@Controller
@RequestMapping(value = "/appVersion")
public class AplicacionVersionController extends BaseController {
	private static final Logger LOG = Logger.getLogger(AplicacionVersionController.class);

	private SolucionValidator validator = null;
	
	private AplicacionVersionDAO aplicacionVersionDAO = null;
	
	private TablasCodigosDAO tablasCodigosDao=null;

	@Autowired
	public void setSolucionDAO(AplicacionVersionDAO aplicacionVersionDAO) {
		this.aplicacionVersionDAO = aplicacionVersionDAO;
	}

	@Autowired
	public void setTablasCodigosDAO(TablasCodigosDAO tablasCodigosDAO) {
		this.tablasCodigosDao = tablasCodigosDAO;
	}
	
	public SolucionValidator getValidator() {
		return validator;
	}

	@Autowired
	public void setValidator(SolucionValidator validator) {
		this.validator = validator;
	}

	@RequestMapping(value = "/todas", method = RequestMethod.GET)
	public String showForm(ModelMap model) {
		try {
			LOG.debug("/show ");
			List<AplicacionVersionBean> appVersiones = aplicacionVersionDAO.getAllAplicacionVersion();
			model.addAttribute("appVersiones", appVersiones);
			AplicacionVersionBean appVersion = new AplicacionVersionBean();
			model.addAttribute("appVersion", appVersion);

		} catch (Exception e) {
			LOG.error(e.getMessage(), e);

		}
		return "appVersionS";
	}

	@RequestMapping(value = "/show", method = RequestMethod.GET)
	public String showApp(@RequestParam("idSolucion") Integer idSolucion, ModelMap model) {
		try {
			LOG.debug("/show ");
			List<AplicacionVersionBean> appVersiones = aplicacionVersionDAO.getAllAplicacionVersionXSolucion(idSolucion);
			model.addAttribute("appVersiones", appVersiones);
			AplicacionVersionBean appVersion = new AplicacionVersionBean();
			model.addAttribute("appVersion", appVersion);

		} catch (Exception e) {
			LOG.error(e.getMessage(), e);

		}
		return "appVersionS";
	}
	
	
	@RequestMapping(value = "/consulta", method = RequestMethod.GET)
	public String showApp2(HttpServletRequest request,@RequestParam("idApp") Integer idApp, @RequestParam("corVer") Integer corVer, ModelMap model) {
		try {
			HttpSession session = request.getSession(false);
			
			LOG.debug("/consulta ");
			AplicacionVersionBean bean = new AplicacionVersionBean();
			bean.setId(idApp);
			bean.setCorVersion(corVer);
			bean = aplicacionVersionDAO.getAplicacionVersionXPK(bean);
			

			LOG.debug("tablasCodigosDao "+tablasCodigosDao);
			LOG.debug(tablasCodigosDao.getAllDatosXCodigoTabla(7));
			
			if (session.getAttribute("TabCod"+ConstantesComunes.TablasCodigosCRITICIDAD_APP) ==null)
			{	session.setAttribute("TabCod"+ConstantesComunes.TablasCodigosCRITICIDAD_APP,tablasCodigosDao.getAllDatosXCodigoTabla(Integer.valueOf(ConstantesComunes.TablasCodigosCRITICIDAD_APP)));	}
			model.addAttribute("TabCod"+ConstantesComunes.TablasCodigosCRITICIDAD_APP, session.getAttribute("TabCod"+ConstantesComunes.TablasCodigosCRITICIDAD_APP));
			
			if (session.getAttribute("TabCod"+ConstantesComunes.TablasCodigosEXPOSICION_APP) ==null)
			{	session.setAttribute("TabCod"+ConstantesComunes.TablasCodigosEXPOSICION_APP,tablasCodigosDao.getAllDatosXCodigoTabla(Integer.valueOf(ConstantesComunes.TablasCodigosEXPOSICION_APP)));	}
			model.addAttribute("TabCod"+ConstantesComunes.TablasCodigosEXPOSICION_APP, session.getAttribute("TabCod"+ConstantesComunes.TablasCodigosEXPOSICION_APP));
			
			if (session.getAttribute("TabCod"+ConstantesComunes.TablasCodigosCUSTODIO_APP) ==null)
			{	session.setAttribute("TabCod"+ConstantesComunes.TablasCodigosCUSTODIO_APP,tablasCodigosDao.getAllDatosXCodigoTabla(Integer.valueOf(ConstantesComunes.TablasCodigosCUSTODIO_APP)));	}
			model.addAttribute("TabCod"+ConstantesComunes.TablasCodigosCUSTODIO_APP, session.getAttribute("TabCod"+ConstantesComunes.TablasCodigosCUSTODIO_APP));
			
			if (session.getAttribute("TabCod"+ConstantesComunes.TablasCodigosAREA) ==null)
			{	session.setAttribute("TabCod"+ConstantesComunes.TablasCodigosAREA,tablasCodigosDao.getAllDatosXCodigoTabla(Integer.valueOf(ConstantesComunes.TablasCodigosAREA)));	}
			model.addAttribute("TabCod"+ConstantesComunes.TablasCodigosAREA, session.getAttribute("TabCod"+ConstantesComunes.TablasCodigosAREA));
			
			model.addAttribute("caracteristicas", aplicacionVersionDAO.getAllAppCaracteristicaXCodigoTabla(idApp,corVer));
			model.addAttribute("basedatos", aplicacionVersionDAO.getAllBaseDatosXIdAppVersion(idApp,corVer));
			model.addAttribute("clusters", aplicacionVersionDAO.getAllClusterServidorXIdAppVersion(idApp,corVer));
			
			model.addAttribute("appVersion", bean);


		} catch (Exception e) {
			LOG.error(e.getMessage(), e);

		}
		return "appVersionXPk";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ModelAndView add(@ModelAttribute(value = "solucion") AplicacionVersionBean solucion, BindingResult result) {
		validator.validate(solucion, result);
		LOG.debug("/add ");
		//ModelAndView mv = new ModelAndView(new RedirectView("solucion"));
		ModelAndView mv = new ModelAndView("solucion");
		if (!result.hasErrors()) {
			solucion.setEstado(1);
			try {
				
				aplicacionVersionDAO.saveSolucion(solucion);
				
			} catch (Exception e) {
				LOG.error(e.getMessage(), e);

			}
			solucion = new AplicacionVersionBean();			

			mv.addObject("solucion", solucion);
		}
		mv.addObject("soluciones", aplicacionVersionDAO.getAllAplicacionVersionXSolucion(solucion.getId()));
		return mv;
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public ModelAndView update(@ModelAttribute(value = "solucion") AplicacionVersionBean solucion, BindingResult result) {
		//validator.validate(user, result);
		LOG.debug("/update ");
		ModelAndView mv = new ModelAndView(new RedirectView("solucion"));
		if (!result.hasErrors()) {
			try {
				
				aplicacionVersionDAO.updateSolucion(solucion);
			} catch (Exception e) {
				LOG.error(e.getMessage(), e);

			}
			
			solucion = new AplicacionVersionBean();
			
			mv.addObject("solucion", solucion);
		}
	//	return new ModelAndView(new RedirectView(RUTA_MAPPING_EXITO));
		mv.addObject("soluciones", aplicacionVersionDAO.getAllAplicacionVersionXSolucion(solucion.getId()));
		return mv;
	}

	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public ModelAndView delete(@ModelAttribute(value = "solucion") AplicacionVersionBean solucion, BindingResult result) {
		//validator.validate(user, result);
		ModelAndView mv = new ModelAndView("registration");
		if (!result.hasErrors()) {
			try {

				aplicacionVersionDAO.deleteAppVersion(solucion.getId());

			} catch (Exception e) {
				LOG.error(e.getMessage(), e);
				return new ModelAndView(new RedirectView(""));
			}
			solucion = new AplicacionVersionBean();
			mv.addObject("solucion", solucion);
		}
		mv.addObject("soluciones", aplicacionVersionDAO.getAllAplicacionVersionXSolucion(solucion.getId()));
		return mv;
	}
}
