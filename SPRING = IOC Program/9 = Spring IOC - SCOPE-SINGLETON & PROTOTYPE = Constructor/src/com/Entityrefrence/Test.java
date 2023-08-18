package com.Entityrefrence;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Singlecass.Student;

public class Test {

	public static void main(String[] args) {

	
		ApplicationContext acp = new ClassPathXmlApplicationContext("com/Entityrefrence/NewFile.xml");
		Employee ee =(Employee) acp.getBean("e");
		System.out.println(ee.hashCode()); 
		System.out.println(ee.getCompaeny().hashCode());
		
		System.out.println("-------------------------------");
		
		Employee ee2 =(Employee) acp.getBean("e");
		System.out.println(ee2.hashCode());
		System.out.println(ee2.getCompaeny().hashCode());
		
	
	}

}
