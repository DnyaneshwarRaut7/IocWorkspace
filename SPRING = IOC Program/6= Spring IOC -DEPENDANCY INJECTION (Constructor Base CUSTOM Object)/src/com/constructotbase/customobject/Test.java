package com.constructotbase.customobject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext apc = new ClassPathXmlApplicationContext("com/constructotbase/customobject/NewFile.xml");

		Student ss = apc.getBean(Student.class, "s");
		
		System.out.println(ss);
	}

}
