package com.logicalstatements;

import java.util.Scanner;

public class EvenOrOdd {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("enter any number");
		int num = sc.nextInt();
		if (num % 2 == 0)
			System.out.println("even");
		else
			System.out.println("odd");
	}

}
