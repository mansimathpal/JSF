package com.learning.driver;

import com.learning.NewBooks;
import com.learning.Student;
import com.learning.util.BookUtil;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class DriverClass {
    public static void main(String[] args){
        SessionFactory sessionFactory = BookUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx =  session.beginTransaction();
        NewBooks book1 = new NewBooks(101, "Spring", "Ram Narayan", "Jasico", "Course", null);
        
        NewBooks book2 = new NewBooks(102, "Hibernate", "Jacob Abbott", "Pearson", "Course", null);
        
        Set<NewBooks> Books = new HashSet<>();

        Books.add(book1);
        Books.add(book2);
        Student student = new Student(10111, "Hibernate","mansi",194800, "23.11.2020", "25.12.2020");
        session.save(student);
        /* native SQL QUERIES using sqlquery interface*/
        SQLQuery query = session.createSQLQuery(select * from NewBooks);
        tx.commit();
        session.close();
        
    }
}
    
