package com.logicalstatements;

import java.util.Scanner;

public class BankMenuSystem {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		double balance = 5000;
		String con;
		do {
			System.out.println("-----Bank Menu-----\n1.Check Balance\n2.Deposit Money\n3.Withdraw Money\n4.Exit");
			System.out.println("Enter a Choice");
			int ch = sc.nextInt();
			switch (ch) {
			case 1 -> {
				System.out.println("Balance is :" + balance);
			}
			case 2 -> {
				System.out.println("Enter Your Deposit Amount");
				double dep = sc.nextDouble();
				if (dep < 0) {
					System.out.println("Enter correct amount");
				} else {
					balance += dep;
					System.out.println(dep + "Amount is Deposited ");
					System.out.println("Total Balance" + balance);
				}
			}
			case 3 -> {
				System.out.println("Enter Your Withdraw Amount");
				double with = sc.nextDouble();
				if (with > balance) {
					System.out.println("Insufficient Balance");
				} else {
					balance -= with;
					System.out.println(with + "Amount is Withdrawed");
					System.out.println("Remaining Balance" + balance);
				}
			}
			case 4 -> {
				System.out.println("Thank You");
			}
			default -> System.out.println("Invalid Choice");
			}
			System.out.println("do you want to continue enter Y or N");
			con = sc.next();
		} while (con.equalsIgnoreCase("Y"));

	}

}
