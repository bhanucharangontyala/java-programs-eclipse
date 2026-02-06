package com.logicpractice;

import java.util.Scanner;

public class AmountDispence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Amount You want to dispence");
		int n = sc.nextInt();
		if (n % 2000 == 0 || n % 500 == 0 || n % 100 == 0) {
			System.out.println("Your Amount Can Be Dispense");
		} else {
			System.out.println("Your Amount Can not Dispense");
		}
		sc.close();
	}

}
