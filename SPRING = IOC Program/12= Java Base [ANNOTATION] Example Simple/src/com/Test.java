package com;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext apc = new AnnotationConfigApplicationContext(AnnotationBase.class);

		Student ss = (Student) apc.getBean("s");
		System.out.println(ss);
		System.out.println(ss.hashCode());
		
		System.out.println("------------------------------------------");

		Student sss = (Student) apc.getBean("s");
		System.out.println(sss);
		System.out.println(sss.hashCode());
			

		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");

		List<Student> ss1 = (List<Student>) apc.getBean("ss");
		System.out.println(ss1);

	}

}
