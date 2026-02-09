package com.strings;

public class StringLengthWIthoutLen {

	public static void main(String[] args) {
		String str = "Bhanu charan";
		int count = 0;
		for (int c : str.toCharArray()) {
			System.out.println(c);
			count++;
		}
		System.out.println("No of Characters :" + count);
	}

}
