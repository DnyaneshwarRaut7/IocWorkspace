package com.HasA;

public class Employee {
	
	private int eid;
	
	private String ename;
	
	private Compaeny compaeny;

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

	public Compaeny getCompaeny() {
		return compaeny;
	}

	public void setCompaeny(Compaeny compaeny) {
		this.compaeny = compaeny;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", compaeny=" + compaeny + "]";
	}
	
	

}
