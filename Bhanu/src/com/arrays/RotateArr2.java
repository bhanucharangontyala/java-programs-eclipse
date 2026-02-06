package com.arrays;

import java.util.Scanner;

public class RotateArr2 {

	static void reverseArr(int[] arr, int start, int end) {
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	// left rotation
	static void leftRotate(int[] arr, int n) {
		int start = 0;
		int end = arr.length;
		// handle rotations > length
		if (n < arr.length) {
			// 1. Reverse whole array
			reverseArr(arr, start, end - 1);
			// 2. Reverse last n elements
			reverseArr(arr, end - n, end - 1);
			// 3. Reverse first (len - n) elements
			reverseArr(arr, 0, end - n - 1);
		}
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no of rotations");
		int n = sc.nextInt();

		leftRotate(arr, n);

		for (int x : arr) {
			System.out.print(x + " ");
		}
		sc.close();
	}
}
