package com.tcsNQT.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class AnagramSubStringSearch {

	// Driver code for demonstration
	public static void main(String[] args) {
		String s = "cbaebabacd";
		String p = "abc";
		List<Integer> result = new ArrayList<>();
		int sLen = s.length();
		int pLen = p.length();

		// If the pattern is longer than the string, no anagram can exist
		if (sLen < pLen) {
			return;
		}

		// Use frequency arrays for lowercase English letters (size 26)
		int[] sCount = new int[26];
		int[] pCount = new int[26];
		

		// Populate the frequency array for the pattern P and the first window in S
		for (int i = 0; i < pLen; i++) {
			sCount[s.charAt(i) - 'a']++;
			pCount[p.charAt(i) - 'a']++;
		}

		// Check if the first window is an anagram
		if (Arrays.equals(pCount, sCount)) {
			result.add(0);
		}

		// Slide the window across the rest of the string S
		for (int i = pLen; i < sLen; i++) {
			// Add the new character entering the window on the right
			sCount[s.charAt(i) - 'a']++;
			// Remove the character exiting the window from the left
			sCount[s.charAt(i - pLen) - 'a']--;

			// Compare frequency arrays
			if (Arrays.equals(pCount, sCount)) {
				// The starting index is the current index minus the pattern length plus one
				result.add(i - pLen + 1);
			}
		}
		
		System.out.println("String S: \"" + s + "\", Pattern P: \"" + p + "\"");
		System.out.println("Starting indices of anagrams: " + result); // Output: [0, 6]
	}
}
