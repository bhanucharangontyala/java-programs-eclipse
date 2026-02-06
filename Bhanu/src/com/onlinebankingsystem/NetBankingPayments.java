package com.onlinebankingsystem;

public class NetBankingPayments extends Payments {

	public NetBankingPayments(UserAcc user, double amount) {
		super(user, amount);
	}
	//method overriding for abstract method
	@Override
	public double pay() {
		System.out.println("Paying via Net Banking ... " + amount);
		if (user.deBal(amount)) {
			System.out.println("Net Banking Payment Successful");
		} else {
			System.out.println("Net Banking Payment Failed - Insufficient Balance");
		}
		return user.getBalance();
	}
}