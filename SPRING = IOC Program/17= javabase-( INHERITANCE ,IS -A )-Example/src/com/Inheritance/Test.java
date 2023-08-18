package com.Inheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext apc = new AnnotationConfigApplicationContext(AnnotationBase.class);

		Flat ff = (Flat) apc.getBean("f");
		System.out.println("Socity Id :-  " +ff.getSid());
		System.out.println("Socity Name :-  " +ff.getSname());
		System.out.println("Socity City Name :-  " +ff.getSid());
		
		System.out.println("---------------------------------------------");

		System.out.println("flat Id :-  " + ff.getFid());
		System.out.println("flat Name :-  " +ff.getFname());
		System.out.println("Flat Name :-  " +ff.getWingname());

	}

}
