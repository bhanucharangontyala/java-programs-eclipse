package casestudy;

import java.util.Scanner;

public class BankMenuSystem {
	static Scanner sc = new Scanner(System.in);
	static String ch;
	static int balance = 5000;

	static void checkBal() {
		System.out.println("The Balance is : " + balance);
	}

	static void deposit() {
		System.out.println("Enter the deposit amount");
		int dep = sc.nextInt();
		balance += dep;
		checkBal();
	}

	static void withdraw() {
		System.out.println("Enter the Withdraw Amount");
		int with = sc.nextInt();
		if (with < balance) {
			balance -= with;
			System.out.println("the amount " + with + " is withdrawn");
			System.out.println("The remaining amount is :" + balance);
		} else {
			System.out.println("Insufficient fund");
		}
	}

	static void exit() {
		System.out.println("Thank You");
	}

	public static void main(String[] args) {

		do {
			System.out.println("Welcome To SBI\n Choose a Service \n1.Check Balance\n2.Deposit\n3.Withdraw\n4.exit");
			int choice = sc.nextInt();
			switch (choice) {
			case 1 -> checkBal();
			case 2 -> deposit();
			case 3 -> withdraw();
			case 4 -> exit();
			default -> System.out.println("Please enter the valid choice");
			}
			System.out.println("If you want continue enter Y or N");
			ch = sc.next();
		} while (ch.equalsIgnoreCase("Y"));
	}

}
