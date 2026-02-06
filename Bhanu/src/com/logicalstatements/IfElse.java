package com.logicalstatements;

import java.util.Scanner;

public class IfElse {
//	why Logical Statements?
//	 -these are essential in java for controlling flow of the program
//	  and enable decision making based on the single or multiple conditions
//	what are logical statements?
//	 -these statements are constructed using logical operators to combine and 
//	  evaluate the boolean expression
//	 -the condition must return a boolean expression
//	 -if, else-if, while, do while, for 
//	where we use logical statements?
//	 - decision making
//	 - control flow of program
//	 - enhance code readability and reusability
//	 - short circuit evaluation

//	1. if, if-else
//	syntax-1
//	if(condition) {
//		statement1
//		statementn
//	}
//	
//	syntax- 2
//	if(condition)
//		statement
//		
//	syntax-3
//	if(condition) {
//		statement1
//		statementn
//	}else {
//		statement1
//		statementn
//	}
//	
//	syntax-4
//	if(condition)
//		statement1
//	else
//		statement1
	public static void main(String[] args) {
		System.out.println("enter a number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if (a > 10) 
			System.out.println("greater");

		if (a < 50) {
			System.out.println("less");
		} else {
			System.out.println("greater");
		}

		if (a == 10) 
			System.out.println("equals");	
		else	
			System.out.println("hii");
		sc.close();
	}

}
