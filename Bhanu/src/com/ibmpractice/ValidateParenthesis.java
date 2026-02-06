package com.ibmpractice;

import java.util.Stack;

public class ValidateParenthesis {

	public static void main(String[] args) {
		String str = "{{{}}}((()))[[[]]]";
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
				if ((ch == ')' && top != '(') || 
					(ch == '}' && top != '{') || 
					(ch == ']' && top != '[')) {
					isValid = false;
					break;
				}
			}
		}

		if (!stack.isEmpty())
			isValid = false;

		if (isValid)
			System.out.println("Valid Parenthesis");
		else
			System.out.println("Not Valid Parenthesis");
	}
}
