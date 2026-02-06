package student;

import java.util.Scanner;

//22-10-2025
public class ZoomCars {
	static Scanner sc = new Scanner(System.in);

	String companyName() {
		return "Zoom Cars";
	}

	int fixedCharge() {
		return 1500;
	}

	int fixedInsurance() {
		return 500;
	}

	int noOfDays() {
		System.out.println("Enter No of days to rent a car");
		int n = sc.nextInt();
		return n;
	}

	void main(String[] args) {
		System.out.println("****Welcome To " + companyName() + "****");
		int days = noOfDays();
		int fAmount = fixedCharge();
		int iAmount = fixedInsurance();
		int totalAmount = (fAmount * days) + iAmount;
		System.out.println("No of days :" + days);
		System.out.println("Fixed Amount Per Day :" + fAmount);
		System.out.println("Insurance Amount :" + iAmount);
		System.out.println("Total Amount  :" + totalAmount);
	}

}
