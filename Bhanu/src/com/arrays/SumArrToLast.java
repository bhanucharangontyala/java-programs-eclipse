package com.arrays;

public class SumArrToLast {

	public static void main(String[] args) {
		int[] arr = { 123, 143, 157, 193, 117 };
		for (int i = 0; i < arr.length; i++) {
			int r = 0;
			int temp = arr[i];
			int sum = 0;
			while (arr[i] != 0) {
				r = arr[i] % 10;
				sum += r;
				arr[i] /= 10;
			}
			if (sum > 100) {
				temp = (temp * 1000) + sum;
				arr[i] = temp;
			} else if (sum > 9) {
				temp = (temp * 100) + sum;
				arr[i] = temp;
			} else if (sum < 10) {
				temp = (temp * 10) + sum;
				arr[i] = temp;
			}
		}
		for (int n : arr) {
			System.out.print(n + " ");
		}
	}

}
