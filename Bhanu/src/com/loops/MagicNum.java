package com.loops;

import java.util.Scanner;

public class MagicNum {
	static Scanner sc = new Scanner(System.in);

	static int isMagic(int n) {
		int r = 0;
		int sum = 0;
		while (n != 0) {
			r = n % 10;
			sum += r;
			n = n / 10;
		}
		if (sum > 9) {
			return isMagic(sum);
		} else {
			return sum;
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter a Number :");
		int n = sc.nextInt();
		int res = isMagic(n);
			if (res == 1) {
				System.out.println("Magic Number");
			} else {
				System.out.println("Not Magic Number");
			}
	}

}
