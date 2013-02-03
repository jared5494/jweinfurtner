/**
 * 
 */
package com.jweinfurtner.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.amazonaws.ClientConfiguration;
import com.jweinfurtner.dao.UserDao;
import com.jweinfurtner.service.UserService;

/**
 * @author Jared Weinfurtner <jared.weinfurtner@dmc.de>
 *
 */
@Service
@Scope(value = BeanDefinition.SCOPE_SINGLETON)
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;
	
}
