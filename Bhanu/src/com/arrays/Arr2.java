package com.arrays;

import java.util.Scanner;

public class Arr2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many no of values");
		int n = sc.nextInt();
		int mul = 1;
		// for taking input to array
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		// for calculating the multiplication of all the values
		for (int i = 0; i < n; i++) {
			if (arr[i] != 0) {
				mul *= arr[i];
			}
		}

		// dividing the multiplication value with the corresponding value
		for (int i = 0; i < n; i++) {
			if (arr[i] != 0) {
				arr[i] = mul / arr[i];
			} else {
				arr[i] = 0;
			}
		}

		// printing the result
		for (int val : arr) {
			System.out.print(val + " ");
		}
		sc.close();
	}

}
