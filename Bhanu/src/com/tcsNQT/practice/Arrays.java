package com.tcsNQT.practice;

public class Arrays {

	public static int[][] sumofMatrices(int[][] arr1, int[][] arr2, int row, int col) {
		int[][] sum = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; i++) {
				sum[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		return sum;
	}

	public static void transposeOfMat(int[][] arr) {
		for (int i = 0; i < arr[0].length; i++) { // columns
			for (int j = 0; j < arr.length; j++) { // rows
				System.out.print(arr[j][i] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

	}

}
