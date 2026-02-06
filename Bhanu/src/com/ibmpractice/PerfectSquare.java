package com.ibmpractice;

import java.util.Scanner;

public class PerfectSquare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		int odd = 1;
		if (n == 1 || n == 0) {
			System.out.println("Perfect Square");
		} else {
			while (true) {
				if (n < 0) {
					System.out.println("Not a perfect Square");
					break;
				} else if (n == 0) {
					System.out.println("Perfect square");
					break;
				}
				n -= odd;
				odd += 2;
			}
		}
		sc.close();
	}

}
