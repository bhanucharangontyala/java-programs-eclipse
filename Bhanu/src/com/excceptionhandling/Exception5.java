package com.excceptionhandling;

public class Exception5 {

	public static void main(String[] args) {
		System.out.println("main method started");
		// NumberFormatException
		// it will occur when we try to covert the string into integer
		// which contains the aplhabets or special symbols
		String s1 = "Bhanu";
		String s2 = "12345";
		try {
			int i = Integer.parseInt(s2);
			System.out.println(i);// valid
			int i2 = Integer.parseInt(s1);
			System.out.println(i2);// exception
		} catch (NumberFormatException e) {
			System.err.println("In catch");
			System.out.println(e.getMessage());
		}
		System.out.println("main method ended");
	}

}
