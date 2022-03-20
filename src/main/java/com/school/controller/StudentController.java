package com.school.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/students")
public class StudentController {
	
	@GetMapping("/courses")
	public String course() {
		return "courses";
	}
	
	@GetMapping("/info")
	public String info() {
		return "info";
	}

}
