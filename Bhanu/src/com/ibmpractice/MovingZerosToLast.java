package com.ibmpractice;

public class MovingZerosToLast {

	public static void main(String[] args) {
		int[] arr = { 2, 0, 4, 1, 0, 0, 5 };
		int[] arr2 = new int[arr.length];
		//without using swapping
		int index = 0;
		for(int num:arr) {
			if(num!=0) {
				arr2[index++]=num;
			}
		}
		
//		using swapping
//		int j = 0;
//		for (int i = 0; i < arr.length; i++) {
//			int temp = 0;
//			if (arr[i] != 0) {
//				temp = arr[i];
//				arr[i] = arr[j];
//				arr[j] = temp;
//				j++;
//			}
//		}
		for (int n : arr2) {
			System.out.print(n);
		}
	}

}
