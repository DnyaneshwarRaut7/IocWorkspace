package com.Entityrefrence;

public class Compaeny {

	private int cid;

	private String cname;

	private String address;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Compaeny [cid=" + cid + ", cname=" + cname + ", address=" + address + "]";
	}

}
