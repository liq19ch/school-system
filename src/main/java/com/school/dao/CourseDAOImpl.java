package com.school.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.school.entity.Course;
import com.school.entity.Student;

@Repository
public class CourseDAOImpl implements CourseDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Course> getCourse() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Course> query = currentSession.createQuery("from Course order by number", Course.class);
		List<Course> course = query.getResultList();
		return course;
	}

	@Override
	public void saveCourse(Course course) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(course);

	}

	@Override
	public Course getCourse(int id) {
		Session currentSession =  sessionFactory.getCurrentSession();
		Course course = currentSession.get(Course.class, id);
		return course;
	}

	@Override
	public void deleteCourse(int id) {
		Session currentSession =  sessionFactory.getCurrentSession();
		Query query = currentSession.createQuery("delete from Course where id=:courseId");
		query.setParameter("courseId", id);
		query.executeUpdate();

	}

	@Override
	public List<Course> searchCourse(String searchName) {

		Session currentSession = sessionFactory.getCurrentSession();
        Query query = null;
   
        if (searchName != null && searchName.trim().length() > 0) {
        	query = currentSession.createQuery("from Course where lower(name) like :theName", Course.class);
        	query.setParameter("theName", "%" + searchName.toLowerCase() + "%");
        }
        else {
        	query =currentSession.createQuery("from Course", Course.class);            
        }
        
  
        List<Course> courses = query.getResultList();
                

        return courses;
	}

}