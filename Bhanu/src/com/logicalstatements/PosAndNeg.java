package com.logicalstatements;

import java.util.Scanner;

public class PosAndNeg {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter Any Number");
		int n = sc.nextInt();
		if(n < 0) 
			System.out.println("negative");
		else
			System.out.println("positve");
	}

}
