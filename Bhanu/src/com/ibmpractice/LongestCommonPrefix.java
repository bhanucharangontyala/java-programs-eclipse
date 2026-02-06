package com.ibmpractice;

public class LongestCommonPrefix {

	public static String longestCommonPrefix(String[] strs) {
		// Checks whether the string valid to find common Prefix
		if (strs == null || strs.length == 0)
			return "";
		String first = strs[0];
		// outer loop for starting element that we take as reference to compare
		// other strings in array
		for (int i = 0; i < first.length(); i++) {
			char ch = first.charAt(i);
			// inner loop starts from second element of the array and compare with
			// the first element
			for (int j = 1; j < strs.length; j++) {
				// If index exceeds string length OR mismatch if any condition
				// satisfy it returns the subString that matches up to the first
				if (i >= strs[j].length() || strs[j].charAt(i) != ch) {
					return first.substring(0, i);
				}
			}
		}
		return first;
	}

	public static void main(String[] args) {
		String[] strs = { "flower", "flow", "flight" };
		System.out.println(longestCommonPrefix(strs));
	}
}
