package com.tcsNQT.practice;

import java.util.Scanner;

public class UptoNPrimeNum {
	public static boolean isPrime(int n) {
		if (n == 1) {
			return false;
		}
		if (n == 2) {
			return true;
		}
		if (n % 2 == 0) {
			return false;
		}
		for (int i = 3; i < Math.sqrt(n); i += 2) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void uptoNPrime(int n) {
		for (int i = 1; i <= n; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number :");
		int n = Math.abs(sc.nextInt());
		uptoNPrime(n);
		sc.close();
	}
}
