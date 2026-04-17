package com.tcsNQT.practice;

import java.util.Scanner;
import java.util.Stack;

public class ValidateParenthesis {

	public static boolean isValidParenthesis(String str) {
		Stack<Character> stack = new Stack<>();
		boolean isValid = true;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			// Push opening brackets
			if (ch == '(' || ch == '{' || ch == '[') {
				stack.push(ch);
			}
			// Handle closing brackets
			else {
				if (stack.isEmpty()) {
					isValid = false;
					break;
				}
				char top = stack.pop();
				if ((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')) {
					isValid = false;
					break;
				}
			}
		}
		if (!stack.isEmpty()) {
			isValid = false;
		}
		return isValid;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Parenthesis");
		String str = sc.next();
//		int c = 0;
//		boolean fail = false;
//		for (char s : str.toCharArray()) {
//			if ((s == '(') || (s == '{') || (s == '[')) {
//				c++;
//			} else if ((s == ')') || (s == '}') || (s == ']')) {
//				c--;
//			}
//			if (c < 0) {
//				fail = true;
//				break;
//			}
//		}
//		System.out.println(!fail && c == 0);
		if (isValidParenthesis(str)) {
			System.out.println("Valid Parenthesis");
		} else {
			System.out.println("Not Valid Parenthesis");
		}
		sc.close();
	}
}
