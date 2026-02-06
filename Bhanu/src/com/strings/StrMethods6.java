package com.strings;

public class StrMethods6 {
	public static void main(String[] args) {
		// 27. int lastIndexOf(char ch)
		// it will return the index of the last occurrence of the character
		// it will check from end of the string
		String s = "Bhanu CharAn";
		System.out.println(s.toLowerCase().lastIndexOf('a'));

		// 28. int lastIndexOf(char ch, int fromIndex)
		// it will return the index of the last occurrence of the character from
		// string index
		// it will check from end of the string
		System.out.println(s.toLowerCase().lastIndexOf('a', 7));

		// 29. int lastIndexOf(String str)
		// it will return the index of the last occurrence of the String
		// it will check from end of the string
		String s1 = "Welcome to HYD Meet at lulu Mall To get a Ipad";
		System.out.println(s1.toLowerCase().lastIndexOf("to"));

		// 30. int lastIndexOf(String str, int fromIndex)
		// it will return the index of the last occurrence of the string starting
		// from string index
		// it will check from end of the string
		System.out.println(s1.toLowerCase().lastIndexOf("to", 40));

		// 31. String replace(char ch1, char ch2)
		// it will replace the ch1 from the string where ever ch1 present with ch2
		String s2 = "bhanu charan";
		s2 = s2.replace('a', 'A');
		System.out.println(s2);// bhAnu chArAn

		// 32. String replace(String1, String)
		// it will replace the String1 from the string where ever
		// String1 present with String
		String s3 = "Welcome to HYD Meet at lulu Mall To get a Ipad";
		s3 = s3.replace("HYD", "Hyderabad");
		System.out.println(s3);

		// 33. String replaceAll(String regex, string replacement)
		// Replaces each substring of this string that matches the given
		// regular expression with the given replacement.
		String s4 = "1234Bhanu12345 78899Charan456789";
		s4 = s4.replaceAll("\\d", "");
		System.out.println(s4);// Bhanu Charan

		// 34. String replaceFirst(String regex, String replacement)
		// Replaces first substring of this string that matches the given
		// regular expression with the given replacement.
		String s5 = "1234Bhanu12345 78899Charan456789";
		s5 = s5.replaceFirst("\\d", "*");
		System.out.println(s5);// *234Bhanu12345 78899Charan456789

		// 35. String trim()
		// remove the spaces from starting and ending only
		String s6 = "                Gontyala   Bhanu   Charan            ";
		System.out.println(s6.trim());// Gontyala Bhanu Charan

		// 36. String[] split(char)
		// it will divide the string according to the char and store it in
		// a array of Strings
		String s7 = "srh-is-the-og-team";
		String[] res = s7.split("-");
		for (String r : res) {
			System.out.println(r);
		}

		// 37. String[] split(char,int limit)
		// it will divide the string according to the char and store it in
		// a array of Strings in limit times
		String s8 = "srh-is-the-og-team";
		String[] res1 = s8.split("-", 3);
		for (String r : res1) {
			System.out.println(r);
		}
	}
}
