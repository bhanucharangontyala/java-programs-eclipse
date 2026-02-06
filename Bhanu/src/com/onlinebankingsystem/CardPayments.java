package com.onlinebankingsystem;

public class CardPayments extends Payments {
	public CardPayments(UserAcc user, double amount) {
		super(user, amount);
	}
	//method overriding for abstract method
	@Override
	public double pay() {
		System.out.println("Paying via Card ... "+ amount);
		if (user.deBal(amount)) {
			System.out.println("Card Payment Successful");
		} else {
			System.out.println("Card Payment Failed - Insufficient Balance");
		}
		return user.getBalance();
	}
}