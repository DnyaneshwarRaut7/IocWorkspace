package com.inheritance;

public class Teachar {

	private int tid;

	private String tname;

	private String taddress;

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getTaddress() {
		return taddress;
	}

	public void setTaddress(String taddress) {
		this.taddress = taddress;
	}

	@Override
	public String toString() {
		return "Teachar [tid=" + tid + ", tname=" + tname + ", taddress=" + taddress + "]";
	}

}
