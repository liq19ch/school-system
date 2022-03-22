package com.school.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.dao.CourseDAO;
import com.school.entity.Course;
import com.school.entity.Student;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseDAO courseDAO;

	@Override
	@Transactional
	public List<Course> getCourse() {
		return courseDAO.getCourse();
	}

	@Override
	@Transactional
	public void saveCourse(Course course) {
		courseDAO.saveCourse(course);

	}

	@Override
	@Transactional
	public Course getCourse(int id) {
		return courseDAO.getCourse(id);
	}

	@Override
	@Transactional
	public void deleteCourse(int id) {
		courseDAO.deleteCourse(id);

	}

	@Override
	@Transactional
	public List<Course> searchCourse(String searchName) {
		return courseDAO.searchCourse(searchName);
	}

}
