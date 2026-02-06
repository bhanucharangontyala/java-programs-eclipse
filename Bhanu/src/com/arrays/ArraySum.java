package com.arrays;

public class ArraySum {

	public static void main(String[] args) {
		int[] arr = { 23, 54, 67, 78, 21, 43 };
		int sum = 0;
		int avg = 0;
		for (int n : arr) {
			sum += n;
		}
		avg = sum / arr.length;
		System.out.println("Sum : " + sum);
		System.out.println("Avg : " + avg);
	}

}
