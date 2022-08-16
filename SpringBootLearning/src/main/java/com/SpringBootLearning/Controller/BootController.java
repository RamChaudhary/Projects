package com.SpringBootLearning.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
// @RequestMapping("/BootController")
public class BootController {
	
	@RequestMapping("/")
	public String Home()
	{
		System.out.println("home page");
		
		return "Home";
	}
	
	@RequestMapping("")
	public String Home1()
	{
		System.out.println("home page");
		
		return "Home";
	}

}
