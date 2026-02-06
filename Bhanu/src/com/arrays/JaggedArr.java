package com.arrays;

import java.util.Scanner;
 

public class JaggedArr {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the row size of the jagged array");
		int jag = sc.nextInt();
		System.out.println("Enter the different sizes of columns");

		int[][] arr = new int[jag][];
		// explicitly
//		int c1 = sc.nextInt();
//		int c2 = sc.nextInt();
//		int c3 = sc.nextInt();		
//		arr[0] = new int[c1];
//		arr[1] = new int[c2];
//		arr[2] = new int[c3];
//		
		// dynamically initializing the the column size for every row
		for (int i = 0; i < jag; i++) {
			System.out.print("Enter the number of columns for row " + i + ": ");
			int cols = sc.nextInt();
			arr[i] = new int[cols];
		}
		// assigning/inserting the values to respective indexed values
		System.out.println("Enter the elements in jagged array");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		// printing the jagged array
		for (int[] ar2 : arr) {
			for (int ar1 : ar2) {
				System.out.print(ar1 + " ");
			}
			System.out.println();
		}

	}

}
