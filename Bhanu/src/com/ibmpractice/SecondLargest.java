package com.ibmpractice;

import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of elements");
		int[] arr = new int[sc.nextInt()];
		if (arr.length < 2) {
			System.out.println("-1");
		} else {
			System.out.println("Enter the elements ");
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			int max = 0;
			int secMax = 0;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] > max) {
					secMax = max;
					max = arr[i];
				}
			}
			System.out.println("Second Max is : " + secMax);
		}
		sc.close();
	}

}
