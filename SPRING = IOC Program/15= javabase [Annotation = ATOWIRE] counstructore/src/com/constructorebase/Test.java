package com.constructorebase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext apc = new AnnotationConfigApplicationContext(Annotation.class);

		Custmer cc = (Custmer) apc.getBean("c");
		System.out.println(cc);
	System.out.println("--------------------------------------------------");	
	
		Object[]  obj1 = (Object[]) apc.getBean("getdata");
		
		System.out.println(obj1[0]); 
		System.out.println(obj1[1]);
		
	 	

	}

}
