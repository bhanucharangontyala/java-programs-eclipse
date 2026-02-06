package student;

import java.util.Scanner;

public class MethodTask {
	static Scanner sc = new Scanner(System.in);
	static String BRANCHNAME = "Banswada";
	static String IFSC = "SBIN00001";

	int accountNo() {
		System.out.println("Enter Account No :");
		int accNo = sc.nextInt();
		return accNo;
	}

	String acHolderName() {
		System.out.println("Enter Your Name :");
		sc.nextLine();
		String acHolName = sc.nextLine();
		return acHolName;
	}

	int deposit() {
		System.out.println("Enter Deposit Amount :");

		int depAmount = sc.nextInt();
		return depAmount;
	}

	int fixedDeposit() {
		return 10000;
	}

	void main(String[] args) {
		System.out.println("****Welcome to SBI****");
		int acNo = accountNo();
		String acName = acHolderName();
		int dAMount = deposit();
		int fAmount = fixedDeposit();
		int tAmount = dAMount + fAmount;
		System.out.println("Account no " + acNo);
		System.out.println("Name of the Ac Holder :" + acName);
		System.out.println("Account Balance :" + fAmount);
		System.out.println("Deposited Amount :" + dAMount);
		System.out.println("Total Ac Balance  :" + tAmount);

	}

}
