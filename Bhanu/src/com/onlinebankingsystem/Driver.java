package com.onlinebankingsystem;

public class Driver {
	// implementing the polymorphism
	public static void main(String[] args) {
		//creating the object of the user class
		UserAcc User1 = new UserAcc("Charan", 100000);
		// creating the reference of the parent class that is used for the remaining objects
		// one reference many froms 
		Payments payment;
		// we use payment to follow polymorphism one reference many forms
		payment = new UpiPayments(User1, 13000);
		System.out.println("The Remaining Balance" + payment.pay());

		payment = new CardPayments(User1, 10000);
		System.out.println("The Remaining Balance" + payment.pay());

		payment = new NetBankingPayments(User1, 44000);
		System.out.println("The Remaining Balance" + payment.pay());

	}
}
