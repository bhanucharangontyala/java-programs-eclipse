package com.strings;

public class StrMethods2 {

	public static void main(String[] args) {
		String s = "Bhanu Charan";
		String s1 = "Charan";
		// 9. String str.concat(str)
		// concat only adds two strings
		System.out.println(s.concat(s1));
		// whereas " + " we can use only string another one in any data type
		System.out.println(s + 200);

		// 10. boolean contains(string)
		// it checks whether the given string is present in another string
		System.out.println(s1.contains("ran"));// true
		// 11. String str.toLowercase()
		System.out.println(s.toLowerCase().contains("char"));// true
		System.out.println(s.toLowerCase().contains("Char"));// false

		// 12. String str.toUpperCase()
		System.out.println(s.toUpperCase());

		char[] ch = { 'A', 'P', 'P', 'L', 'E', 'S' };
		// 13. static String copyValueOf(char[] data)
		// it will group all the elements of the char array and convert it into string
		String s2 = String.copyValueOf(ch);
		System.out.println(ch);
		System.out.println(s2);
		// 14. static String.copyValueOf(char[] data, int offset, int count)
		String s3 = String.copyValueOf(ch, 1, 4);
		System.out.println(s3);
	}

}
