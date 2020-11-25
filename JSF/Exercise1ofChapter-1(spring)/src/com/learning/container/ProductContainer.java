package com.learning.container;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.learning.Product;

public class ProductContainer {

	public static void main(String[] args) {
	    //create the resource
			Resource resource = new ClassPathResource("com/learning/container/bean.xml");
			BeanFactory factory = new XmlBeanFactory(resource);
			
			Product product = (Product)factory.getBean("product");
			System.out.println(product);
	}

}
