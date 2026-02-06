package com.arrays;

public class Array1 {
	// why Array?
	// - to structure the data in a proper way
	// - it is the core concept from the data structure
	// - used in many algorithms where we work with homogeneous data type values
	// - it is used to access the data values faster because of the
	// memory allocation

	// what is an Array?
	// - Array is a data structure that stores the multiple values of same data
	// types in a single variable, using fixed size and contiguous block of
	// memory
	// - Array is the object of Java
	// - it is index based
	// - the starts from 0 to n-1(n- size of the array)
	// - negative indexes are not allowed complier will throw 
	//   NegativeArrayiSizeException

	public static void main(String[] args) {
		// step-1 : declaration
		// we can declare array like
		int[] arr;
		// or
//		int arr1[];
//		step-2: creation
		// size must be mentioned if not the compiler error will arise
		arr = new int[4];
//		step-3 : initialization
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		// or
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
//		step-4 :representation
		System.out.print(arr[0] + " ");
		System.out.print(arr[1] + " ");
		System.out.print(arr[2] + " ");
		System.out.print(arr[3] + " ");
		// or
		System.out.println();
		for (int n : arr) {
			System.out.print(n + " ");
		}
		// or
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
