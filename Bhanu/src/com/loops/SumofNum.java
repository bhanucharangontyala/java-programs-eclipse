package com.loops;

import java.util.Scanner;

public class SumofNum {

	int sumOfNum(int n) {
		int sum = 0;
		int r = 0;
		while (n != 0) {
			r = n % 10;
			n = n / 10;
			sum += r;
		}
		return sum;
	}

	void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number :");
		int n = sc.nextInt();
		System.out.println("The Sum of the Number is : " + sumOfNum(n));
		sc.close();
	}

}
