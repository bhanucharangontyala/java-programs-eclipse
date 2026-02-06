package com.loops;

import java.util.Scanner;

public class Fac60Even {

	static void evenFact(int n) {
		if (n % 2 != 0) {
			System.out.println("Not even ");
		} else {
			for (int i = 1; i <= n; i++) {
				if (n % i == 0) {
					if (i % 2 == 0) {
						System.out.println(i);
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number :");
		int num = sc.nextInt();
		evenFact(num);
		sc.close();
	}

}
