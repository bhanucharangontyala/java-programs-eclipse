package com.tcsNQT.practice;

public class Factorial {

	// factorial
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a Number");
//		int n = Math.abs(sc.nextInt());
//		int fact = 1;
//		for (int i = 1; i <= n; i++) {
//			fact *= i;
//		}
//		System.out.println("The factorial of " + n + " is : " + fact);
//		sc.close();
//	}

	// fibonacci series(N terms)
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a Number");
//		int n = sc.nextInt();
//		int a = 0;
//		int b = 1;
//		for (int i = 1; i <= n; i++) {
//			System.out.print(a+" ");
//			int c = a+b;
//			a = b;
//			b = c;
//		}
//		sc.close();
//	}

	// palindrome
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a Number");
//		int n = Math.abs(sc.nextInt());
//		int temp = n, rev = 0;
//		while (n != 0) {
//			rev = rev * 10 + (n % 10);
//			n = n / 10;
//		}
//		System.out.println(temp == rev ? "Palindrome" : "Not palindrome");
//		sc.close();
//	}

	// digit count
//	public static int dCount(int num) {
//		int dCount = 0;
//		if (num == 0) {
//			return 1;
//		} else {
//			int temp = num;
//			while (temp != 0) {
//				temp /= 10;
//				dCount++;
//			}
//			return dCount;
//		}
//	}

	// armstrong
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a Number");
//		int n = sc.nextInt();
//		int temp = n, sum = 0;
//		int dC = dCount(n);
//		while (n != 0) {
//			int d = n % 10;
//			sum += (int) Math.pow(d, dC);
//			n /= 10;
//		}
//		System.out.println(temp == sum ? "Armstrong" : "Not ArmStrong");
//		sc.close();
//	}
	
	
}
