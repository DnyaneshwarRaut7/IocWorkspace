package com.Entityrefrence;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		System.out.println("protected = diffreant diffreant object print ");
		System.out.println("singleton = same type object Print");
		ApplicationContext apc = new ClassPathXmlApplicationContext("com/Entityrefrence/NewFile.xml");
		Employee ee = (Employee) apc.getBean("e");
		System.out.println(ee.hashCode());
		System.out.println(ee.getCompaeny().hashCode());
		
		System.out.println("---------------------------------------");
		
		Employee ee1 = (Employee) apc.getBean("e");
		System.out.println(ee1.hashCode());
		System.out.println(ee1.getCompaeny().hashCode());
		
		System.out.println("=========================================================");

		System.out.println("protected = diffreant diffreant object print ");
		System.out.println("protected = diffreant diffreant object print ");
		
		Employee pp = (Employee) apc.getBean("e");
		System.out.println(pp.hashCode());
		System.out.println(pp.getCompaeny().hashCode());
		
		System.out.println("---------------------------------------");
		
		Employee pp1 = (Employee) apc.getBean("e");
		System.out.println(pp1.hashCode());
		System.out.println(pp1.getCompaeny().hashCode());
		
		System.out.println("=========================================================");
		
		System.out.println("singleton = same type object Print");
		System.out.println("singleton = same type object Print");
		Employee ss = (Employee) apc.getBean("e");
		System.out.println(ss.hashCode());
		System.out.println(ss.getCompaeny().hashCode());
		
		System.out.println("---------------------------------------");
		
		Employee ss1 = (Employee) apc.getBean("e");
		System.out.println(ss1.hashCode());
		System.out.println(ss1.getCompaeny().hashCode());
		
		System.out.println("=========================================================");
		
		System.out.println("singleton = same type object Print");
		System.out.println("protected = diffreant diffreant object print ");
		//lookup method use  
		Employee sp = (Employee) apc.getBean("e");
		System.out.println(sp.hashCode());
		System.out.println(sp.getCompaeny().hashCode()); 
		
		System.out.println("---------------------------------------");
		
		Employee sp1 = (Employee) apc.getBean("e");
		System.out.println(sp1.hashCode());
		System.out.println(sp1.getCompaeny().hashCode());
		
		System.out.println("=========================================================");
		
	}

}
