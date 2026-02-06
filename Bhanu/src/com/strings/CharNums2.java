package com.strings;

public class CharNums2 {

	public static void main(String[] args) {
		String str = "abbcccddddeeeee";
		String res = "";
		int[] arr = new int[127];
		// for adding the frequnecy
		for (int i = 0; i < str.length(); i++) {
			arr[str.charAt(i)] += 1;
		}
		// for printing the res without repeating
		for (int i = 0; i < str.length(); i++) {
			CharSequence ch = (str.charAt(i) + String.valueOf(arr[str.charAt(i)]));
			if (!res.contains(ch)) {
				res = res + ch;
			}
		}
		System.out.println(res);
	}

}
