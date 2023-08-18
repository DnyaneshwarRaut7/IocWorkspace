package com.Setterbase.ByType;

public class Cource {
	
	private Integer cid;
	
	private String cname;

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	@Override
	public String toString() {
		return "Cource [cid=" + cid + ", cname=" + cname + "]";
	}
	
	

}
