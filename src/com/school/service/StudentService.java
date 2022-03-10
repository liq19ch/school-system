package com.school.service;

import java.util.List;

import com.school.entity.Student;

public interface StudentService {
	public List<Student> getStudents();
	public void saveStudent(Student student);
}