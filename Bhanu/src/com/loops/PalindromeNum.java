package com.loops;

import java.util.Scanner;

public class PalindromeNum {

	static boolean isPalin(int n) {
		boolean status = false;
		int r = 0;
		int res = 0;
		int temp = n;
		while (n != 0) {
			r = n % 10;
			n = n / 10;
			res = res * 10 + r;
		}
		if (temp == res) {
			status = true;
		}
		return status;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number :");
		int n = sc.nextInt();
		boolean bool = isPalin(n);
		if (bool) {
			System.out.println("It is the Palindrome");
		} else {
			System.out.println("It is Not a Palindrome");
		}
		sc.close();
	}

}
