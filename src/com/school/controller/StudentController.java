package com.school.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.school.entity.Student;
import com.school.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService; 

	@GetMapping("/list")
	public String listStudents(Model model) {
		List<Student> students = studentService.getStudents();
		model.addAttribute("students", students);
		return "list-students";
	}
	
	@GetMapping("/addForm")
	public String addForm(Model model) {
		Student student = new Student();
		model.addAttribute("student", student);
		return "student-form";
	}
}
