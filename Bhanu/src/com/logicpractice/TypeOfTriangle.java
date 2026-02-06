package com.logicpractice;

import java.util.Scanner;

public class TypeOfTriangle {

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
		if (a != b && b != c) {
			System.out.println("Scalene Triangle");
		} else if (a == b && b == c) {
			System.out.println("Equilateral Triangle");
		}else {
			System.out.println("Isosceles Triangle");
		}
		sc.close();
	}

}
