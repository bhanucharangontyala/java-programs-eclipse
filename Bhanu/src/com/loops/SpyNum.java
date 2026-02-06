package com.loops;

import java.util.Scanner;

public class SpyNum {
	static Scanner sc = new Scanner(System.in);
	// if sum of digits and multiplication of digits are equal then it is said to be spy Number 
	static boolean isSpy(int n) {
		int r = 0;
		int sum = 0;
		int mul = 1;
		while (n != 0) {
			r = n % 10;
			sum += r;
			mul *= r;
			n = n / 10;
		}
		if (mul == sum) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter a Number :");
		int n = sc.nextInt();
		if (isSpy(n)) {
			System.out.println("Spy Number");
		} else {
			System.out.println("Not Spy Number");
		}
	}

}
