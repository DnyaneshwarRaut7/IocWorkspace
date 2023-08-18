package com.scope;

public class Employee {

	private int id;

	private String name;

	private String address;

	private Compaeny compaeny;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", compaeny=" + compaeny + "]";
	}

}
