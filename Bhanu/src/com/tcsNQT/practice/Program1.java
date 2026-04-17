package com.tcsNQT.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Program1 {

	// Leap Year
	public static boolean isLeap(int y) {
		if (y <= 0) {
			return false;
		} else if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) {
			return true;
		}
		return false;
	}

	// Vowel and Consonent Count
	public static void vowelAndConsonentCount(String str) {
		int vCount = 0;
		int cCount = 0;
		if (str.trim().isEmpty()) {
			return;
		}
		for (char ch : str.replaceAll(" ", "").toCharArray()) {
			if ("aeiou".indexOf(ch) != -1) {
				vCount++;
			} else {
				cCount++;
			}
		}
		System.out.println("The Given String " + str + " has vowels : " + vCount + " and Consonents : " + cCount);
	}

	// reverse a String
	public static String revString(String str) {
		String res = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			res += str.charAt(i);
		}
		return res;
	}

	// Check Anagram
	public static boolean isAnagram(String str1, String str2) {
		char[] s1 = str1.toCharArray();
		char[] s2 = str2.toCharArray();
		Arrays.sort(s1);
		Arrays.sort(s2);
		return Arrays.equals(s1, s2);
	}

	// remove duplicates from a String
	public static String remDup(String str) {
		String res = "";
		for (char ch : str.toCharArray()) {
			if (res.indexOf(ch) == -1) {
				res += ch;
			}
		}
		return res;
	}

	// second max element
	public static int secondMaxElement(int[] arr) {
		int firstMax = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		for (int num : arr) {
			if (num > firstMax) {
				secondMax = firstMax;
				firstMax = num;
			} else if (num > secondMax && num != firstMax) {
				secondMax = num;
			}
		}
		return secondMax;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// is leap year
		// int n = sc.nextInt();
//		System.out.println(isLeap(n));

		// vowel and consonent count
//		vowelAndConsonentCount("bhanu charan");

		// reverse a string
//		System.out.println(revString("bhanu charan"));

		// Check two strings are anagram or not
//		System.out.println(isAnagram("silent", "listen"));

		// remove duplicates from string
//		System.out.println(remDup("abbcccddddeeeee"));

//		int[] arr = { 1, 2, 3, 4, 5, 6, 3, 3, 2, 105, 24, 4, 45, 98, 6, 64, 4, 88, 4, 3333, 2, 65, 22 };
//		System.out.println(secondMaxElement(arr));
		sc.close();

	}

}
