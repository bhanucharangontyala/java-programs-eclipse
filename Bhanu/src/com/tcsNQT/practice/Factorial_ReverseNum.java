package com.tcsNQT.practice;

import java.util.Scanner;

public class Factorial_ReverseNum {

	// factorial
	public static void factorial(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact *= i;
		}
		System.out.println("Factorial of " + n + " is : " + fact);
	}

	// Reverse of Number
	public static void revNum(int n) {
		int val = n;
		int temp = 0;
		int rem = 0;
		while (val != 0) {
			rem = val % 10;
			val = val / 10;
			temp = temp * 10 + rem;
		}
		System.out.println("the Reverse of Number " + n + " is " + temp);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = Math.abs(sc.nextInt());
		factorial(n);
		revNum(n);
		sc.close();
	}

}
