package com.ibmpractice;

public class Anagram {

	public static void main(String[] args) {
		int[] arr = new int[26];
		String str1 = "silent";
		String str2 = "listan";
		boolean flag = true;
		if (str1.length() != str2.length()) {
			System.out.println("Not Anagram");
		} else {
			for (int i = 0; i < str1.length(); i++) {
				arr[str1.charAt(i) - 'a'] += 1;
				arr[str2.charAt(i) - 'a'] -= 1;
			}
		}
		for (int ar : arr) {
			if (ar != 0) {
				flag = false;
			}
		}
		if (flag) {
			System.out.println("Anagram");
		} else {
			System.out.println("Not Anagram");
		}
	}

}
