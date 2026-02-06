package com.loops;

import java.util.Scanner;

public class FactRecur {
	static Scanner sc = new Scanner(System.in);

	// factorial using recurrsion
//	int factorial(int n) {
//		if (n == 0 || n == 1) { // base case
//			return 1;
//		}
//		int fact_nm1 = factorial(n - 1); // recurrsion
//		int fact_n = n * fact_nm1;
//		return fact_n;
//	}
	
	int factorial(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		return n * factorial(n-1);
	}
	//steps n=5 1. 5*factorial(4)-->5*24=120
//	2. 4*factorial(3)-->4*6=24
//	3. 3*factorial(2)--> 2*3=6
//	4. 2*factorial(1) --> 1

	void main(String[] args) {
		System.out.println("enter a number");
		int num = sc.nextInt();
		System.out.println(factorial(num));
	}

}
