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
import com.yanbal.catalogo.dao.SolucionDAO;
import com.yanbal.catalogo.dao.TablasCodigosDAO;
import com.yanbal.catalogo.util.constantes.ConstantesComunes;
import com.yanbal.catalogo.validator.SolucionValidator;
import com.yanbal.catalogo.bean.AplicacionVersionBean;
import com.yanbal.catalogo.bean.SolucionBean;

@Controller
@RequestMapping(value = "/app/appVersion")
public class AplicacionVersionController extends BaseController {
	private static final Logger LOG = Logger.getLogger(AplicacionVersionController.class);

	private SolucionValidator validator = null;
	
	private AplicacionVersionDAO aplicacionVersionDAO = null;
	
	private TablasCodigosDAO tablasCodigosDao=null;
	
	private SolucionDAO solucionDAO=null;

	@Autowired
	public void setSolucionDAO(AplicacionVersionDAO aplicacionVersionDAO) {
		this.aplicacionVersionDAO = aplicacionVersionDAO;
	}

	@Autowired
	public void setTablasCodigosDAO(TablasCodigosDAO tablasCodigosDAO) {
		this.tablasCodigosDao = tablasCodigosDAO;
	}
	
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
		return "appVersion";
	}

	@RequestMapping(value = "/show", method = RequestMethod.GET)
	public String consulta(@RequestParam("idSolucion") Integer idSolucion, ModelMap model) {
		try {
			LOG.debug("/app/appVersion/show ");

			List<AplicacionVersionBean> appVersiones = aplicacionVersionDAO.getAllAplicacionVersionXSolucion(idSolucion);
			SolucionBean solucion = solucionDAO.getSolucionxPK(idSolucion);
			model.addAttribute("solucion", solucion);
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

			if (session.getAttribute("TabCod"+ConstantesComunes.TablasCodigosTIPO_APP) ==null)
			{	session.setAttribute("TabCod"+ConstantesComunes.TablasCodigosTIPO_APP,tablasCodigosDao.getAllDatosXCodigoTabla(Integer.valueOf(ConstantesComunes.TablasCodigosTIPO_APP)));	}
			model.addAttribute("TabCod"+ConstantesComunes.TablasCodigosTIPO_APP, session.getAttribute("TabCod"+ConstantesComunes.TablasCodigosTIPO_APP));

			if (session.getAttribute("TabCod"+ConstantesComunes.TablasCodigosAPP_PUBLICO) ==null)
			{	session.setAttribute("TabCod"+ConstantesComunes.TablasCodigosAPP_PUBLICO,tablasCodigosDao.getAllDatosXCodigoTabla(Integer.valueOf(ConstantesComunes.TablasCodigosAPP_PUBLICO)));	}
			model.addAttribute("TabCod"+ConstantesComunes.TablasCodigosAPP_PUBLICO, session.getAttribute("TabCod"+ConstantesComunes.TablasCodigosAPP_PUBLICO));

			
			model.addAttribute("caracteristicas", aplicacionVersionDAO.getAllAppCaracteristicaXCodigoTabla(idApp,corVer));
			model.addAttribute("basedatos", aplicacionVersionDAO.getAllBaseDatosXIdAppVersion(idApp,corVer));
			model.addAttribute("clusters", aplicacionVersionDAO.getAllClusterServidorXIdAppVersion(idApp,corVer));
			model.addAttribute("soluciones", solucionDAO.getAllSolucionesXAppVersion(idApp, corVer));
			model.addAttribute("unidades", aplicacionVersionDAO.getAllUnidadNegocioXAppVersion(idApp, corVer));
			
			model.addAttribute("appVersion", bean);


		} catch (Exception e) {
			LOG.error(e.getMessage(), e);

		}
		return "appVersionXPk";
	}
	
	
	@RequestMapping(value = "/consultaRel", method = RequestMethod.GET)
	public String consultaRelacion(HttpServletRequest request,@RequestParam("idApp") Integer idApp, @RequestParam("corVer") Integer corVer, ModelMap model) {
		try {
		
			LOG.debug("/consultaRel ");
			model.addAttribute("appHijo", aplicacionVersionDAO.getAllAppVersionHijo(idApp, corVer));
			model.addAttribute("appPadre", aplicacionVersionDAO.getAllAppVersionPadre(idApp, corVer));

		} catch (Exception e) {
			LOG.error(e.getMessage(), e);

		}
		return "appVersionRel";
	}
	
	@RequestMapping(value = "/consultaInstVs", method = RequestMethod.GET)
	public String consultaInstVs(HttpServletRequest request,@RequestParam("idApp") Integer idApp, @RequestParam("corVer") Integer corVer, ModelMap model) {
		try {
		
			LOG.debug("/consultaRel ");
			model.addAttribute("instalaciones", aplicacionVersionDAO.getAllBDInstalacionvsAppInstalcionXAppVersion(idApp, corVer));


		} catch (Exception e) {
			LOG.error(e.getMessage(), e);

		}
		return "appVersionInstVs";
	}
	
	@RequestMapping(value = "/consultaInstUN", method = RequestMethod.GET)
	public String consultaInstUN(HttpServletRequest request,@RequestParam("idApp") Integer idApp, @RequestParam("corVer") Integer corVer, ModelMap model) {
		try {
		
			LOG.debug("/consultaRel ");
			model.addAttribute("instalaciones", aplicacionVersionDAO.getAllInstalacionUNXIdAppVersion(idApp, corVer));


		} catch (Exception e) {
			LOG.error(e.getMessage(), e);

		}
		return "appVersionInstUN";
	}
}
