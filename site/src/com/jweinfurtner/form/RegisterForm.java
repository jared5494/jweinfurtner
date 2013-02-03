package com.jweinfurtner.form;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;


public class RegisterForm {

	private String email;
	private String password;
	private String name;
	
	@Email
	@NotEmpty
	public String getEmail() {
		return email;
	}
	
	@Size(min = 6)
	@NotEmpty
	public String getPassword() {
		return password;
	}
	
	public String getName() {
		return name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setName(String name) {
		this.name = name;
	}	
}
