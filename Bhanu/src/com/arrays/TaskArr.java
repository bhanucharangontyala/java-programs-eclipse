package com.arrays;

public class TaskArr {
	// task - 12/12/25
	// take the 2d array with nums 1 to 9
	// 1.reverse even row 0 and 2
	// 2.multiply 2 to odd row
	// 3.square the diagonal elements
	// 4.only one condition should apply to middle value
	// 1 2 3____ 9 2 1_______9 2 1
	// 4 5 6 ->_ 8 10 12 ->_8 10 12
	// 7 8 9____ 9 8 49 _____81 8 49

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		// for reversing the row of even row
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0, k = arr.length - 1; j < k; j++, k--) {
				if (i % 2 == 0) {
					int temp = arr[i][j];
					arr[i][j] = arr[i][k];
					arr[i][k] = temp;
				}

			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				// multiply 2 for odd row
				if (i % 2 != 0) {
					arr[i][j] *= 2;
				}
				// squaring the diagonal values
				if (i == j & i != arr.length / 2 || ((i == 2 | i == 0) & (j == 0 | j == 2))) {
					arr[i][j] = arr[i][j] * arr[i][j];
				}
			}
		}

		for (int[] arr2 : arr) {
			for (int arr1 : arr2) {
				System.out.print(arr1 + " ");
			}
			System.out.println();
		}

	}

}
