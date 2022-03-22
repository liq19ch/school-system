package com.school.service;

import java.util.List;

import com.school.entity.Course;
import com.school.entity.Student;

public interface CourseService {
	public List<Course> getCourse();

	public void saveCourse(Course course);

	public Course getCourse(int id);

	public void deleteCourse(int id);

	public List<Course> searchCourse(String searchName);
}
