package com.logicpatterns;

public class Alphabets {

	public static void main(String[] args) {
		int n = 6;
		System.out.println(" Alphabet A");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 || j == 1 || j == n || i == n - 2) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("ALphabet B");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 || j == 1 || i == n || j == n || i == n - 2) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("Alphabet C");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 || j == 1 || i == n) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("Alphabet D");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 || j == 1 || i == n || j == n) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("Alphabet E");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 || j == 1 || i == n || i == n - 2) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("Alphabet F");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 || j == 1 || i == n - 2) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("Alphabet G");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 || j == 1 || i == n || (j == n && (i == 4 | i == 5)) || (j == n - 2 & (i == 4))) {
					System.out.print("*");
				} else if (i == 2 && j == n) {
					System.out.print(" ");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		System.out.println("Alphabet H");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j == n || j == 1 || i == n - 2) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("Alphabet I");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == n || i == 1 || j == n - 2) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("Alphabet J");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 || j == n - 2 || (i == n & (j == 1 || j == 2 || j == 3))) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("Alphabet K");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j == 1 || ((i == 1 | i == 5) & j == 4) || ((i == 2 | i == 4) & j == 3) || (i == 3 & j == 2)
						|| (i == 6 & j == 5)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("Alphabet L");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j == 1 || i == n) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("Alphabet M");
		for (int i = 1; i <= n - 1; i++) {
			for (int j = 1; j <= n - 1; j++) {
				if (j == 1 || j == n - 1 || (i == 2 & (j == 2 | j == 4)) || (i == 3 & j == 3)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("Alphabet N");
		for (int i = 1; i <= n - 1; i++) {
			for (int j = 1; j <= n - 1; j++) {
				if (j == 1 || j == n - 1 || (i == j)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("Alphabet O");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 || j == 1 || i == n || j == n) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("Alphabet P");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 || j == 1 || i == n - 2 || ((i == 2 | i == 3) & j == n)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("Alphabet O");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if ((i == 1 & (j == 1 | j == 2 | j == 3 | j == 4 | j == 5))
						|| (i == n - 1 & (j == 1 | j == 2 | j == 3 | j == 4 | j == 5))
						|| (j == 1 & (i == 1 | i == 2 | i == 3 | i == 4 | i == 5))
						|| (j == n - 1 & (i == 1 | i == 2 | i == 3 | i == 4 | i == 5)) || (i == 4 & j == 4)
						|| (i == 5 & j == 5) || (i == 6 & j == 6)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("Alphabet R");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == 1 || j == 1 || i == n - 2 || ((i == 2 | i == 3) & j == n) || (i == 4 & j == 4)
						|| (i == 5 & j == 5) || (i == 6 & j == 6)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("Alphabet S");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == n || i == 1 || (j == 1 & (i == 2 | i == 3)) || (j == n & (i == 4 | i == 5)) || i == n - 2) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("Alphabet T");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n + 1; j++) {
				if (i == 1 || j == n - 2) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("Alphabet U");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j == n || j == 1 || i == n) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		} 
		System.out.println("Alphabet V");
		for (int i = 1; i <= n + 1; i++) {
			for (int j = 1; j <= n + 1; j++) {
				if ((j == n + 1 & (i == 1 | i == 2 | i == 3 | i == 4)) 
						|| (j == 1 & (i == 1 | i == 2 | i == 3 | i == 4))
						|| (i == 5 & (j == 2 | j == 6)) 
						|| (i == 6 & (j == 3 | j == 5)) 
						|| (i == 7 & j == 4)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("Alphabet W");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n+1; j++) {
				if (j == n+1 || j == 1 
						|| (i == 5 &(j==6|j==2))
						|| (i == 4 &(j==3|j==5))
						||(i==3&j==4)
						) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("Alphabet X");
		for (int i = 1; i <= n+1 ; i++) {
			for (int j = 1; j <= n+1 ; j++) {
				if (i==j||(i==1&j==n+1)
						||(i==2&j==n)
						||(i==3&j==n-1)
						||(i==5&j==n-3)
						||(i==6&j==n-4)
						||(i==n+1&j==1)
						) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}// 1 23456 7
		System.out.println("Alphabet Y");
		for (int i = 1; i <= n-1 ; i++) {
			for (int j = 1; j <= n-1 ; j++) {
				if ((j == n-1 & (i == 1 | i == 2)) 
						|| (j == 1 & (i == 1 | i == 2 ))
						|| (i == 3 & (j == 2 | j == 4)) 
						|| (i == 4 & j == 3) 
						|| (i == 5 & j == 3)
						|| (i == 6 & j == 3)
						) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("Alphabet Z");
		for (int i = 1; i <= n+1 ; i++) {
			for (int j = 1; j <= n+1 ; j++) {
				if (i==1||i==n+1 ||(i==1&j==n+1)
						||(i==2&j==n)
						||(i==3&j==n-1)
						||(i==4&j==4)
						||(i==5&j==3)
						||(i==6&j==n-4)
						||(i==n+1&j==1)
						) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		

	}

}
