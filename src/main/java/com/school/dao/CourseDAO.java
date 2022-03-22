package com.school.dao;

import java.util.List;

import com.school.entity.Course;

public interface CourseDAO {

	public List<Course> getCourse();

	public void saveCourse(Course student);

	public Course getCourse(int id);

	public void deleteCourse(int id);

	public List<Course> searchCourse(String searchName);

}
