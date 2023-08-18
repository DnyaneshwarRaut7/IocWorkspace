package com.setterbase;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {

		Resource resource = new ClassPathResource("NewFile.xml");

		BeanFactory beanFactory = new XmlBeanFactory(resource);

		Student ss = (Student) beanFactory.getBean("s");

		System.out.println(ss);

		System.out.println("----------------------------------------");

		ApplicationContext apc = new ClassPathXmlApplicationContext("NewFile.xml");

		Student sss = (Student) apc.getBean("s");
		
		System.out.println(sss);
	}
}