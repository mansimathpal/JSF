package com.learning.container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learning.Customer;

public class TestBeanWiring {
	public static void main(String s[]) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/learning/container/Spring-Config.xml");
		Customer cust = (Customer)ac.getBean("customerbean");
		System.out.println("The values are :");
		System.out.println(cust.getFirstName());
		System.out.println(cust.getMiddleName());
		System.out.println(cust.getLastName());

	}
}
