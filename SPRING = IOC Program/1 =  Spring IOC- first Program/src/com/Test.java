package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {

		// bean factory lease loading calling a .getmethod after output

		Resource resource = new ClassPathResource("NewFile.xml");

		BeanFactory beanFactory = new XmlBeanFactory(resource);

		System.out.println("---------BEAN FACTORY INTERFACE Use ---------");

		DBConnection con = (DBConnection) beanFactory.getBean("m");

		con.connectionOff();
		con.connectionOn();

		System.out.println("-----------------------------------------");

		con = (DBConnection) beanFactory.getBean("o");

		con.connectionOff();
		con.connectionOn();
//		DBConnection con1 = (DBConnection) beanFactory.getBean("o");
//		con1.connectionOff();
//		con1.connectionOn();

		System.out.println("**********************************************");
		// Application Context EagerLoading direct XML calling getbeen method not call
		// Direct object Print
System.out.println("------- APPLICATIN CONTEXT INTERFACE USE--------");

		ApplicationContext apc = new ClassPathXmlApplicationContext("NewFile.xml");

		con = (DBConnection) apc.getBean("m");

		con.connectionOff();
		con.connectionOn();

		System.out.println("-----------------------------------");

		con = (DBConnection) apc.getBean("o");

		con.connectionOff();
		con.connectionOn();
		System.out.println("***********************************************");
		System.out.println("-------- File System Xml ----------");
		ApplicationContext apc1 = new FileSystemXmlApplicationContext("D:\\NewFile.xml");
		con=(DBConnection) apc.getBean("o");
		
		con.connectionOff();
		con.connectionOn();

	}

}
