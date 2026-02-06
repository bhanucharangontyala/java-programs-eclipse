package com.ibmpractice;

public class ArrJumpReach {
	// You start at index `0`.
	// Each element represents the maximum jump length from that position.
	// Determine whether you can reach the last index.
	public static void main(String[] args) {
		int[] arr = { 1, 1, 3, 5, 1, 2, 3, 4 };
		int last = arr.length - 1;
		int maxReach = 0;
		boolean flag = true;
		for (int i = 0; i < arr.length; i++) {
			if (i > maxReach) {
				flag = false;
				break;
			}
			maxReach = Math.max(maxReach, i + arr[i]);
		}
		if (flag && maxReach >= last) {
			System.out.println("Reachable");
		} else {
			System.out.println("Not Reachable");
		}
	}

}
