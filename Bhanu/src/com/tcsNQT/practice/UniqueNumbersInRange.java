package com.tcsNQT.practice;

import java.util.Scanner;

public class UniqueNumbersInRange {

	public static boolean hasUniqueDigits(int num) {
		int[] digits = new int[10]; // to track digits 0–9
		while (num > 0) {
			int d = num % 10;
			if (digits[d] == 1) {
				return false; // digit repeated
			}
			digits[d] = 1;
			num = num / 10;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int count = 0;
		for (int i = n1; i <= n2; i++) {
			if (hasUniqueDigits(i)) {
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}

}
