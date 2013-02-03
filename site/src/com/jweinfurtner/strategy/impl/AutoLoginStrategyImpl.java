/**
 * 
 */
package com.jweinfurtner.strategy.impl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jweinfurtner.strategy.AutoLoginStrategy;
import com.jweinfurtner.strategy.GUIDCookieStrategy;

/**
 * @author Jared Weinfurtner <jared.weinfurtner@dmc.de>
 * 
 */
@Component
public class AutoLoginStrategyImpl implements AutoLoginStrategy {

	@Autowired
	private GUIDCookieStrategy guidCookieStrategy;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.jweinfurtner.strategy.AutoLoginStrategy#login(java.lang.String,
	 * java.lang.String, javax.servlet.http.HttpServletRequest,
	 * javax.servlet.http.HttpServletResponse)
	 */
	@Override
	public void login(String email, String password,
			HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

	}

}
