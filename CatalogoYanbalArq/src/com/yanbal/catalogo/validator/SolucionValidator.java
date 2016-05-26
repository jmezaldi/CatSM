package com.yanbal.catalogo.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.yanbal.catalogo.bean.SolucionBean;

@Component
public class SolucionValidator implements Validator {


	public boolean supports(Class<?> c) {
		return SolucionBean.class.isAssignableFrom(c);
	}

	
	public void validate(Object command, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "nombre", "field.name.empty");
	/*	ValidationUtils.rejectIfEmptyOrWhitespace(errors, "standard", "field.standard.empty");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "age", "field.age.empty");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "sex", "field.sex.empty");*/
		
	}

	
}
