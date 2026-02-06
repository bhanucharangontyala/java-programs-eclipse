package com.logicpatterns;

public class Pattern11 {

	public static void main(String[] args) {
		int n = 3;
		for (int i = 1; i <= n; i++) {
			for (int k = 1; k <= n - i; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			for (int j = 2; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = n - 1; i >= 1; i--) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			for (int j = 2; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
