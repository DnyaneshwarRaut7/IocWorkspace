package com;

public class Oracle implements DBConnection {
	
	public Oracle() {
		System.out.println("Oracle Construction.....");
	}

	@Override
	public void connectionOff() {
		
		System.out.println("ORACLE Connection OFF...");
	}

	@Override
	public void connectionOn() {
		
		System.out.println("ORACLE Connection ON...");
	}

}
