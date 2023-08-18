package Com.Attowire;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Annotation {

	@Bean
	public CarDriver cd() {
		CarDriver cc = new CarDriver();
		cc.setDid(11);
		cc.setDname("Rushi");
		//cc.setCar(c());
		return cc;
	}

	@Bean// by name // by type
	public Car dus() {// class variable name// @annotation name
		Car car = new Car();
		car.setCid(22);
		car.setCname("Duster");
		return car;
	}
	
	@Bean
	public Car ta() {
		Car car = new Car();
		car.setCid(23);
		car.setCname("tata");
		return car;

	}


}
