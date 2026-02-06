package com.strings;

public class StrMethods5 {
	public static void main(String[] args) {
		// 24. String intern()
		// this method will move the string object from the heap area to SCP
		// but reverse is not possible
		String s = "Bhanu";
		String s1 = "Bhanu";
		String s2 = new String("Bhanu");
		String s3 = new String("Bhanu");
//		s = s.intern();
		System.out.println(s == s1);// true
		System.out.println(s2 == s3);// false
		System.out.println(s1 == s2);// false
		s2 = s2.intern();
		System.out.println(s1 == s2);// true
		System.out.println();
		// 25. boolean isEmpty()
		// it checks the length of the string whether it is zero or not and returns
		// boolean
//		String s4 = null;
		String s5 = "";
		String s6 = " ";
//		System.out.println(s4.isEmpty());//it will give NullPointerException
		System.out.println(s5.isEmpty());// true
		System.out.println(s6.isEmpty());// false
		System.out.println();
		// 26. boolean isBlank()
//		Returns true if the string is empty or contains only white space 
		// code points, otherwise false.
		System.out.println(s5.isBlank());// true
		System.out.println(s6.isBlank());// true
	}
}
