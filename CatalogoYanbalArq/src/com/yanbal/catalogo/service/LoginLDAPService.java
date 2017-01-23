package com.yanbal.catalogo.service;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import com.ibm.ws.webservices.engine.client.Stub;
import com.yanbal.integracionyanbalstore.ws.beans.WSMantenimientoUsuariosProxy;
import com.yanbal.integracionyanbalstore.ws.tramas.comun.CodigoPaisOD;
import com.yanbal.integracionyanbalstore.ws.tramas.comun.solicitud.Cabecera;
import com.yanbal.integracionyanbalstore.ws.tramas.vusuarios.respuesta.Detalle;
import com.yanbal.integracionyanbalstore.ws.tramas.vusuarios.respuesta.IntegracionWSResp;
import com.yanbal.integracionyanbalstore.ws.tramas.vusuarios.respuesta.Respuesta;
import com.yanbal.integracionyanbalstore.ws.tramas.vusuarios.solicitud.IntegracionWSReq;
import com.yanbal.integracionyanbalstore.ws.tramas.vusuarios.solicitud.Parametros;

public class LoginLDAPService {
	
	private static final Logger LOG = Logger.getLogger(LoginLDAPService.class);
	
	public Respuesta login(String usuario, String contraseña,String dominio) {
		
		LOG.debug(usuario); 
		
		try {		
			WSMantenimientoUsuariosProxy ws = new WSMantenimientoUsuariosProxy();
			ws.setEndpoint(com.yanbal.catalogo.util.Propiedad.getValue("wslogin.endPoint").toString());
			((Stub) ws.getWSMantenimientoUsuarios()).setTimeout(30000);
			
			
			Cabecera cab = new Cabecera();
		    cab.setCodigoAplicacion(com.yanbal.catalogo.util.Propiedad.getValue("wslogin.codigoAplicacion").toString());
			cab.setUsuarioAplicacion(com.yanbal.catalogo.util.Propiedad.getValue("wslogin.usuarioAplicacion").toString());
			cab.setCodigoInterfaz(com.yanbal.catalogo.util.Propiedad.getValue("wslogin.codigoInterfaz").toString());
			cab.setCodigoPais(dominio);
			CodigoPaisOD codigoPaisOD = new CodigoPaisOD();
			codigoPaisOD.setValor(dominio);
	
			Parametros par = new Parametros();
			par.setTipoUsuario(com.yanbal.catalogo.util.Propiedad.getValue("wslogin.tipo").toString());
			par.setUsuario(usuario);
			par.setPassword(contraseña);
	
	
			CodigoPaisOD[] codigosPaisOD = new CodigoPaisOD[]{codigoPaisOD};
		
		
			cab.setCodigosPaisOD(codigosPaisOD);
	
			IntegracionWSReq integracionWSReq = new IntegracionWSReq();
			integracionWSReq.setCabecera(cab);
	
			com.yanbal.integracionyanbalstore.ws.tramas.vusuarios.solicitud.Detalle det = new com.yanbal.integracionyanbalstore.ws.tramas.vusuarios.solicitud.Detalle();
			det.setParametros(par);
	
			integracionWSReq.setDetalle(det);
			LOG.debug("Antes ws"); 
			IntegracionWSResp integracionWSResp = ws.validaUsuariosObj(integracionWSReq);
			LOG.debug("Despues ws"); 
			Detalle detalleSalida = integracionWSResp.getDetalle();
	
			return detalleSalida.getRespuesta();
		} catch (Exception e)
		{			
			LOG.error("WS Servicio de Login: "+e.toString());
			LOG.error(e.getMessage());
		}
		return null;

	}
	
	 @Bean
	 public static PropertySourcesPlaceholderConfigurer placeHolderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	 }

}
