package com.ibmpractice;

public class LongestWordinSent {

	public static void main(String[] args) {
		String s = "My name is Bhanu Charan Gontyala bhanuaer";
		String[] str = s.split(" ");
		String longestW = str[0];
		for (String str1 : str) {
			if (str1.length() > longestW.length()) {
				longestW = str1;
			}
		}
		System.out.println(longestW);
	}

}
