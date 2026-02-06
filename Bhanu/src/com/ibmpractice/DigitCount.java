package com.ibmpractice;

import java.util.Scanner;

public class DigitCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any Number : ");
		int n = sc.nextInt();
		int dCount = 0;
		while (n != 0) {
			n /= 10;
			dCount++;
		}
		System.out.println("No of Digits : " + dCount);
		sc.close();
	}

}
