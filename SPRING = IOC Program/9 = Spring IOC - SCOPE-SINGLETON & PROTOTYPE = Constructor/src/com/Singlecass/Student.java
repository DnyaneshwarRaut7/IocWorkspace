package com.Singlecass;

public class Student {
	
	private int id;
	
	private String name;
	
	private String address;

	public Student(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	

}
