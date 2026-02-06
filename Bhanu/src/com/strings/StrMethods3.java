package com.strings;

public class StrMethods3 {

	public static void main(String[] args) {
		String[] str = { "Bhanu", "Anu", "Charan", "Varun", "Ramya", "Sravya" };
		// 15. boolean endsWith(String suffix)
		// returns boolean when the suffix is found in the string
		// 16. boolean startsWith(String prefix)
		// returns boolean value when the prefix starts with a string
		for (String s : str) {
			if (s.toLowerCase().endsWith("u") && s.toLowerCase().startsWith("b"))
				System.out.println(s);
		}
		for (String s : str) {
			if (s.toLowerCase().endsWith("u") || s.toLowerCase().endsWith("n") || s.toLowerCase().startsWith("r"))
				System.out.println(s);
		}
		
		// 36. boolean startsWith(String, int index)
		// it checks whether the string is starts from that index or not
		String s3 = "Welcome to HYD Meet at lulu Mall to get a Ipad";
		System.out.println(s3.startsWith("to", 33));
		
		// 17. boolean str.equals(String)
		// it checks the two strings value with precise it checks upper/lower case of
		// the string also, it is case sensitive
		String s = "Bhanu";
		String s1 = "bhanu";
		System.out.println(s.equals(s1));// false
		// 18. boolean str.equalsIgnoreCase(String)
		// it just checks the value not the case of the characters
		// it is not case sensitive
		System.out.println(s.equalsIgnoreCase(s1));// true

	}

}
