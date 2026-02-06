package com.onlinebankingsystem;

abstract public class Payments {
	//implementing the abstraction using abstract class and method
	protected UserAcc user;
	protected double amount;
	
	public Payments(UserAcc user, double amount) {
		this.user = user;
		this.amount = amount;
	}
	
	public abstract double pay();
}


