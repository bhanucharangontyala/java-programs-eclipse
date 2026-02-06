package com.arrays;

public class RowCol_0 {

	public static void main(String[] args) {
		int[][] arr = { { 1, 1, 0 }, 
					    { 1, 1, 1 }, 
					    { 0, 1, 1 } };
		int row = arr.length;
		int col = arr.length;
		int[] row0 = new int[row];
		int[] col0 = new int[col];
		
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (arr[i][j] == 0) {
					row0[i] = 1;
					col0[j] = 1;
				}
			}
		}

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (row0[i] == 1 || col0[j] == 1) {
					arr[i][j] = 0;
				}
			}
		}
		for (int[] ar2 : arr) {
			for (int ar1 : ar2) {
				System.out.print(ar1 + " ");
			}
			System.out.println();
		}
	}

}
