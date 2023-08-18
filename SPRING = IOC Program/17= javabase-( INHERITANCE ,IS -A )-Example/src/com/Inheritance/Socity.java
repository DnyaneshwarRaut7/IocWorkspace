package com.Inheritance;

public class Socity {
	
	private int sid;
	
	private String sname;
	
	private String city;

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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Socity [sid=" + sid + ", sname=" + sname + ", city=" + city + "]";
	}
	
	

}
