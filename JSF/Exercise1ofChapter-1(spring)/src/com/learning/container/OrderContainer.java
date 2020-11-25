package com.learning.container;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.learning.Order;

public class OrderContainer {

	public static void main(String[] args) {
	    //create the resource
			Resource resource = new ClassPathResource("com/learning/container/bean.xml");
			BeanFactory factory = new XmlBeanFactory(resource);
			
			Order order = (Order)factory.getBean("order");
			System.out.println(order);
	}

}
