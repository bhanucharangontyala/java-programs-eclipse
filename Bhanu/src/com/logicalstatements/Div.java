package com.logicalstatements;

import java.util.Scanner;

public class Div {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("enter any number");
		int n = sc.nextInt();
		if (n % 5 == 0 & n % 11 == 0)
			System.out.println("divisible by 5 and 11");
		else
			System.out.println("not divisible by 5 and 11");
		
		
	}

}
