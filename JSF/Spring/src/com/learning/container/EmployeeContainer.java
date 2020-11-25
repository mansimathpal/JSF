package com.learning.container;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.learning.Employee;


public class EmployeeContainer {

	public static void main(String[] args) {

    //create the resource
		Resource resource = new ClassPathResource("com/learning/container/bean.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		Employee employee = (Employee)factory.getBean("employee");
		System.out.println(employee);
	}

}
