package com.loops;

import java.util.Scanner;

//perfect number means a number is equal to sum of the factors of the num excluding itself
public class PerfectNum {
	static Scanner sc = new Scanner(System.in);

	static boolean findPerfect(int n) {
		boolean status = false;
		int sum = 0;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				sum += i;
			}
		}
		if (n == sum) {
			status = true;
		}
		return status;
	}

	public static void main(String[] args) {
		System.out.println("enter a number");
		int num = sc.nextInt();
		boolean ans = findPerfect(num);
		if (ans) {
			System.out.println("Your Number is Perfect Number");
		} else {
			System.out.println("Your Number is Not Perfect Number");
		}
	}

}
