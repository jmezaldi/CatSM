package com.raistudies.controllers;

import java.util.List;
import java.util.UUID;

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

import com.raistudies.domain.User;
import com.raistudies.persistence.UserService;
import com.raistudies.validator.RegistrationValidator;


@Controller
@RequestMapping(value="/registration")
public class RegistrationController {
	private static final Logger LOG = Logger.getLogger(RegistrationController.class);
	
	private RegistrationValidator validator = null;
	private UserService userService = null;
		
	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public RegistrationValidator getValidator() {
		return validator;
	}

	@Autowired
	public void setValidator(RegistrationValidator validator) {
		this.validator = validator;
	}

	@RequestMapping(method=RequestMethod.GET)
	public String showForm(ModelMap model){
		try {
					
			List<User> users = userService.getAllUser();
		model.addAttribute("users", users);
		User user = new User();
		user.setId(UUID.randomUUID().toString());
		model.addAttribute("user", user);
		LOG.debug("Test 2");
		} catch (Exception e) {
			LOG.error(e.getMessage(), e);
			//throw new DAOException(e);
		}
		return "registration";
	}

	@RequestMapping(value="/add", method=RequestMethod.POST)
	public ModelAndView add(@ModelAttribute(value="user") User user,BindingResult result){
		validator.validate(user, result);
		ModelAndView mv = new ModelAndView("registration");
		if(!result.hasErrors()){
			userService.saveUser(user);
			user = new User();
			user.setId(UUID.randomUUID().toString());
			mv.addObject("user", user);
		}
		mv.addObject("users", userService.getAllUser());
		return mv;
	}
	
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public ModelAndView update(@ModelAttribute(value="user") User user,BindingResult result){
		validator.validate(user, result);
		ModelAndView mv = new ModelAndView("registration");
		if(!result.hasErrors()){
			userService.updateUser(user);
			user = new User();
			user.setId(UUID.randomUUID().toString());
			mv.addObject("user", user);
		}
		mv.addObject("users", userService.getAllUser());
		return mv;
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.POST)
	public ModelAndView delete(@ModelAttribute(value="user") User user,BindingResult result){
		validator.validate(user, result);
		ModelAndView mv = new ModelAndView("registration");
		if(!result.hasErrors()){
			try {
				System.out.println("Delete 1");
			System.out.println("Delete 1");
			userService.deleteUser(user.getId());
			
			LOG.debug("Delete 2");
			} catch (Exception e) {
				LOG.error(e.getMessage(), e);
				return new ModelAndView(new RedirectView(""));
			}
			user = new User();
			user.setId(UUID.randomUUID().toString());
			mv.addObject("user", user);
		}
		mv.addObject("users", userService.getAllUser());
		return mv;
	}
}
