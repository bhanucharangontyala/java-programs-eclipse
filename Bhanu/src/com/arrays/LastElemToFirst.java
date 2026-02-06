package com.arrays;

public class LastElemToFirst {

	public static void main(String[] args) {
		int[] arr = { 123, 42536, 567, 867378, 765, 654, 333 };
		for (int i = 0; i < arr.length; i++) {
			int c = digCount(arr[i]);
			int r = 0;
			r = arr[i] % 10;
			arr[i] = (int) ((r * Math.pow(10, c-1)) + (arr[i] / 10));
		}
		for (int n : arr) {
			System.out.print(n + " ");
		}
	}

//	static int pow(int x, int n) {
//		int pow = 1;
//		for (int i = 1; i < n; i++) {
//			pow *= x;
//		}
//		return pow;
//	}

	static int digCount(int num) {
		int count = 0;
		while (num != 0) {
			num = num / 10;
			count++;
		}
		return count;
	}

}
