package com.Setterbase.ByType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		//AUTOWIRE - ByType
		//only setter getter use
		//only one object create 
		// empty class = null
		
		
		ApplicationContext apc = new ClassPathXmlApplicationContext("com/Setterbase/ByType/NewFile.xml");
		Student ss= (Student) apc.getBean("s");
		System.out.println(ss);
	}

}
