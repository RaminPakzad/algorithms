package com.pk.tutorial.string;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;

public class ValidParenthesis {

	public static void main(String[] args) {
		System.out.println(isValid("(){}}"));//false
		System.out.println(isValid("[]{}"));//true
		System.out.println(isValid("[}[}"));//false
	}

	public static boolean isValid(String expression) {
//		List<Character> openings = Arrays.asList('{', '[', '(');
//		List<Character> closings = Arrays.asList('}', ']', ')');
		Set<Character> validChars = new HashSet<>(Arrays.asList('{', '[', '(', '}', ']', ')'));

//		Stack<Character> stack = new Stack<>();
		Deque<Character> stack = new ArrayDeque<>();
		for (char c : expression.toCharArray()) {
			if (!validChars.contains(c))
				continue;
			if (c == '(' || c == '[' || c == '{') {
				stack.push(c);
			} else if (')' == c && !stack.isEmpty() && stack.peek() == '(') {
				stack.pop();
			} else if (']' == c && !stack.isEmpty() && stack.peek() == '[') {
				stack.pop();
			} else if ('}' == c && !stack.isEmpty() && stack.peek() == '{') {
				stack.pop();
			} else {
				return false;
			}
		}
		return stack.isEmpty();
	}

}
