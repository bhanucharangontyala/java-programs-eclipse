package com.tcsNQT.practice;

import java.util.*;

public class InputPractice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		String line = sc.nextLine().trim();
//		String[] arr = line.split(" ");//for input 1 2 3 4 5 6 7 
//		String[] arr = line.split(",");//for input 1,2,3,4,5,6,7
		// or
//		String[] arr = line.replaceAll(",", " ").split(" ");

		// if [1,2,3,4,5,6,7] as input
//		line = line.replaceAll("\\[|\\]", "");
//		String[] arr = line.split(",");
//		int[] input = new int[arr.length];
//		for (int i = 0; i < input.length; i++) {
//			input[i] = Integer.parseInt(arr[i]);
//		}
//		String s = "[";
//
//		for (int i = 0; i < input.length; i++) {
//			s += input[i];
//			if (i != input.length - 1) {
//				s += ",";
//			}
//		}
//		s += "]";
//		System.out.println(s);
//		float f = 123.455677f;
//		System.out.printf("%.3f", f);

		int row = 3;
		int col = 2;
		String line = sc.nextLine();
		String[] arr = line.split(",");
		int[][] marr = new int[row][col];
		int k = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				marr[i][j] = Integer.parseInt(arr[k++].trim());
			}
		}
		for (int[] a : marr) {
			for (int b : a) {
				System.out.print(b + " ");
			}
			System.out.println();
		}
		sc.close();

	}

}
