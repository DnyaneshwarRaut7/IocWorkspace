package com;

public class Employee {

	private int eid;

	private String ename;

	private String address;

	public Employee(int eid, String ename, String address) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", address=" + address + "]";
	}

}
