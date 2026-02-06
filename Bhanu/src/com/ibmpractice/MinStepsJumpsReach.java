package com.ibmpractice;

public class MinStepsJumpsReach {

	public static void main(String[] args) {
		int[] arr = { 1, 1, 3, 5, 1, 2, 3, 4 };
		int n = arr.length;
		if (n <= 1) {
			System.out.println("Minimum Jumps: 0");
			return;
		}
		int jumps = 0;
		int maxReach = 0;
		int end = 0;
		for (int i = 0; i < n - 1; i++) {
			maxReach = Math.max(maxReach, i + arr[i]);
			if (i == end) {
				jumps++;
				end = maxReach;
				if (end >= n - 1) {
					break;
				}
			}
		}
		if (end >= n - 1)
			System.out.println("Minimum Jumps: " + jumps);
		else
			System.out.println("Not Reachable");
	}
}
