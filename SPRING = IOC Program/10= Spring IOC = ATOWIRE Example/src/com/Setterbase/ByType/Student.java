package com.Setterbase.ByType;

public class Student {

	private int sid;

	private String sname;

	private String address;
	// single object call bytype
	private Cource cource;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Cource getCource() {
		return cource;
	}

	public void setCource(Cource cource) {
		this.cource = cource;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", address=" + address + ", cource=" + cource + "]";
	}

	// not possible double
	// private cource c1;

}
