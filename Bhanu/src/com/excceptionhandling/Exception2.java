package com.excceptionhandling;

public class Exception2 {

	public static void main(String[] args) {
		// NullPointerException
		// StringIndexOutOfBounds
		String s = "Charan";
//		String s1 = null;
		String s2 = "null";

		System.out.println(s.length());
		// when we try to access the string with null we get
		// NullPointerException
		try {
			System.out.println("In try block");
//			if exception occurs here then next statements will never execute
			// we have to write the dependency logic in multiple catch blocks
			// each line must depend on the previous
//			System.out.println(s1.length());
			System.out.println(s2.charAt(s.length()));
		} catch (NullPointerException e) {
			System.err.println("In Catch Block1");
			e.printStackTrace();
		} catch (StringIndexOutOfBoundsException e) {
			System.err.println("In Catch Block2");
			e.printStackTrace();
		}
		System.out.println(s2.length());

	}

}
