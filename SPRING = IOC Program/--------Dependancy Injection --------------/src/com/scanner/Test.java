package com.scanner;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext apc = new AnnotationConfigApplicationContext(AnnotationBase.class);
		Student s = (Student) apc.getBean("s");

		System.out.println(s);

		List<Student> ss = (List<Student>) apc.getBean("slist");

		System.out.println(ss);
	}

}
