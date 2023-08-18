package com.constructorbase.Constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
      
	  //AUTOWire = constructor
	// constructor only constructor base & getter Method use
	//constructor by default first calling ByType & Second  calling  bYName
	//empty property exception
	public static void main(String[] args) {

		ApplicationContext apc = new ClassPathXmlApplicationContext("com/constructorbase/Constructor/NewFile.xml");

		Car cc = (Car) apc.getBean("c");
		System.out.println(cc);

	}

}
