package com.Setterbase.Byname;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		// Autowire Attrubute
		//byName= empty property = null
		// Only setter getter use
		//Same Class Multiple Variable Use
		//entity Class Variable name Copy
		
		ApplicationContext apc = new ClassPathXmlApplicationContext("com/Setterbase/Byname/NewFile.xml");
		
	Employee ee = (Employee) apc.getBean("e");
	System.out.println(ee);
	}

}
