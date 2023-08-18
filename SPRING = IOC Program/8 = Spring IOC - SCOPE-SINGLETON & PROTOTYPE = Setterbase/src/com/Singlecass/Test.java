package com.Singlecass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
        // Singleton scope only one type object & hashcode print Same type print
		//bydefeault scope singleton 
		System.out.println("------ singleton scope---");
		ApplicationContext apc = new ClassPathXmlApplicationContext("com/Singlecass/NewFile.xml");
		Student ss = (Student) apc.getBean("s");
		System.out.println(ss.hashCode());
		
		System.out.println("------------------------------------------------");
		
		Student ss1 = (Student) apc.getBean("s");
		System.out.println(ss1.hashCode());
		
		// prototype scope different different type object & hashcode print multiple

	}

}
