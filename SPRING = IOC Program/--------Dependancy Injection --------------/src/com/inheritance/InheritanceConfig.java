package com.inheritance;

import org.springframework.context.annotation.Bean;

public class InheritanceConfig {

	@Bean
	public Teachar t() { // method return type parent

		Student s = new Student();

		s.setTid(1);
		s.setTname("Nilesh");
		s.setTaddress("Ravet");
		s.setSid(2);
		s.setSname("Mauli");
		s.setSaddress("pune");

		return s;

	}

}
