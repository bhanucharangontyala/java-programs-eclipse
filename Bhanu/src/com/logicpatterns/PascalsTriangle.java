package com.logicpatterns;

public class PascalsTriangle {

	public static void main(String[] args) {
		int n = 5;
		for (int i = 0; i < n; i++) {
			for (int k = 1; k < n - i; k++) {
				System.out.print(" ");
			}
			int num =1;
			for (int j = 0; j < i+1; j++) {
				System.out.print(num + " ");
				num = num * (i - j) / (j + 1);
			}
			System.out.println();
		}
	}

}
