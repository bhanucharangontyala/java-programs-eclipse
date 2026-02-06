
package com.strings;

import java.util.Arrays;

public class ClumsyNum {

	public static void main(String[] args) {
		String num = "892727389191";
		char[] arr = num.toCharArray();
		Arrays.sort(arr);
		for (char c : arr) {
			System.out.print(c + " ");
		}
		
		
	}

}
