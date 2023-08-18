package com.constructorebase;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Annotation {

	@Bean
	public Custmer c() {
		Custmer cc = new Custmer(1234, "Ritesh", p(), p1());
		return cc;
	}

	@Bean
	public Product p() {
		Product pp = new Product(44, "laptop");
		return pp;
	}

	@Bean
	public Product p1() {
		Product pp1 = new Product(55, "Tab");
		return pp1;

	}

	// 1 class & multiple data store
	@Bean
	public Object[] getdata() {
		Custmer cc = new Custmer(1234, "Ritesh", p(), p1());
		Product pp = new Product(44, "laptop");
		Product pp1 = new Product(55, "Tab");

		Object[] obj = new Object[10];// 1sat way

		// Object[] ob = {cc,pp};//2 way array incilization

		obj[0] = cc;
		obj[1] = pp;

		return obj;

	}

}
