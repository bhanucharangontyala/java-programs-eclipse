package com.strings;

public class TwoChars {

	public static void main(String[] args) {
		String str = "Bhanu Charan";
		String res1 = "";
		String res2 = "";
//		for (int i = 0; i < str.length(); i += 2) {
//			String pair;
//			// for making two consecutive characters into subString
//			if (i + 2 <= str.length()) {
//                pair = str.substring(i, i + 2);
//            } else {
//                pair = str.substring(i);
//            }
//			// for shifting between two result strings
//            if ((i / 2) % 2 == 0) {
//                res1 += pair;
//            } else {
//                res2 += pair;
//            }
//		}

		// method 2
//		for (int i = 0; i < str.length();) {
//			for (int j = 0; j < 2 && i < str.length(); j++, i++) {
//				res1 += str.charAt(i);
//			}
//			for (int j = 0; j < 2 && i < str.length(); j++, i++) {
//				res2 += str.charAt(i);
//			}
//		}

		// method 3
		int i = 0;
		while (i < str.length()) {
			do {
				if(i==str.length()) {
					break;
				}
				res1 += str.charAt(i);
				i++;
			}while(i%2!=0);
			do {
				if(i==str.length()) {
					break;
				}
				res2 += str.charAt(i);
				i++;
			}while(i%2!=0);
		}

			System.out.println(res1);
		System.out.println(res2);

	}

}
