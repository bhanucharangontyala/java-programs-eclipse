package com.ibmpractice;

public class FrequencySort {

	public static void main(String[] args) {
		String str = "Bhanu Charan Gontyala";
//		str = str.toLowerCase();
		char[] ch = str.toCharArray();
		int[] freq = new int[127];
		// for counting frequency
		for (char c : ch) {
			if (c != ' ') {
				freq[c]++;
			}
		}
		// swapping the char array with descending order of their frequency
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] != ' ' && ch[j] != ' ' && freq[ch[i]] < freq[ch[j]]) {
					char temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}
		// for printing result
		for (char c : ch) {
			if (c != ' ') {
				System.out.print(c + " ");
			}
		}

	}

}
