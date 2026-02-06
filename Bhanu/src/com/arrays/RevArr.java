package com.arrays;

public class RevArr {

	public static void main(String[] args) {
		int[] arr = { 12, 5, 6, 75, 67, 2, 32, 56 };
		// reverse the array
		// 1.
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		// 2.
		int st = 0;
		int end = arr.length - 1;
		while (st < end) {
			int temp = st;
			st = end;
			end = temp;
			st++;
			end--;
		}
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

}
