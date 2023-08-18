package com.constructorebase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Custmer {

	private int cid;

	private String cname;

	@Autowired
	@Qualifier(value = "p")// by name
	private Product product;

	@Autowired
	@Qualifier(value="p1")
	private Product product1;

	public Custmer(int cid, String cname, Product product, Product product1) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.product = product;
		this.product = product1;

	}

	public int getCid() {
		return cid;
	}

	public String getCname() {
		return cname;
	}

	public Product getProduct() {
		return product;

	}

	public Product getProduct1() {
		return product1;
	}

	@Override
	public String toString() {
		return "Custmer [cid=" + cid + ", cname=" + cname + ", product=" + product + ", product1=" + product1 + "]";
	}

}
