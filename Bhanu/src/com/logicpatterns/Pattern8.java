package com.logicpatterns;

public class Pattern8 {

	public static void main(String[] args) {
		int n = 6;
		int ans = 1;
		for (char i = 1; i <= n-3; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(ans);
				ans++;
			}
			System.out.println();
		}
		
	}
}
