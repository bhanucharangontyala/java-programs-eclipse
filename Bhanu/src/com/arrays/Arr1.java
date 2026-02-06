package com.arrays;

import java.util.Scanner;

public class Arr1 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int i = 0;
		int j = arr.length - 1;
		int sum = 0;
		if (n < 0 || n > 17) {
			System.out.println("Cannot get that number from above");
		}  
		while (i < j) {
			sum = arr[i] + arr[j];
			if (sum == n) {
				System.out.println(arr[i] + "," + arr[j]);
				i++;
				j--;
				break;
			} else if (sum < n) {
				i++;
			} else {
				j--;
			}
		}
		sc.close();
	}

}
