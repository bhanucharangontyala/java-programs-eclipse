package com.loops;

import java.util.Scanner;

public class NthPrime {

//	static boolean isPrime(int num) {
//		if (num <= 1) {
//			return false;
//		}
//		if (num == 2 || num == 3) {
//			return true;
//		}
//		if (num % 2 == 0 || num % 3 == 0) {
//			return false;
//		}
//		for (int i = 5; i * i <= num; i += 6) {
//			if (num % i == 0 || num % (i + 2) == 0) {
//				return false;
//			}
//		}
//		return true;
//	}

	static boolean isPrime(int n) {
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count <= 2) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Nth Number");
		int n = sc.nextInt();
		if (n < 0) {
			System.out.println("Please Enter Positive Numbers");
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
			System.out.println(n + " Prime Number is :" + nthPrime);
		}
		sc.close();
	}
}
