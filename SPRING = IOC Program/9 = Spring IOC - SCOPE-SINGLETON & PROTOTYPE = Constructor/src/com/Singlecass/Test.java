package com.Singlecass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext acp = new ClassPathXmlApplicationContext("com/Singlecass/NewFile.xml");
		Student ss = (Student) acp.getBean("s");
		System.out.println(ss.hashCode());
		
		System.out.println("-------------------------------");
		
		Student ss1 = (Student)acp.getBean("s");
		System.out.println(ss1.hashCode());

	}

}
