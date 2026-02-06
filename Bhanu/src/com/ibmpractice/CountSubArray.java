package com.ibmpractice;

public class CountSubArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 2, 4, 5, 6, 7, 8, 9 };
		int k = 6;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = i; j < arr.length; j++) {
				sum += arr[j];
				if (sum == k) {
					count++;
				}
			}
		}
		System.out.println("Count of continues subarray that sums of to K is : " + count);
	}

}
