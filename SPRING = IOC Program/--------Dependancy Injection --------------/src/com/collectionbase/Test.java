package com.collectionbase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext apc = new ClassPathXmlApplicationContext("com/collectionbase/NewFile.xml");
		Product pp = (Product) apc.getBean("p");

		System.out.println(pp);

	}

}
