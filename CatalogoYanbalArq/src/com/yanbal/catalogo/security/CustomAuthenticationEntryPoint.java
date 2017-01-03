package com.yanbal.catalogo.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.LoginUrlAuthenticationEntryPoint;
import org.springframework.stereotype.Component;

@Component
public class CustomAuthenticationEntryPoint extends LoginUrlAuthenticationEntryPoint {
	
	private final RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();
	
	public CustomAuthenticationEntryPoint(String loginFormUrl) {
        super(loginFormUrl);
    }
	
	@Override
	public void commence(HttpServletRequest request, HttpServletResponse response, 
			AuthenticationException exception)
			throws IOException, ServletException {
		
		//TODO improve constant
		String URL = "/api";
		if(request.getRequestURI().startsWith(URL, 
				request.getContextPath().length())){			
			response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Unauthorized");
		}else{			
			String redirectUrl = buildRedirectUrlToLoginPage(request, response, exception);
			redirectStrategy.sendRedirect(request, response, redirectUrl);
		}
	}

}
