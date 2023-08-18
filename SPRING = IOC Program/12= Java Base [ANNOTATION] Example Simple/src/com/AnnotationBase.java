package com;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration // all beans store
public class AnnotationBase {

	@Bean // Particular a bean (object)
	
	//@Scope(value = "singleton")//by default
		@Scope(value = "prototype")
	
	public Student s() {
		Student s = new Student();
		s.setId(11);
		s.setSname("Mauli");
		s.setAddress("pune");
		return s;
	}

	@Bean(name = "ss") // Bean name change & Object Name Change
	
	public List<Student> slist() {

		List<Student> clist = new ArrayList<Student>();

		Student ss = new Student();
		ss.setId(12);
		ss.setSname("Suraj");
		ss.setAddress("Rajuri");

		Student ss1 = new Student();
		ss1.setId(13);
		ss1.setSname("Sumit");
		ss1.setAddress("Pimperi");
		
		clist.add(ss);
		clist.add(ss1);

		return clist;

	}

}
