package com.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/scope/NewFile.xml");
		Employee e = (Employee) context.getBean("e");

		System.out.println(e.hashCode());
		System.out.println("-----------------------------------------------");

		Employee e1 = (Employee) context.getBean("e");

		System.out.println(e1.hashCode());

	}

}
