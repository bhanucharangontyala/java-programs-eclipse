package com.accenture.practice;

public class DiffMaxOddMinEvenFreq {

	public static void main(String[] args) {
		String str = "aabcccdddde";
		int[] arr = new int[127];
		// for Storing the frequency
		for (int i = 0; i < str.length(); i++) {
			arr[str.charAt(i)] += 1;
		}
		int oddMax = 0;
		int evenMin = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				if (arr[i] % 2 != 0) {
					oddMax = Math.max(oddMax, arr[i]);
				} else {
					evenMin = Math.min(evenMin, arr[i]);
				}
			}
		}
		int res = oddMax - evenMin;
//		System.out.println(oddMax);
//		System.out.println(evenMin);
		System.out.println("Result : " + res);
	}

}
