package com.Inheritance;

public class Flat extends Socity {

	private int fid;

	private String fname;

	private String wingname;

	public int getFid() {
		return fid;
	}

	public void setFid(int fid) {
		this.fid = fid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getWingname() {
		return wingname;
	}

	public void setWingname(String wingname) {
		this.wingname = wingname;
	}

	@Override
	public String toString() {
		return "Flat [fid=" + fid + ", fname=" + fname + ", wingname=" + wingname + "]";
	}

}
