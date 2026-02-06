package com.loops;

import java.util.Scanner;

public class Factors {
	static Scanner sc = new Scanner(System.in);

	void findFactors(int n) {
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println(n);
	}

	void main(String[] args) {
		System.out.println("enter a number");
		int num = sc.nextInt();
		findFactors(num);
	}

}
