package com.loops;

public class ForLoop1 {
	// why for?
//	  - it used to reduce code and increase code reusability
//	  - when We know how many times we need to repeat something.

//	what is for loop?
//	 -A for loop in Java is a control flow statement that allows you to repeat 
//	 a block of code a certain number of times.
//	syntax 
//		for (initialization; condition; update) {
//			    / body of the loop
//		 }

	// where wee use for loop
//	  -printing numbers, iterating arrays, summing numbers

//	work flow 
//	1. intialization
//	2. condition check
//	3. executing body 
//	4. incr or decr
//	and repeat from 2 condition check
//	
	public static void main(String[] args) {
		int n = 100;
//		// for printing 1-n
//		for (int i = 0; i < n; i++) {
//			System.out.println(i);
//		}
//		// for printing n-1
//		for (int i = n; i > 0; i--) {
//			System.out.println(i);
//		}
		// for printing even from 1-n
//		for (int i = 0; i < n; i = i + 2) {
//			System.out.println(i);
//		}
		// for printing even from n-1
//		for (int i = n; i > 0; i = i - 2) {
//			System.out.println(i);
//		}
		// for printing odd from 1-n
//		for (int i = 1; i < n; i = i + 2) {
//			System.out.println(i);
//		}
		// for printing odd from n-1
//		for (int i = n; i > 0; i = i - 2) {
//			System.out.println(i);
//		}
		int i=0;
		for(;i<n;) {
		System.out.println(i);
		i++;
		}
		
	}

}
