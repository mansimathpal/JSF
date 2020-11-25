package com.learning.driver;

import com.learning.Eshopping;
import com.learning.util.EshoppingUtil;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class DriverClass {
    public static void main(String[] args){
        SessionFactory sessionFactory = EshoppingUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx =  session.beginTransaction();
        
        Eshopping eshopping = new Eshopping("Riya","Kumari" , "Mumbai", 1010, 1234567890, "Expensive", "Debit Card");
       session.save(eshopping);
        
        tx.commit();
        session.close();
        
    }
}