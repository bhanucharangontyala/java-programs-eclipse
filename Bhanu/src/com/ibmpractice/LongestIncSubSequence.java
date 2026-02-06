package com.ibmpractice;

import java.util.Scanner;

public class LongestIncSubSequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of elements");
		int[] arr = new int[sc.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int res = 0;
		for (int i = 0; i < arr.length; i++) {
			int leftSmaller = 0;
			int rightGreater = 0;
			// for smaller elements on right
			for (int j = 0; j < i; j++) {
				if (arr[j] < arr[i]) {
					leftSmaller++;
				}
			}
			// for right greater elements
			for (int k = i + 1; k < arr.length; k++) {
				if (arr[k] > arr[i]) {
					rightGreater++;
				}
			}

			res += (leftSmaller * rightGreater);
		}
		System.out.println("No of Longest Increasing Sub Sequence :" + res);
		sc.close();
	}

}
