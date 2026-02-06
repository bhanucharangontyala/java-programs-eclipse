package com.loops;

import java.util.Scanner;

public class FibonacciRecur {
	static Scanner sc = new Scanner(System.in);

	static void fibrecur(int n1, int n2, int n) {
		if (n == 0) {
			return;
		}
		int c = n1 + n2;
		System.out.print(c + " ");
		fibrecur(n2, c, n - 1);
		// fib(0,1,3) - 1
		// fib(1,1,2) - 2
		// fib(1,2,1) - 3
		// fib(2,3,0)
	}

	public static void main(String[] args) {
		System.out.println("Enter a Number :");
		int num = sc.nextInt();
		int n1 = 0;
		int n2 = 1;
		System.out.print(n1 + " " + n2 + " ");
		fibrecur(n1, n2, num - 2);
	}

}
