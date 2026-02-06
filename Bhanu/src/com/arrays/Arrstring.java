package com.arrays;

public class Arrstring {

	public static void main(String[] args) {
		String[] str = { "Tommy", "John", "Tommy", "Harry", "John" };
		int[] num = new int[str.length];

		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {
				if (str[i].equalsIgnoreCase(str[j])) {
					System.out.println("duplicate:" + str[i]);
					num[i]++;
					num[j]++;
				}
			}
		}
		

		for (int i = 0; i < str.length; i++) {
			if (num[i] == 0) {
				System.out.println("Not duplicate:" + str[i]);
				
			}
		}


//		for (int i = 0; i < str.length; i++) {
//			for (int j = i + 1; j < str.length; j++) {
//				if (str[i].equalsIgnoreCase(str[j])) {
//					System.out.println("duplicate :" + str[i]);
//					str[i] = "A";
//					str[j] = "A";
//				}
//			}
//		}
//		for (String s : str) {
//			if (!s.equalsIgnoreCase("A")) {
//				System.out.println("Not duplicate:" + s);
//			}
//		}
	}

}
