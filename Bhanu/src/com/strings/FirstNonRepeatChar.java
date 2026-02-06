package com.strings;

import java.util.Scanner;

public class FirstNonRepeatChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();
		int[] arr = new int[127];

		for (int i = 0; i < str.length(); i++) {
			arr[str.charAt(i)] = arr[str.charAt(i)] + 1;
		}

		for (int i = 0; i < str.length(); i++) {
			if (arr[str.charAt(i)] == 1) {
				System.out.println(str.charAt(i));
				break;
			}
		}
		sc.close();
	}

}
