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
import com.hcl.olxresale.service.UserService;

@Controller
@RequestMapping("/user")
public class UserControler {
	@Autowired
	UserService userService;

	@RequestMapping(value = "/registration", method = RequestMethod.POST)
	public ModelAndView add(@ModelAttribute @Valid User user,
	BindingResult result) {
		if(result.hasErrors()) {
		//if (UserService.register(user))
			return new ModelAndView("loginFailed");
		}
		else
			return new ModelAndView("loginSuccess");
	}

	@RequestMapping("/registration")
	public ModelAndView add() {
		return new ModelAndView("registration","user", new User());

	}
}