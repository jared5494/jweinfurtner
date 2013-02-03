package com.jweinfurtner.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jweinfurtner.form.RegisterForm;

@Controller
@RequestMapping(value = "/login")
public class LoginController extends AbstractController {

	@RequestMapping(method = RequestMethod.GET)
	public String getLogin(Model model) {
		return ControllerConstants.Views.Login;
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String getRegistration(@Valid RegisterForm registerForm, final BindingResult bindingResult, final Model model,
			HttpServletRequest request, HttpServletResponse response) {
		if (bindingResult.hasErrors()) {

		}

		handleRegister(registerForm, request, response);

		return null;
	}
}
