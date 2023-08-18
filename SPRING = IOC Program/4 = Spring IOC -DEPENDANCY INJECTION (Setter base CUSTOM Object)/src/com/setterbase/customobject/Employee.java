package com.setterbase.customobject;

public class Employee {

	private int eid;

	private String ename;
// entity reference
	private Compaeny compeany;

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

	public Compaeny getCompeany() {
		return compeany;
	}

	public void setCompeany(Compaeny compeany) {
		this.compeany = compeany;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", compeany=" + compeany + "]";
	}

}
