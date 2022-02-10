package com.tma.authentication;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class AppController {
	
	@GetMapping({"/home"})
	public String getHome() {
		return "home";
	}

	
	@GetMapping("/test")
	public String test() {
		return "Hello Controller";
	}
	
	
}

