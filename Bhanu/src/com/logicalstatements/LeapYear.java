package com.logicalstatements;

import java.util.Scanner;

public class LeapYear {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter a year");
		int year = sc.nextInt();
		//1
		if (year % 4 == 0) {
			System.out.println("Leap year");
			if (year % 100 == 0 & year % 400 == 0) {
				System.out.println("its a leap year with 100 and 400");
			}
		} else {
			System.out.println("not a leap year");
		}
//		if(year%400==0 || year%4==0 && year%100!=0) {
//			System.out.println("leap year");
//		}
//		else {
//			System.out.println("not a leap year");
//		}
	}

}
