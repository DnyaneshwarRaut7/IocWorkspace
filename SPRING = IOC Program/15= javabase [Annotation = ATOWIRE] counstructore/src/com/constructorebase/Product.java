package com.constructorebase;

public class Product {
	
	private int pid;
	
	private String pname;

	public Product(int pid, String pname) {
		super();
		this.pid = pid;
		this.pname = pname;
	}

	public int getPid() {
		return pid;
	}

	public String getPname() {
		return pname;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + "]";
	}
	
	
	
	

}
