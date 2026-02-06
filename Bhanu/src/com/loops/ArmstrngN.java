package com.loops;

import java.util.Scanner;

public class ArmstrngN {

	static int digitcnt(int n) {
		int count = 0;
		if (n == 0) {
			return 1;
		} else {
			int temp = n;
			while (temp != 0) {
				temp /= 10;
				count++;
			}
		}
		return count;
	}

	static int pow(int x, int dcnt) {
		int p = 1;
		for (int i = 1; i <= dcnt; i++) {
			p *= x;
		}
		return p;
	}

	static boolean isArmstrng(int n) {
		boolean status = false;
		int r = 0;
		int res = 0;
		int temp = n;
		int dig = digitcnt(n);

		while (n != 0) {
			r = n % 10;
			n = n / 10;
			res += pow(r, dig);
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
