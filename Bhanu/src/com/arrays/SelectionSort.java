package com.arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = { 3, 4, 6, 7, 8, 9, 1, 2 };
		int low = 0;
		int temp = 0;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			low = i;
			boolean flag = false;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[low] > arr[j]) {
					low = j;
					flag = true;
				}
				count++;
			}
			temp = arr[low];
			arr[low] = arr[i];
			arr[i] = temp;
			if (!flag) {
				break;
			}
		}
		for (int n : arr) {
			System.out.print(n + " ");
		}
		System.out.println();
		System.out.println(count);

	}

}
