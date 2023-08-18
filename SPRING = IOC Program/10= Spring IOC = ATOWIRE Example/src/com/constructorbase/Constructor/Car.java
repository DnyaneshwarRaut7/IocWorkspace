package com.constructorbase.Constructor;

public class Car {

	private int cid;

	private String cname;

	private CarEngine carengine;

	public Car(int cid, String cname, CarEngine carengine) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.carengine = carengine;
	}
	

	public int getCid() {
		return cid;
	}


	public String getCname() {
		return cname;
	}


	public CarEngine getCarengine() {
		return carengine;
	}


	@Override
	public String toString() {
		return "Car [cid=" + cid + ", cname=" + cname + ", carengine=" + carengine + "]";
	}

}
