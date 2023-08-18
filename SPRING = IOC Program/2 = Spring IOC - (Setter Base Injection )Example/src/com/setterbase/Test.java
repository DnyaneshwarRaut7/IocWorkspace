package com.setterbase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext acp = new ClassPathXmlApplicationContext("NewFile.xml");

		Student ss = (Student) acp.getBean("s");

		System.out.println(ss);

	}

}
