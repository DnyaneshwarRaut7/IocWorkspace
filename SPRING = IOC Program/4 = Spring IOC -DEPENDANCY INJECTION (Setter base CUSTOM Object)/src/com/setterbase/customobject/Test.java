package com.setterbase.customobject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext apc = new ClassPathXmlApplicationContext("/com/setterbase/customobject/NewFile.xml");

		Employee ee = apc.getBean(Employee.class, "e");
		
		System.out.println(ee);

	}

}
