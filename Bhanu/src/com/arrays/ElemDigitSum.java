package com.arrays;

public class ElemDigitSum {

	public static void main(String[] args) {
		int[] arr = { 12, 34, 23, 56, 44, 77, 87, 98, 98 };
		int[] res = new int[arr.length * 2];
		for (int i = 0; i < arr.length; i++) {
			res[i] = arr[i];
		}
		for (int i = arr.length; i < res.length; i++) {
			int r = 0;
			int sum = 0;
			while (arr[i - arr.length] != 0) {
				r = arr[i - arr.length] % 10;
				sum += r;
				arr[i - arr.length] /= 10;
			}
			res[i] = sum;
		}
		for (int n : res) {
			System.out.print(n + " ");
		}
	}
}
