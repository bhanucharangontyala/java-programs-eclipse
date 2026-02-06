package com.logicpatterns;

public class Butterfly {

	public static void main(String[] args) {
		for (int i = 1; i <= 6; i++) {
			//for left up wing
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			//for spaces
			int space = 2 * (6 - i);
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			//for right upwing
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = 1; i <= 6; i++) {
			//for left down wing
			for (int j = 6; j >= i; j--) {
				System.out.print("*");
			}
			//for spaces
			int space = 2 * (i-1);
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			//for right down wing
			for (int k = 1; k <= 7-i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
