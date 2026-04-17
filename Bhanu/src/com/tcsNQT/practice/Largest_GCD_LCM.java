package com.tcsNQT.practice;

import java.util.Scanner;

public class Largest_GCD_LCM {

	// finding the max value
//	public static int LargestOfThree(int n1, int n2, int n3) {
//		return Math.max(n1, Math.max(n2, n3));
//	}
//
//	public static int LargestNum(int... n1) {
//		int max = Integer.MIN_VALUE;
//		for (int i : n1) {
//			if (i > max) {
//				max = i;
//			}
//		}
//		return max;
//	}

	public static void main(String[] args) {
//		System.out.println(LargestOfThree(3, 5, 9));
//		System.out.println(LargestNum(1, 2, 34, 4, 56, 7, 7, 8, 9, 9, 88, 76));
		
		//gcd /HCF
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Numbers");
//		int a = sc.nextInt(), b = sc.nextInt();
//		while (b != 0) {
//			int temp = b;
//			b = a % b;
//			a = temp;
//			System.out.println(temp + " " + a + " " + b);
//		}
//		System.out.println(a);
//		sc.close();
		
		
		//LCM
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Numbers");
		int a = sc.nextInt(), b = sc.nextInt();
		int x =a,y=b;
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		int lcm = (x*y)/a;
		System.out.println(lcm);
		sc.close();
	}

}
