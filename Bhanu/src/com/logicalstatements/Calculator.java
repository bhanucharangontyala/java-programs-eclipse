package com.logicalstatements;

import java.util.Scanner;

public class Calculator {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int res = 0;
		System.out.println("enter A value");
		int a = sc.nextInt();
		System.out.println("enter B value");
		int b = sc.nextInt();
		System.out.println("calculator press\n1.add (+)\n2.sub (-)\n3.mul (*)\n4.div (/)\n5.mod (%)");
		int input = sc.nextInt();
		switch (input) {
		case 1 -> res = a + b;
		case 2 -> res = a - b;
		case 3 -> res = a * b;
		case 4 -> res = a / b;
		case 5 -> res = a % b;
		default -> System.out.println("enter valid input");
		}
		System.out.println("the result is : " + res);
	}

}
