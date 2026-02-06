package com.ibmpractice;

import java.util.Scanner;
// WAP to reverse the sentence each word
public class ReverseSentence {

	static String reverse(String s) {
		String ans = "";
		for (int i = 0; i < s.length(); i++) {
			ans = s.charAt(i) + ans;
		}
		return ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();
		String[] res = str.split(" ");
		for (int i = 0; i < res.length; i++) {
			res[i] = reverse(res[i]);
		}
		for (String s : res) {
			System.out.print(s + " ");
		}
		sc.close();
	}

}
