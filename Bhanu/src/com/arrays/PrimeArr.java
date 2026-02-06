package com.arrays;

public class PrimeArr {

	static boolean isPrime(int n) {
		int count = 0;
		if (n == 0 | n == 1) {
			return false;
		}
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count <= 2) {
			return true;
		} else {
			return false;
		}
	}

	static int nthPrime(int n) {
		int nthPrime = 0;
		int count = 0;
		int num = 1;

		while (count < n) {
			num++;
			if (isPrime(num)) {
				count++;
				nthPrime = num;
			}
		}
		return nthPrime;
	}

	public static void main(String[] args) {
		System.out.println(isPrime(0));
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int n = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (isPrime(i + j)) {
					arr[i][j] = nthPrime(n);
					n++;
				}
			}
		}

		for (int[] ar : arr) {
			for (int ar2 : ar) {
				System.out.print(ar2 + " ");
			}
			System.out.println();
		}
	}

}
