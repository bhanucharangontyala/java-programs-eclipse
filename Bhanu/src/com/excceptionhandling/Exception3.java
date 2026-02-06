package com.excceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter a Number");
			int n = sc.nextInt();
			int arr[] = { 1, 2, 3, 4 };
			System.out.println(arr[n]);
		} catch (InputMismatchException e) {
			System.err.println("In InputMismatchException catch block");
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("In ArrayIndexOutOfBoundsException catch block");
			e.printStackTrace();
		} finally {
			System.out.println("In finally");
			sc.close();
		}

	}

}
