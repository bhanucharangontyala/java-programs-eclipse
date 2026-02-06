package com.logicalstatements;

import java.util.Scanner;

public class DrivingLicensce {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("welcome to Driving licensce Portal");
		System.out.println("Enter your Age");
		int age = sc.nextInt();
		System.out.println("Enter your Nationality");
		String nation = sc.next();
		if(age >= 18 & nation.equalsIgnoreCase("india")) {
			System.out.println("Congratulations..");
			System.out.println("Licensce Approved");
		}else if(age >= 18 & nation != "india") {
			System.out.println("you have to apply only if your are a citizen of india");
		}else {
			System.out.println("not approved you have to wait until you get 18");
		}
		
	}

}
