package com.tcsNQT.practice;

public class Sorting {

	private static int[] bubbleSort(int[] arr) {
		int[] res = arr;
		int n = res.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (res[j] > res[j + 1]) {
					int temp = res[j];
					res[j] = res[j + 1];
					res[j + 1] = temp;
				}
			}
		}
		return res;
	}

	private static int[] insertionSort(int[] arr) {
		int[] res = arr;
		int n = res.length;
		for (int i = 1; i < n; i++) {
			int key = res[i];
			int j = i - 1;
			while (j >= 0 && res[j] > key) {
				res[j + 1] = res[j];
				j--;
			}
			res[j + 1] = key;
		}
		return res;
	}

	private static int[] selectionSort(int[] arr) {
		int[] res = arr;
		int n = res.length;
		for (int i = 0; i < n - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < n; j++) {
				if (res[j] < res[minIndex]) {
					minIndex = j;
				}
			}
			int temp = res[i];
			res[i] = res[minIndex];
			res[minIndex] = temp;
		}
		return res;
	}

	public static void main(String[] args) {
		int[] arr = { 9, 8, 7, 6, 5, 4, 2, 4, 5, 2, 1, 0 };
		int[] bubble = bubbleSort(arr);
		for (int a : bubble) {
			System.out.print(a + " ");
		}

		System.out.println();
		int[] selection = selectionSort(arr);
		for (int a : selection) {
			System.out.print(a + " ");
		}

		System.out.println();
		int[] insertion = insertionSort(arr);
		for (int a : insertion) {
			System.out.print(a + " ");
		}

	}

}
