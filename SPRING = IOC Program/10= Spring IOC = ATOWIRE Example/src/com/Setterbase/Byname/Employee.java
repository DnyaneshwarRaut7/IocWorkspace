package com.Setterbase.Byname;

public class Employee {

	private int eid;

	private String ename;

	private String address;
// Entity reference
	private Compaeny compaeny;
	//Same class multiple variable  use
	
	private Compaeny compaeny1;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
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
	

	public Compaeny getCompaeny1() {
		return compaeny1;
	}

	public void setCompaeny1(Compaeny compaeny1) {
		this.compaeny1 = compaeny1;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", address=" + address + ", compaeny=" + compaeny
				+ ", compaeny1=" + compaeny1 + "]";
	}

	

}
