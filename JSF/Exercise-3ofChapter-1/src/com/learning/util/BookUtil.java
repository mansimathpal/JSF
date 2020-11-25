package com.learning.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class BookUtil {
    
     public static SessionFactory getSessionFactory(){
        Configuration config = new Configuration();
        config.configure();
        SessionFactory sessionFactory = config.buildSessionFactory();
        return sessionFactory;
    }
}    

