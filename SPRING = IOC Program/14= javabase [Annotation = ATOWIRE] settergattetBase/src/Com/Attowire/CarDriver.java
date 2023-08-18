package Com.Attowire;

import java.util.jar.Attributes.Name;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class CarDriver {

	private int did;

	private String dname;
	
    @Autowired
    @Qualifier(value = "dus")
	private Car car; // by name == multiple, variable name
    
    @Autowired
    @Qualifier(value = "ta")
  	private Car car1;


	public Car getCar1() {
		return car1;
	}

	public void setCar1(Car car1) {
		this.car1 = car1;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	@Override
	public String toString() {
		return "CarDriver [did=" + did + ", dname=" + dname + ", car=" + car + ", car1=" + car1 + "]";
	}

}
