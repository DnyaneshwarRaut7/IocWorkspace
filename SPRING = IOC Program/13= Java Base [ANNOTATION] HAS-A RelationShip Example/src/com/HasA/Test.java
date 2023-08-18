package com.HasA;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {

	ApplicationContext apc = new AnnotationConfigApplicationContext(AnnotationBase.class);
	
	Employee ee = (Employee) apc.getBean("e");
	System.out.println(ee);
	System.out.println(ee.hashCode());
	System.out.println(ee.getCompaeny().hashCode());
	
	System.out.println("--------------------------------------------------");
	
	Employee ee1 = (Employee) apc.getBean("e");
	System.out.println(ee1);
	System.out.println(ee1.hashCode());
	System.out.println(ee1.getCompaeny().hashCode());
	
	}

}
