package com.school.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.hibernate.query.Query;
import com.school.entity.Student;


@Repository
public class StudentDAOImpl implements StudentDAO {

	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Student> getStudents() {
		Session currentSession =  sessionFactory.getCurrentSession();
		Query<Student> query = currentSession.createQuery("from Student order by lastName", Student.class);
		List<Student>students = query.getResultList();
		return students;
	}

	@Override
	public void saveStudent(Student student) {
		Session currentSession =  sessionFactory.getCurrentSession();
		currentSession.save(student);
		
	}

}
