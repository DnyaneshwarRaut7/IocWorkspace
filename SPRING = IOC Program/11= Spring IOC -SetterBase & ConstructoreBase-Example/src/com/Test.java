package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	// Sequence does'nt Matter
	//Setter getter Injection always Override a constructorBase Injection
	//Setter base injection good

	public static void main(String[] args) {

		ApplicationContext apc = new ClassPathXmlApplicationContext("com/NewFile.xml");

		Student ss = (Student) apc.getBean("s");
		System.out.println(ss);

	}

}
