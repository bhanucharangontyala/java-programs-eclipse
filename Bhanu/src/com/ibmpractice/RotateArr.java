package com.ibmpractice;

import java.util.Scanner;

public class RotateArr {

	static void reverseArr(int[] arr, int start, int end) {
		int temp = 0;
		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	static void rotateArr(int[] arr, int n) {
		int start = 0;
		int end = arr.length - 1;
		if (n < arr.length) {
			// 1.reverse the entire array
			reverseArr(arr, start, end);
			// 2.reverse the array according to no of rotations
			reverseArr(arr, start, n - 1);
			// 3.reverse the remaining array according to n
			reverseArr(arr, n, end);

		} else {
			System.out.println();
			System.out.println("Invalid Rotation ..");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Rotation Number");
		int n = sc.nextInt();
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println("Before the rotation :");
		for (int arr1 : arr) {
			System.out.print(arr1 + " ");
		}
		rotateArr(arr, n);
		System.out.println();
		System.out.println("After the rotation :");
		for (int arr1 : arr) {
			System.out.print(arr1 + " ");
		}
		sc.close();
	}

}
