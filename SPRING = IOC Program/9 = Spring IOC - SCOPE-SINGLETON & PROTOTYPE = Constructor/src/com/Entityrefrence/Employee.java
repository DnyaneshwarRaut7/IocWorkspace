package com.Entityrefrence;

public class Employee {

	private int id;

	private String ename;

	private String address;

	private Compaeny compaeny;

	public Employee(int id, String ename, String address, Compaeny compaeny) {
		super();
		this.id = id;
		this.ename = ename;
		this.address = address;
		this.compaeny = compaeny;
	}

	public Compaeny getCompaeny() {
		return compaeny;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", ename=" + ename + ", address=" + address + ", compaeny=" + compaeny + "]";
	}

}
