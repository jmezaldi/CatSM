package com.yanbal.catalogo.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;

import com.yanbal.catalogo.bean.UsuarioBean;
import com.yanbal.catalogo.dao.UsuarioDAO;
import com.yanbal.catalogo.service.LoginLDAPService;
import com.yanbal.integracionyanbalstore.ws.tramas.vusuarios.respuesta.Respuesta;

@Component
public class CustomAuthenticationProvider implements AuthenticationProvider {

	private static final Logger log = Logger.getLogger(CustomAuthenticationProvider.class);

	private UsuarioDAO usuarioDAO = null;

	@Autowired
	public void setUsuarioDAO(UsuarioDAO usuarioDAO) {
		this.usuarioDAO = usuarioDAO;
	}

	@Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {

    	String usuario = authentication.getName().trim();
        String password = authentication.getCredentials().toString();

        Set<String> mySet = new LinkedHashSet<String>();
        
        if (usuario.isEmpty() || password.isEmpty())
        {
        	log.error("Usuario o contraseña vacios " + usuario);
        	throw new BadCredentialsException("Su usuario o contraseña no coinciden: " + usuario);
        }
        else
        {
        	List<UsuarioBean> usr =null;   
        	try
        	{
        		usr = usuarioDAO.consultaUsuario(usuario);  
        		
        		if (usr==null || usr.isEmpty())
        		{
	        		log.error("El usuario no esta registrado en el sistema: " + usuario);
	        		throw new BadCredentialsException("El usuario no esta registrado en el sistema: " + usuario);
	        	}
        		log.info("Usuario Rol: " + usuario);
        	}
        	catch(Exception e)
        	{
				log.error(e.toString());
				throw new BadCredentialsException("Su usuario o contraseña no coinciden: " + usuario);
        	}
        	
        	try
        	{
        		log.info("Antes de llamar al servicio "+usuario);
        		Respuesta respuesta = (new LoginLDAPService()).login(usuario,password,usr.get(0).getDominio());
        		
        		log.info("Despues de llamar al servicio "+respuesta);
        		
	        	if (respuesta != null && respuesta.getDatos().getFlagValidacion().equals("1"))
	        	{
	        		String[] authorities = new String[usr.size()];
	        		
	        		log.info("authorities "+authorities.toString());
	        		
	        		for(int i = 0; i < usr.size(); i++) 
	        		{ authorities[i] = usr.get(i).getDesRol(); 
	        		
	        		log.info("Rol: "+usr.get(i).getDesRol());
	        		}
	        		
	        		mySet = new HashSet<String>(Arrays.asList(authorities));
	        		
	        		
	        		List<GrantedAuthority> grantedAuths = new ArrayList();
	                for(String item : mySet)
	                {
	                	grantedAuths.add(new SimpleGrantedAuthority(item));
	                }
	                
	                Authentication auth = new UsernamePasswordAuthenticationToken(usuario, password, grantedAuths);
	        	     
	        	    return auth;
	        		
	        	}
	        	else
	        	{
	        		log.error("Su usuario o contraseña no coinciden: " + usuario);
	        		throw new BadCredentialsException("Su usuario o contraseña no coinciden: " + usuario);
	        	}
        	}
        	catch(Exception e)
        	{
				log.error(e.getMessage());
				throw new BadCredentialsException("Su usuario o contraseña no coinciden: " + usuario);
        	}
        }

	}

	@Override
	public boolean supports(Class<?> authentication) {
		return (UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication));
	}

}
