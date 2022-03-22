package com.school.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.school.entity.Course;
import com.school.entity.Student;
import com.school.service.CourseService;

@Controller
@RequestMapping("/students")
public class StudentController {

	@Autowired
	private CourseService courseService;

	@GetMapping("/courses")
	public String listCourses(Model model) {
		List<Course> course = courseService.getCourse();
		model.addAttribute("course", course);
		return "courses";
	}
	
	@GetMapping("/my-courses")
	public String listMyCourse(Model model) {
		return "my-courses";
	}

	@GetMapping("/info")
	public String info() {
		return "info";
	}
	
	@GetMapping("/search")
	public String search(@RequestParam("searchName") String searchName, Model model) {
		List<Course> courses = courseService.searchCourse(searchName);
		model.addAttribute("course", courses);
		return "courses";
	}

}
