package com.jweinfurtner.strategy;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface AutoLoginStrategy {

	void login(String email, String password, HttpServletRequest request,
			HttpServletResponse response);
}
