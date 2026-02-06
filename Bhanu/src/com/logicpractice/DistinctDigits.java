package com.logicpractice;

import java.util.Scanner;

public class DistinctDigits {

	static void distinctDigits(int n) {
		int a = n / 100;// first digit;
		int b = (n / 10) % 10;// middle digit
		int c = n % 10;// last digit

		if (a != b && a != c && b != c) {
			System.out.println("Number has Distinct Digits");
		} else {
			System.out.println("Number has no Distinct Digits");
		}
		// finding greatest and smallest
		if (a > b && a > c) {
			System.out.println("Greater :" + a);
		} else if (b > a && b > c) {
			System.out.println("Greater :" + b);
		} else {
			System.out.println("Greater :" + c);
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Three Digit Number");
		int n = sc.nextInt();
		distinctDigits(n);
		sc.close();
	}

}
