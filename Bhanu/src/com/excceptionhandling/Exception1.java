package com.excceptionhandling;

import java.util.Scanner;

public class Exception1 {

	public static void main(String[] args) {
		System.out.println("main method started");
		// ArithmeticException
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int a = sc.nextInt();
		System.out.println("Enter b Number");
		int b = sc.nextInt();
		try {
			System.out.println("In Try Block");
			System.out.println(a / b);
		} catch (ArithmeticException e) {
			System.err.println("In Catch Block");
			e.printStackTrace();
		} finally {
			sc.close();
		}
		System.out.println("main method ended");
	}

}
