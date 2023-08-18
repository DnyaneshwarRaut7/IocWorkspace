package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext acp = new ClassPathXmlApplicationContext("NewFile.xml");
		Employee ee = (Employee) acp.getBean("e");

		System.out.println(ee);

	}

}
