package com.HasA;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AnnotationBase {

	@Bean
	// @Scope(value = "prototype") //1= different object
	// @Scope(value = "prototype") //2 = different object
	// @Scope(value = "singleton") //3= Single Object
	@Scope(value = "singleton") // 4= Single Object
	public Employee e() {

		Employee ee = new Employee();
		ee.setEid(11);
		ee.setEname("Mauli");
		ee.setCompaeny(c());
		return ee;
	}

	@Bean

	// @Scope(value = "singleton") // 1= same object
	// @Scope(value = "prototype") // 2= different object
	// @Scope(value = "singleton") // 3= Single Object
	@Scope(value = "prototype") // 2= different object/ same object print
	public Compaeny c() {

		Compaeny cc = new Compaeny();

		cc.setCid(12);
		cc.setCname("TCS");
		cc.setAddress("Hinjevadi");
		return cc;
	}

}
