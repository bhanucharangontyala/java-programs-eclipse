package com.strings;

public class StrMethods1 {

	public static void main(String[] args) {
		// we have several methods related to string in String class

		String s = "Bhanu";
		String s1 = "bhanu";
		String s2 = "Bhanu Charan gontyala";
		// 1. char charAt(index)
		System.out.println(s.charAt(3));// n
		// 2. int length()
		System.out.println(s.length());// 5
		// 3. boolean equals(String)
		System.out.println(s.equals(s1));// false
		System.out.println(s.equals(s2));// true
		System.out.println(s.equalsIgnoreCase(s1));// true
		System.out.println(s.equalsIgnoreCase(s2));// true
		// 4. int codePointAt(index)
		// it will return the ASCII values of the character at index
		System.out.println(s.codePointAt(2));// it gives value of " a " is 97
		// 5. int codePointBefore(index)
		// gives value of character before the given index
		System.out.println(s.codePointBefore(2));// it gives value of " h " is 104
		// 6. int codePointCount(start,end)
		// returns the count of characters from after start to end
		System.out.println(s.codePointCount(0, 3));// 3
		// 7. int str.compareTo(str1)
		// it will remove the same characters from both strings and subtract the
		// remaining
		// character from str1 from str
		// Bhanu - bhanu = B - b
		// like (B-66) - (b-98) = -32
		System.out.println(s.compareTo(s1));// -32
		System.out.println(s.compareTo(s2));// -16
		// 8. int str.compareToIgnoreCase(str)
		System.out.println(s.compareToIgnoreCase(s1));// 0

	}

}
