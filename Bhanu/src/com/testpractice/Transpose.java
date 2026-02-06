package com.testpractice;

public class Transpose {

	public static void main(String[] args) {
		int[][] n = { { 1, 2, 3 }, { 4, 5, 6, }, { 7, 8, 9 } };
		int[][] tran = new int[3][3];
		//before operation 
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(n[i][j] + " ");
			}
			System.out.println();
		}
		//for transpose of matrix
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				tran[j][i] = n[i][j];
			}
		}
		
		//for reversing the row
		for (int i = 0; i < 3; i++) {
			for (int j = 0,k=3-1; j < k; j++,k--) {
				int temp = tran[i][j];
				tran[i][j] = tran[i][k];
				tran[i][k] = temp;
			}
		}
		//for printing result
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(tran[i][j] + " ");
			}
			System.out.println();
		}
	}

}
