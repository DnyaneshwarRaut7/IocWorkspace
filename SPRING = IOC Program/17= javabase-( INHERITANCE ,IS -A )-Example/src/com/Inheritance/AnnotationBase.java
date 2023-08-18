package com.Inheritance;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnnotationBase {

	@Bean
	public Socity f() {

		Flat f = new Flat();

		f.setSid(11);
		f.setSname("Balagi-Nager");
		f.setCity("Jamkhed");

		f.setFid(4);
		f.setFname("OM-Nivas");
		f.setWingname("A-2-flower");

		return f;

	}

}
