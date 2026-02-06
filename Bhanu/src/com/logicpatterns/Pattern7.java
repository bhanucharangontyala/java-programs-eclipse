package com.logicpatterns;

public class Pattern7 {

	public static void main(String[] args) {
		int n=6;
		for (char i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print((char)(i+64));
			}
			System.out.println();
		}
		for (char i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print((char)(j+64));
			}
			System.out.println();
		}
	}

}
