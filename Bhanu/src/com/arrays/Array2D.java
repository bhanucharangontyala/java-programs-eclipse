package com.arrays;

import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		creation
		int row = 3;
		int col = 3;
		int[][] arr = new int[row][col];
		arr[0][0] = sc.nextInt();
//		initialization
		arr[0][0] = 11;
		arr[1][1] = 22;
		arr[2][2] = 33;
		// or
		// for dynamically
		// for representing the arr
		// 1.
//		System.out.println(arr[0][0]);
//		System.out.println(arr[1][1]);
//		System.out.println(arr[1][2]);
//		// 2.
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr.length; j++) {
//				System.out.print(arr[i][j]);
//			}
//			System.out.println();
//		}
		// 3.
		for (int[] arr2 : arr) {
			for (int arr1 : arr2) {
				System.out.print(arr1 + " ");
			}
			System.out.println();
		}
		sc.close();
	}

}
