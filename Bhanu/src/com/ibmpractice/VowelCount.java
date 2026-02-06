package com.ibmpractice;

import java.util.Scanner;

public class VowelCount {
	static int vCount = 0;
	static int cCount = 0;
	static void vCount(String str) {
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vCount++;
			}else {
				cCount++;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();
		vCount(str.toLowerCase());
		System.out.println("Vowel Count : " + vCount);
		System.out.println("Consonent Count : " + cCount);
		sc.close();
	}

}
