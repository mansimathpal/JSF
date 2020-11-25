package com.learning.hibernate.driver;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.learning.hibernate.config.HibernateUtil;
import com.learning.hibernate.model.Student;

public class StudentDriver {

	public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		Transaction tx = session.beginTransaction();
	//	Student student = new Student(102,"riya","riya@123","riya@niit.com","12344567","female","Delhi");
	//	session.save(student);   
		
        // 2. Read the data from database
	 //   Student std = session.get(Student.class,102);
	//	System.out.println(std);
		
	 // 3. Update student information
	// which record need to be updated
		// 3.1 Fetch the object that need to be updated
	//	Student studentUpdate = session.get(Student.class,102);
		
		// 3.2 update the values using the setter method
	//	studentUpdate.setEmail("riya@gmail.com");
	//	studentUpdate.setAddress("Mumbai");
        
	   // 3.3 push the updated object in the database
		
	//	session.saveOrUpdate(studentUpdate);
		
	// 4. delete the record
		// 4.1 Fetch the object that need to be updated
	//	Student studentDelete = session.get(Student.class,102);
		
		//4.2 delete the object
	//	session.delete(studentDelete);
		
		// 5. fetch all the records
		
		List<Student> students = session.createQuery("from Student").list();
		System.out.println(students);
	
        tx.commit();
		session.close();

	}

}
