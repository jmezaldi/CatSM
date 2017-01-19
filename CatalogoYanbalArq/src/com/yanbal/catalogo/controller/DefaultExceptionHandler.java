package com.yanbal.catalogo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.yanbal.catalogo.validator.RestFieldError;

@ControllerAdvice
@RequestMapping(produces = "application/json")
public class DefaultExceptionHandler extends ResponseEntityExceptionHandler{

	@ExceptionHandler({ ConstraintViolationException.class })
	public ResponseEntity<Object> handleConstraintViolationException(
			RuntimeException ex, WebRequest request) {
		
		HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        
        Set<ConstraintViolation<?>> set = ((ConstraintViolationException) ex)
        		.getConstraintViolations();
        List<RestFieldError> list = new ArrayList<RestFieldError>();
        for (ConstraintViolation<?> constraintViolation : set) {
        	String property = constraintViolation.getPropertyPath().toString();
        	String field = property.substring(property.indexOf(".") + 1 , 
        			property.length());
        	RestFieldError fieldError = new RestFieldError(field,
                    constraintViolation.getMessageTemplate(),
                    constraintViolation.getMessage());
        	list.add(fieldError);
		}        
        
        return handleExceptionInternal(ex, list, 
        		headers, HttpStatus.BAD_REQUEST, request);
	}
}
