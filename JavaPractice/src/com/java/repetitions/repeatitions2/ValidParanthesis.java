package com.java.repetitions.repeatitions2;

import java.util.Stack;

public class ValidParanthesis {
	public static void main(String[] args) {

		String s = "()[]{}";
		
		boolean result = isValid(s);
		System.out.println(result);

	}

	public static boolean isValid(String s) {

		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (c == '(' || c == '[' || c == '{') {
				stack.push(c);
			} else {
				if (stack.isEmpty()) {
					return false;
				} else {
					if (c == ')' && stack.peek() != '(') {
						return false;
					}
					if (c == ']' && stack.peek() != '[') {
						return false;
					}
					if (c == '}' && stack.peek() != '{') {
						return false;
					}
					stack.pop();
				}
			}

		}
		return stack.isEmpty();
	}

}
