package com.jweinfurtner.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/")
public class HelloWorldController {

	@RequestMapping(method=RequestMethod.GET)
	public String handleRequest(){ 
		return "hello";
	}
}
