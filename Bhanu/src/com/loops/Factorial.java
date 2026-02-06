package com.loops;

import java.util.Scanner;
//int can only return factorial upto 33
//long can only return factorial upto 65
//We cannot use BigInteger for factorial
public class Factorial {
	static Scanner sc = new Scanner(System.in);

//	long findFactorial(int n) {
//		long fact = 1;
//		for (int i = 1; i <= n; i++) {
//			fact *= i;
//		}
//		return fact;
//	}
	//or
	long findFactorial(int n) {
		long fact = 1;
		for (int i = n; i >= 1; i--) {
			fact *= i;
		}
		return fact;
	}
	

	void main(String[] args) {
		System.out.println("enter a number");
		int num = sc.nextInt();
		System.out.println("Factorial is :" + findFactorial(num));
	}

}
