package com.tcsNQT.practice;

import java.util.Scanner;

public class NthPrime {

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

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = Math.abs(sc.nextInt());
		if (n < 0) {
			System.out.println("Please Enter Correct Input");
		} else {
			int count = 0;
			int num = 1;
			int nthPrime = 0;
			while (count < n) {
				num++;
				if (isPrime(num)) {
					count++;
					nthPrime = num;
				}
			}
			System.out.println(n + "Th Prime Number is : " + nthPrime);
		}
		sc.close();
	}
}
