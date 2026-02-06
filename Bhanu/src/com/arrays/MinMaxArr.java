package com.arrays;

public class MinMaxArr {

	public static void main(String[] args) {
		int[] arr = { 1, 4, 105, 6, 78, 99, 92, 0 };
		int max = arr[0];
		int min = arr[0];
		
		
		for (int n : arr) {
			if (n < min) {
				min = n;
			} else if (n > max) {
				max = n;
			}
		}

		// for max
//		int max = arr[0];
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] > max) {
//				max = arr[i];
//			}
//		}
		System.out.println("Max : " + max);
//		// for min
//		int min = arr[0];
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] < min) {
//				min = arr[i];
//			}
//		}
		System.out.println("Min : " + min);
	}

}
