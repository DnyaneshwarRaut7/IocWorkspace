package com.settersbase.collectionbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext apc = new ClassPathXmlApplicationContext("com/settersbase/collectionbased/NewFile.xml");
		 
	Amazon aa=	apc.getBean(Amazon.class,"a");
	
	System.out.println(aa);
	}

}
