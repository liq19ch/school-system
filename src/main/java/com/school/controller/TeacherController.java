package com.school.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/teachers")
public class TeacherController {
	@GetMapping("/courses-list")
	public String showLogin() {
		return "teacher-course-list";
	}

	@GetMapping("/student-list")
	public String home() {
		return "teacher-student-list";
	}

}
