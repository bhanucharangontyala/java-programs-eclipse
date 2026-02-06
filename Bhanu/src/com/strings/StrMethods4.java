package com.strings;

public class StrMethods4 {

	public static void main(String[] args) {
		// 19. int String.hashCode()
		// it will return the integer value of the address of the object
		String s = new String("Charan");
		System.out.println(s.hashCode());// 2017201699

		// 20. int indexOf(char)
		// it will return the index of the char in String
		String s1 = "My Name is Bhanu Charan";
		System.out.println(s1.indexOf('a'));// 4
		// 21. int indexOf(String)
		// it will return the Starting index of the string in String
		System.out.println(s1.indexOf("an"));// 13
		// 22. int indexOf(char, int fromIndex)
		// it will return the index of the char in String after the given index
		System.out.println(s1.indexOf('a', 5));

		// 23. int indexOf(String, int fromIndex)
		// it will return the starting index of the String in String after the given
		// index
		System.out.println(s1.indexOf("an", 14));

	}

}
