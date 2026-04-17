package com.tcsNQT.practice;

import java.util.Scanner;

public class JarOfCandies {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int totalCandies = 10;
		int lowLimit = 5;
		System.out.println("Enter the Required Candies : ");
		int n = sc.nextInt();
		if (n < 1 && n > 10) {
			System.out.println("INVALID INPUT");
		} else {
			totalCandies -= n;
			System.out.println("NUMBER OF CANDIES SOLD: " + n);
			System.out.println("NUMBER OF CANDIES AVAILABLE: " + totalCandies);
			if (totalCandies < lowLimit) {
				totalCandies = 10;
				System.out.println("NUMBER OF CANDIES AVAILABLE AFTER REFILL: " + totalCandies);
			}
		}
		sc.close();
	}
}