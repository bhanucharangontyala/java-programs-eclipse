package com.logicalstatements;

import java.util.Scanner;

public class ElseIf {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter your age :");
		int age = sc.nextInt();
		if (age < 0) {
			System.out.println("you cant be true");
		}else if(age >= 60) {
			System.out.println("you are senior citizen");
		}else if(age >= 30 & age < 60) {
			System.out.println("you are middle age");
		}else if(age >= 19 & age < 30) {
			System.out.println("you are young age");
		}else if(age >=6 & age <19) {
			System.out.println("you are teen age");
		}else if(age >=0 & age < 6) {
			System.out.println("you are children");
		}else {
			System.out.println("invalid age ");
		}
	}

}
