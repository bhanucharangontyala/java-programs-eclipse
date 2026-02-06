package com.loops;

import java.util.Scanner;

public class Armstrong {

	static boolean isArmstrng(int n) {
		boolean status = false;
		int r = 0;
		int res = 0;
		int temp = n;
		while (n != 0) {
			r = n % 10;
			n = n / 10;
			res += r * r * r;//for four digit we have do cube
		}
		if (res == temp)
			status = true;
		return status;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number :");
		int n = sc.nextInt();
		if (isArmstrng(n))
			System.out.println("Number is Armstrong");
		else
			System.out.println("Number is not Armstrong");
		sc.close();

	}

}
