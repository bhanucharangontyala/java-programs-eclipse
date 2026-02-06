package com.ibmpractice;

import java.util.Scanner;

public class FirstNonRepeatChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();
		int[] arr = new int[127];
		boolean flag = false;
		for (int i = 0; i < str.length(); i++) {
			arr[str.charAt(i)] += 1;
		}
		for (int i = 0; i < str.length(); i++) {
			if (arr[str.charAt(i)] == 1) {
				System.out.println(str.charAt(i));
				flag = true;
				break;
			}
		}
		if (!flag) {
			System.out.println(-1);
		}
		sc.close();
	}

}
