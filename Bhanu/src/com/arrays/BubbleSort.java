package com.arrays;

import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of elements in the array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int temp = 0;
		int count = 0;
		for (int i = 0; i < n; i++) {
			boolean flag = false;
			for (int j = 0; j < n - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = true;
				}
			}
			count++;
			if (!flag) {
				break;
			}
		}

		for (int ar1 : arr) {
			System.out.print(ar1 + " ");
		}
		System.out.println();
		System.out.println(count);
		sc.close();
	}
}
