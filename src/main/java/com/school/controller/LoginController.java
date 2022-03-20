package com.school.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class LoginController {

	@GetMapping("/loginPage")
	public String showLogin() {
		return "login";
	}
	
	@GetMapping("/")
	public String home(Model model) {
		return "index";
	}
}
