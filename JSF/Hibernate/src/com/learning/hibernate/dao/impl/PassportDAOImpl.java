package com.learning.hibernate.dao.impl;


import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.learning.hibernate.config.HibernateUtil;
import com.learning.hibernate.dao.PassportDAO;
import com.learning.hibernate.model.Passport;

public class PassportDAOImpl implements PassportDAO {
	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	@Override
	public boolean savePassport(Passport passport) {
		try {
		Session session;
		Transaction tx;
		session = sessionFactory.openSession();
	    tx = session.beginTransaction();
	    session.save(passport);
	    tx.commit();
		session.close();
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean deletePassport(Passport passport) {
		try {
			Session session;
			Transaction tx;
			session = sessionFactory.openSession();
		    tx = session.beginTransaction();
		    session.delete(passport);
		    tx.commit();
			session.close();
			} catch (HibernateException e) {
				e.printStackTrace();
				return false;
			}
		return false;
	}

	@Override
	public Passport getPassportbyId(int id) {
		try {
			Session session;
			Transaction tx;
			session = sessionFactory.openSession();
		    tx = session.beginTransaction();
		  Passport passport =  session.get(Passport.class,id);
		    tx.commit();
			session.close();
			return passport;
			} catch (HibernateException e) {
				e.printStackTrace();
				return null;
			}
	}

	@Override
	public boolean updatePassport(Passport passport) {
		try {
			Session session;
			Transaction tx;
			session = sessionFactory.openSession();
		    tx = session.beginTransaction();
		    session.update(passport);
		    tx.commit();
			session.close();
			return true;
			} catch (HibernateException e) {
				e.printStackTrace();
				return false;
			}
	}

	@Override
	public List<Passport> getAllPassports() {
		try {
			Session session;
			Transaction tx;
			session = sessionFactory.openSession();
		    tx = session.beginTransaction();
		    List<Passport> passports = session.createQuery("From Passport").list();
		    tx.commit();
			session.close();
			return passports;
			} catch (HibernateException e) {
				e.printStackTrace();
				return null;
			}
	}
}
