/**
 * 
 */
package com.jweinfurtner.facade.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.jweinfurtner.dto.RegisterData;
import com.jweinfurtner.entity.User;
import com.jweinfurtner.facade.UserFacade;
import com.jweinfurtner.service.EntityService;

/**
 * @author Jared Weinfurtner <jared.weinfurtner@dmc.de>
 * 
 */
public class UserFacadeImpl implements UserFacade {

	@Autowired
	EntityService entityService;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.jweinfurtner.facade.UserFacade#register(com.jweinfurtner.dto.RegisterData
	 * )
	 */
	@Override
	public void register(RegisterData registerData) {
		User newUser = new User();

		newUser.setEmail(registerData.getEmail());

	}
}
