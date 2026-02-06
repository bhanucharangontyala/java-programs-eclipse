package com.loops;

import java.util.Scanner;

public class PrimeFact {

	static void findFactors(int n) {
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println(n);
	}

	static void primeFact(int n) {
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count <= 2) {
			System.out.println(n + " is Prime");
		} else {
			System.out.println(n + " is Composite");
		}
		findFactors(n);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number :");
		int num = sc.nextInt();
		primeFact(num);
		sc.close();
	}

}
