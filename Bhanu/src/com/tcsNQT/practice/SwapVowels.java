package com.tcsNQT.practice;

import java.util.Scanner;

public class SwapVowels {

	public static String swapVowels(String str) {
		char[] arr = str.toCharArray();
		int left = 0;
		int right = arr.length - 1;
		while (left < right) {
			while (left < right && !isVowel(arr[left])) {
				left++;
			}
			while (left < right && !isVowel(arr[right])) {
				right--;
			}
			// swap
			char temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
		return new String(arr);
	}

	public static boolean isVowel(char c) {
		c = Character.toLowerCase(c);
		return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = sc.next();
		System.out.println(swapVowels(s));
		sc.close();
	}
}