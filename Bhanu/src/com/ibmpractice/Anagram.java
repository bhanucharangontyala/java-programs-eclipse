package com.ibmpractice;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
//		int[] arr = new int[26];
		String str1 = "silent";
		String str2 = "listen";
//		boolean flag = true;
//		if (str1.length() != str2.length()) {
//			System.out.println("Not Anagram");
//		} else {
//			for (int i = 0; i < str1.length(); i++) {
//				arr[str1.charAt(i) - 'a'] += 1;
//				arr[str2.charAt(i) - 'a'] -= 1;
//			}
//		}
//		for (int ar : arr) {
//			if (ar != 0) {
//				flag = false;
//			}
//		}
//		if (flag) {
//			System.out.println("Anagram");
//		} else {
//			System.out.println("Not Anagram");
//		}
		
		
		//or
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);

		if(Arrays.equals(arr1, arr2)) {
			System.out.println("Anagram");
		}else {
			System.out.println("Not a Anagram");
		}
	}

}
