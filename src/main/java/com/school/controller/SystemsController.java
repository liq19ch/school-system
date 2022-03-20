package com.school.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.school.entity.Student;
import com.school.service.StudentService;

@Controller
@RequestMapping("/systems")
public class SystemsController {
	
	@Autowired
	private StudentService studentService; 
	
	@GetMapping("/")
	public String system() {
		return "systems";
	}
	
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
	
	@PostMapping("/saveStudent")
	public String saveStudent(@ModelAttribute("student") Student student){
		studentService.saveStudent(student);
		return "redirect:/student/list";
	}
	
	@GetMapping("/updateForm")
	public String updateForm(@RequestParam("studentId") int id, Model model) {
		Student student = studentService.getStudent(id);
		model.addAttribute("student", student);
		return "student-form";
	}
	
	@GetMapping("/delete")
	public String deleteStudent(@RequestParam("studentId") int id) {
		studentService.deleteStudent(id);
		return "redirect:/student/list";
	}
	
	@GetMapping("/search")
	 public String search(@RequestParam("searchName") String searchName,
             Model model) {
		
		List<Student> students = studentService.searchStudents(searchName);
		model.addAttribute("students", students);
		return "list-students";        
}
	
}
