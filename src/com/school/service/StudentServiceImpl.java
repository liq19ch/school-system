package com.school.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.dao.StudentDAO;
import com.school.entity.Student;



@Service
public class StudentServiceImpl implements StudentService{

	
	@Autowired
	private StudentDAO studentDAO;
	
	
	@Override
	@Transactional
	public List<Student> getStudents() {
		return studentDAO.getStudents();
	}


	@Override
	@Transactional
	public void saveStudent(Student student) {
		studentDAO.saveStudent(student);
	}


	@Override
	@Transactional
	public Student getStudent(int id) {
		return studentDAO.getStudent(id);
	}


	@Override
	@Transactional
	public void deleteStudent(int id) {
		studentDAO.deleteStudent(id);
		
	}

}
