package com.scope;

public class Compaeny {

	private int cid;

	private String cname;

	private String caddress;

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

	public String getCaddress() {
		return caddress;
	}

	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}

	@Override
	public String toString() {
		return "Compaeny [cid=" + cid + ", cname=" + cname + ", caddress=" + caddress + "]";
	}

}
