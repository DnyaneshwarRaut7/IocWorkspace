package com.constructotbase.customobject;

public class Student {

	private int id;

	private String sname;

	public College college;

	public Student(int id, String sname, College college) {
		super();
		this.id = id;
		this.sname = sname;
		this.college = college;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", sname=" + sname + ", college=" + college + "]";
	}

}
