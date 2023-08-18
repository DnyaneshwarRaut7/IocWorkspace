package com.filepath;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext apc = new FileSystemXmlApplicationContext("D:\\NewFile.xml");

		Student s = (Student) apc.getBean("s");

		System.out.println(s);

	}

}
