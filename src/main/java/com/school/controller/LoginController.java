package com.school.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
	
	@GetMapping("/")
	public String home() {
		return "index";
	}

	@GetMapping("/loginPage")
	public String showLogin() {
		return "login";
	}


	@GetMapping("/systems")
	public String system() {
		return "systems";
	}
	
	@GetMapping("/accessDenied")
	public String accessDenied() {
		return "accessDenied";
	}
}
