package com.logicpractice;

import java.util.Scanner;
import java.util.regex.Pattern;

public class NumBetween {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		String n = sc.next();
		String nRegex = "[1-9]{1}[0-9]{2}";
		if (Pattern.matches(nRegex, n)) {
			System.out.println("In The Range");
		} else {
			System.out.println("Not In The Range");
		}

		sc.close();
	}

} 
