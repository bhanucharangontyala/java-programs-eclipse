package com.loops;

import java.util.Scanner;

public class FactorsRecur {

	int i = 1;

	int factrecur(int n) {
		if (i > n) {
			return 1;
		}
		if (n % i == 0) {
			System.out.print(i + " ");
		}
		i++;
		return factrecur(n);
	}

	void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number :");
		int num = sc.nextInt();
		factrecur(num);
		sc.close();
	}

}
