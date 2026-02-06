package com.logicpractice;

import java.util.Scanner;

public class ValidTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Three Sides Of the Triangle");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if ((a + b > c) && (b + c > a) && (c + a > b)) {
			System.out.println("Forms a Valid Triangle");
		} else {
			System.out.println("Not Froms a Valid Triangle");
		}
		sc.close();
	}

}
