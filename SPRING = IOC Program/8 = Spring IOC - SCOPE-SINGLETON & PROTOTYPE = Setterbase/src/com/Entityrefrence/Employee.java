package com.Entityrefrence;

public class Employee {

	private int id;

	private String ename;

	private String address;

	private Compaeny compaeny;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Compaeny getCompaeny() {
		return compaeny;
	}

	public void setCompaeny(Compaeny compaeny) {
		this.compaeny = compaeny;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", ename=" + ename + ", address=" + address + ", compaeny=" + compaeny + "]";
	}

}
