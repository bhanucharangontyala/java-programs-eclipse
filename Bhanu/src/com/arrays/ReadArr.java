package com.arrays;

import java.util.Scanner;

public class ReadArr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the Array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		for (int ans : arr) {
			System.out.print(ans + " ");
		}
		System.out.println();

		// for 2d
		System.out.println("Enter row and column size");
		int r = sc.nextInt();
		int c = sc.nextInt();
		int[][] arr2 = new int[r][c];
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				arr2[i][j] = sc.nextInt();
			}
		}
		// for representation
		for (int[] ans1 : arr2) {
			for (int ans3 : ans1) {
				System.out.print(ans3 + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}

}
