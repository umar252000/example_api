package com.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
	
	@RequestMapping("/hello")
	@ResponseBody
	public String home()
	{
		
		return "whfkfwhe";
		
	}

}
