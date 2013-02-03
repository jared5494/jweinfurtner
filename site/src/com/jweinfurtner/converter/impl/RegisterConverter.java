/**
 * 
 */
package com.jweinfurtner.converter.impl;

import org.springframework.stereotype.Component;

import com.jweinfurtner.converter.AbstractConverter;
import com.jweinfurtner.dto.RegisterData;
import com.jweinfurtner.form.RegisterForm;

/**
 * @author Jared Weinfurtner <jared.weinfurtner@dmc.de>
 * 
 */
@Component
public class RegisterConverter extends
		AbstractConverter<RegisterForm, RegisterData> {

	@Override
	protected RegisterData createTarget() {
		return new RegisterData();
	}

	@Override
	protected void populate(RegisterForm source, RegisterData target) {
		// TODO: validate not null

		target.setEmail(source.getEmail());
		target.setName(source.getName());
	}

}
