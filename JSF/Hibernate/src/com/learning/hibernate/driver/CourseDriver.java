package com.learning.hibernate.driver;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.learning.hibernate.config.HibernateUtil;
import com.learning.hibernate.model.Course;

public class CourseDriver {

	public static void main(String[] args) {
       SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
       Session session = sessionFactory.openSession();
       Transaction tx = session.beginTransaction();
       
     //  Course course = new Course(3, "JAVA", 5.0, 19000, "Pankaj", "Under Graduate");
    //   session.save(course);
       // 5. Fetch all records
       List<Course> courses = session.createQuery("from Course").list();
       for(Course c: courses) {
    	   System.out.println(c);
       }
       
       tx.commit();
       session.close();
	}

}
