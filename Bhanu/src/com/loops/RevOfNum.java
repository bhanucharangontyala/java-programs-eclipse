package com.loops;

import java.util.Scanner;

public class RevOfNum {

	static int rev(int n) {
		int rev = 0;
		int r = 0;
		while (n != 0) {
			r = n % 10;
			n = n / 10;
			rev = rev * 10 + r;
		}
		return rev;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number :");
		int n = sc.nextInt();
		System.out.println("The Sum of the Number is : " + rev(n));
		sc.close();
	}

}
