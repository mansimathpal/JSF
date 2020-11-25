package com.learning.hibernate.dao.impl;


import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.learning.hibernate.config.HibernateUtil;
import com.learning.hibernate.dao.CourseDAO;
import com.learning.hibernate.model.Course;

public class CourseDAOImpl implements CourseDAO {
	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	@Override
	public boolean saveCourse(Course course) {
		try {
		Session session;
		Transaction tx;
		session = sessionFactory.openSession();
	    tx = session.beginTransaction();
	    session.save(course);
	    tx.commit();
		session.close();
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean deleteCourse(Course course) {
		try {
			Session session;
			Transaction tx;
			session = sessionFactory.openSession();
		    tx = session.beginTransaction();
		    session.delete(course);
		    tx.commit();
			session.close();
			} catch (HibernateException e) {
				e.printStackTrace();
				return false;
			}
		return false;
	}

	@Override
	public Course getCoursebyId(int id) {
		try {
			Session session;
			Transaction tx;
			session = sessionFactory.openSession();
		    tx = session.beginTransaction();
		  Course course =  session.get(Course.class,id);
		    tx.commit();
			session.close();
			return course;
			} catch (HibernateException e) {
				e.printStackTrace();
				return null;
			}
	}

	@Override
	public boolean updateCourse(Course course) {
		try {
			Session session;
			Transaction tx;
			session = sessionFactory.openSession();
		    tx = session.beginTransaction();
		    session.update(course);
		    tx.commit();
			session.close();
			return true;
			} catch (HibernateException e) {
				e.printStackTrace();
				return false;
			}
	}

	@Override
	public List<Course> getAllCourse() {
		try {
			Session session;
			Transaction tx;
			session = sessionFactory.openSession();
		    tx = session.beginTransaction();
		    List<Course> course = session.createQuery("From Course").list();
		    tx.commit();
			session.close();
			return course;
			} catch (HibernateException e) {
				e.printStackTrace();
				return null;
			}
	}
}
