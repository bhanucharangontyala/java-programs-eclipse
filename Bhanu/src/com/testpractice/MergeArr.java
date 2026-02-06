package com.testpractice;

import java.util.Arrays;

public class MergeArr {

	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 5 };
		int[] arr2 = { 2, 4, 6 };
		int i = 0, j = 0, k = 0;
		int[] mer = new int[arr1.length + arr2.length];
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				mer[k++] = arr1[i++];
			} else {
				mer[k++] = arr2[j++];
			}
		}
		// for remaining in arr1
		while (i < arr1.length) {
			mer[k++] = arr1[i++];
		}
		// for remaining in arr2
		while (j < arr2.length) {
			mer[k++] = arr2[j++];
		}
		System.out.println("Merged Sorted Arrays \n" + Arrays.toString(mer));
	}

}
