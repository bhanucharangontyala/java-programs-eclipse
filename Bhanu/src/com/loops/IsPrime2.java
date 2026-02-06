package com.loops;

import java.util.Scanner;

public class IsPrime2 {

	static boolean isPrime(int n) {
		if (n == 1) {
			return false;
		}
		for (int i = 2; i <= n / 2; i++) {

			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	static boolean primeL1(int n) {
		if (n == 1) {
			return false;
		}
		if (n == 2)
			return true;
		if (n % 2 == 0)
			return false;
		for (int i = 3; i < Math.sqrt(n); i += 2) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println("Enter a Number :");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (primeL1(num)) {
			System.out.println("Prime Number");
		} else {
			System.out.println("Not a Prime Number");
		}
		sc.close();

	}

}
