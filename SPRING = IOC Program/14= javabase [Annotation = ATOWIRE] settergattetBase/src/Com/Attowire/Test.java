package Com.Attowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {

	ApplicationContext apc = new AnnotationConfigApplicationContext(Annotation.class);
	

	 CarDriver ccc = (CarDriver) apc.getBean("cd");
	 System.out.println(ccc);
	
	}

}
