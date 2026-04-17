package com.tcsNQT.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubArraySum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> l = new ArrayList<>();
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		int j = 0;
		do {
			sum += arr[j];
			l.add(arr[j]);
			j++;
		} while (sum != 0);
		System.out.println(l);
		sc.close();
	}
}
