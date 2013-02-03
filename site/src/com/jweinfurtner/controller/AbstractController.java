package com.jweinfurtner.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.jweinfurtner.converter.Converter;
import com.jweinfurtner.dto.RegisterData;
import com.jweinfurtner.facade.UserFacade;
import com.jweinfurtner.form.RegisterForm;
import com.jweinfurtner.strategy.AutoLoginStrategy;

public class AbstractController {

	@Autowired
	private UserFacade userFacade;

	@Autowired
	private AutoLoginStrategy autoLoginStrategy;

	@Autowired
	@Qualifier(value = "registerConverter")
	private Converter<RegisterForm, RegisterData> registerConverter;

	/**
	 * @param registerForm
	 * @param request
	 * @param response
	 */
	protected void handleRegister(RegisterForm registerForm, HttpServletRequest request, HttpServletResponse response) {

		RegisterData registerData = getRegisterConverter().convert(registerForm);
		getUserFacade().register(registerData);
		getAutoLoginStrategy().login(registerForm.getEmail(), registerForm.getPassword(), request, response);
	}

	protected UserFacade getUserFacade() {
		return userFacade;
	}

	protected AutoLoginStrategy getAutoLoginStrategy() {
		return autoLoginStrategy;
	}

	protected Converter<RegisterForm, RegisterData> getRegisterConverter() {
		return registerConverter;
	}

}
