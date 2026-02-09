package com.strings;

public class StringsEqual {

	public static void main(String[] args) {
		String str = "Bhanu";
		String s2 = new String("Bhanu");
		s2 = s2.intern();
		if (str == s2) {
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}
	}

}
