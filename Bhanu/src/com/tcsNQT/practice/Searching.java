package com.tcsNQT.practice;

public class Searching {

	public static int binarySearch(int[] arr, int key) {
		int low = 0, high = arr.length - 1;
		while (low < high) {
			int mid = (low + high) / 2;
			if (arr[mid] == key) {
				return mid;
			} else if (arr[mid] < key) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}

	public static int linearSearch(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 34, 5, 6, 7, 8, 90, 188, 332, 34, 54 };
		int key = 80;
		System.out.println(binarySearch(arr, key));
		System.out.println(linearSearch(arr, key));
	}

}
