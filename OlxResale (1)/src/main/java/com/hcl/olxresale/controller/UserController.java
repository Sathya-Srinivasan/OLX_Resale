package com.hcl.olxresale.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.olxresale.model.User;
import com.hcl.olxresale.service.UserServiceImpl;

/**
 * @author Sathya S
 *
 */

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	public UserServiceImpl userService;

	@RequestMapping(value = "/registration", method = RequestMethod.POST)
	public ModelAndView add(@ModelAttribute @Valid User user, BindingResult result) {
		if (result.hasErrors()) {
			return new ModelAndView("register");
		} else {
			if (userService.register(user))
				return new ModelAndView("registrationSuccess");
			else
				return new ModelAndView("registrationFailed");
		}
	}

	@RequestMapping("/registration")
	public ModelAndView add() {
		// return new ModelAndView("redirect:user/registration");
		return new ModelAndView("register", "validationForm", new User());

	}
}
