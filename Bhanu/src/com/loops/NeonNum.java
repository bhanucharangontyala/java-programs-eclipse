package com.loops;

import java.util.Scanner;

public class NeonNum {
	// is a number where sum of the digits of square is equal to the original Number
	static boolean isNeon(int n) {
		int r = 0;
		int sum = 0;
		int pow = n * n;
		while (pow != 0) {
			r = pow % 10;
			sum += r;
			pow /= 10;
		}
		if (sum == n) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		if (isNeon(num)) {
			System.out.println("Neon Number");
		} else {
			System.out.println("Not Neon Number ");
		}
		sc.close();
	}

}
