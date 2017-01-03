package com.yanbal.catalogo.security;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.filter.OncePerRequestFilter;

public class CORSFilter extends OncePerRequestFilter {
	public static final String REQUEST_ORIGIN_NAME = "Origin";
	public static final String ORIGIN = "http://localhost:9081";
	
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
		response.addHeader("Access-Control-Allow-Origin", ORIGIN);
		
		//TEST
		if(true){
			filterChain.doFilter(request, response);
			return;
		}
		if(!"GET".equals(request.getMethod())){
			String origin = request.getHeader(REQUEST_ORIGIN_NAME);
	        if (origin == null || !ORIGIN.contains(origin)) {
	        	response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Unauthorized CORS");
	        	return;
	        }
		}
		filterChain.doFilter(request, response);						
	}	

}