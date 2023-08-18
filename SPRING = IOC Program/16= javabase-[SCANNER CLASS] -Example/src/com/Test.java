package com;

import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext apc = new AnnotationConfigApplicationContext(Annotationbase.class);

		Product pp = (Product) apc.getBean("p");
		System.out.println(pp);

		String orderdate = DateConversion.dateconverter();
		pp.setOrderdate(orderdate);
		System.out.println("After Order Product Date : " + orderdate);

		System.out.println("----------  List of data  -----------");

		List<Product> plists = (List<Product>) apc.getBean("plist");
		System.out.println(plists);

		System.out.println(" ------------------   Map data   -------------");

		Map<String, List<Product>> mapdata = (Map<String, List<Product>>) apc.getBean("map");
		System.out.println(mapdata);
	}

}
