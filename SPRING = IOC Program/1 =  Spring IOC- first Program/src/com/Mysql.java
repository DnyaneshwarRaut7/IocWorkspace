package com;

public class Mysql implements DBConnection {
	
	public Mysql() {
		System.out.println("MYsql Consatar...");
	}

	@Override 
	public void connectionOff() {
		
		System.out.println("MYSQL Connection OFF..");
	}

	@Override
	public void connectionOn() {
		
		System.out.println("MYSQL Connection ON..");
	}

}
