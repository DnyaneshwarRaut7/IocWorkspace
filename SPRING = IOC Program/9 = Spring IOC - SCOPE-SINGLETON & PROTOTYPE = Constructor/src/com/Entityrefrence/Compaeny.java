package com.Entityrefrence;

public class Compaeny {

	private int cid;

	private String cname;

	private String address;

	public Compaeny(int cid, String cname, String address) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Compaeny [cid=" + cid + ", cname=" + cname + ", address=" + address + "]";
	}

}
