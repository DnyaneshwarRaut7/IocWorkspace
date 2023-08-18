package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Annotationbase {

	Scanner sc = new Scanner(System.in);

	@Bean// single product data  show
	public Product p() {

		Product product = new Product();

		System.out.println("Enter Product Id :-");
		product.setPid(sc.nextInt());

		System.out.println("Enter Product Name :-");
		product.setPname(sc.next());

		System.out.println("Enter product Type :-");
		product.setPtype(sc.next());

		System.out.println("Enter Product Price:- ");
		product.setPrice(sc.nextDouble());
		return product;
	}

	@Bean// list of product data show
	public List<Product> plist() {

		List<Product> pl = new ArrayList<Product>();

		System.out.println("Enter your Product..");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			Product product = new Product();
			System.out.println("Enter Product Id :-");
			product.setPid(sc.nextInt());

			System.out.println("Enter Product Name :-");
			product.setPname(sc.next());

			System.out.println("Enter product Type :-");
			product.setPtype(sc.next());

			System.out.println("Enter Product Price:- ");
			product.setPrice(sc.nextDouble());

			pl.add(product);
		}
		return pl;
	}
	
	@Bean
	public Map<String,List<Product>> map(){
		
		Map<String, List<Product>> m = new HashMap<String,List<Product>>();
		
		m.put("D-Mart", plist());
		
		return m;
		
		
		
	}

}
