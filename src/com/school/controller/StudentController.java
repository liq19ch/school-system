package com.school.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.school.dao.StudentDAO;
import com.school.entity.Student;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentDAO studentDAO; 

	@RequestMapping("/list")
	public String listStudents(Model model) {
		List<Student> students = studentDAO.getStudents();
		model.addAttribute("students", students);
		return "list-students";
	}
}
