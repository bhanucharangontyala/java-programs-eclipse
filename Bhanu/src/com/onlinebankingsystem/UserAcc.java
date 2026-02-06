package com.onlinebankingsystem;

public class UserAcc {
	//implementing the encapsulation of user data
	private String name;
	private double balance;

	public UserAcc(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}
	public double getBalance() {
		return balance;
	}
	
	//calculating the transaction
	public boolean deBal(double amount) {
		if(amount <= getBalance()) {
			balance -= amount;
			return true;
		}else {
			return false;
		}
	}
}
