package com.testpractice;

import java.util.Scanner;

public class ABCcompute {
	//checking whether the number n can be expressed as sum of two consecutive
	// squares
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		int res = 0;
		boolean flag = false;
		for (int i = 1; i <= n / 2; i++) {
			res = (i * i) + ((i + 1) * (i + 1));
			if (res == n) {
				flag = true;
				break;
			}
		}
		if (flag) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		sc.close();
	}

}
