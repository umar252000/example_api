 package com.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controller2 {

	@RequestMapping("/")
	public String home1()
	{
		
		return "umar";
		
	}

	
}
