package com.loops;

import java.util.Scanner;

public class IsMagic {
	// if the digit sum is equals to 1 then it is said to be a Magic Number
	static boolean isMagic(int n) {
		int r = 0;
		while (n > 9) {
			int sum = 0;
			while (n != 0) {
				r = n % 10;
				sum += r;
				n = n / 10;
			}
			n = sum;
		}
		return n == 1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number :");
		int n = sc.nextInt();
		if (isMagic(n)) {
			System.out.println("Magic Number");
		} else {
			System.out.println("Not Magic Number");
		}
		sc.close();
	}

}
