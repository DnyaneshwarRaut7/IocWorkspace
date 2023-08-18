package com.constructorbase.Constructor;

public class CarEngine {

	private int eid;

	private String etype;

	public CarEngine(int eid, String etype) {
		super();
		this.eid = eid;
		this.etype = etype;
	}

	@Override
	public String toString() {
		return "CarEngine [eid=" + eid + ", etype=" + etype + "]";
	}

}
