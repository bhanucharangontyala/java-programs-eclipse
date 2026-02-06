package com.onlinebankingsystem;

public class UpiPayments extends Payments {
	
	public UpiPayments(UserAcc user, double amount) {
		super(user, amount);
	}
	//method overriding for abstract method
	@Override
	public double pay() {
		System.out.println("Paying via Upi ... " + amount);
		if (user.deBal(amount)) {
			System.out.println("UPI Payment Successful");
		} else {
			System.out.println("UPI Payment Failed - Insufficient Balance");
		}
		return user.getBalance();
	}
}
