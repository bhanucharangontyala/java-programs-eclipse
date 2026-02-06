package com.arrays;

public class RemDupArr {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 3, 5, 1, 2, 6, 7, 8, 2, 1, 2, 3, 3 };

		// Array to store unique elements
		int[] unique = new int[arr.length];
		int uniqueCount = 0;

		for (int i = 0; i < arr.length; i++) {
			boolean isDuplicate = false;

			// Check if arr[i] is already in unique[]
			for (int j = 0; j < uniqueCount; j++) {
				if (arr[i] == unique[j]) {
					isDuplicate = true;
					break;
				}
			}

			// If not duplicate, add to unique[]
			if (!isDuplicate) {
				unique[uniqueCount] = arr[i];
				uniqueCount++;
			}
		}

		// Print unique elements
		System.out.println("Unique elements:");
		for (int i = 0; i < uniqueCount; i++) {
			System.out.print(unique[i] + " ");
		}
	}
}