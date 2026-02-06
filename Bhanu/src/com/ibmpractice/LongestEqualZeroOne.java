package com.ibmpractice;

import java.util.HashMap;

public class LongestEqualZeroOne {

	public static int longestSubarray(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int sum = 0;
		int maxLen = 0;
		for (int i = 0; i < arr.length; i++) {
			// Convert 0 to -1 and 1 to +1
			sum += (arr[i] == 0) ? -1 : 1;
			// If sum becomes 0, subarray from 0 to i has equal 0s and 1s
			if (sum == 0) {
				maxLen = i + 1;
			}
			// If same sum seen before, subarray between indices has sum 0
			if (map.containsKey(sum)) {
				maxLen = Math.max(maxLen, i - map.get(sum));
			}
			// Store first occurrence of sum
			else {
				map.put(sum, i);
			}
			System.out.println(map);
		}
		return maxLen;
	}

	public static void main(String[] args) {
		int[] arr = { 0, 1, 0, 1, 1, 1, 0 };
		System.out.println(longestSubarray(arr)); // Output: 4
	}
}
