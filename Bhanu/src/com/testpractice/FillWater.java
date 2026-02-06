package com.testpractice;

public class FillWater {

	public static void main(String[] args) {
		int[] arr = { 1, 8, 5, 7, 9, 8, 10 };
		int maxA = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				// compare two building take min height
				int high = Math.min(arr[i], arr[j]);
				// width is distance between the bulidings
				int w = j - i;
				// area
				int area = high * w;
				// assigning to maxA 
				maxA = Math.max(maxA, area);
			}
		}
		System.out.println(maxA);
	}
}