package com.ravi.job;

import java.util.Stack;

/**
 * Given a string consisting of opening and closing parenthesis, find length of
 * the longest valid parenthesis substring.
 * 
 * @author Teja
 *
 */
public class LongestSubString {
	public static int getLongestSubStringCount(String countString) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < countString.length(); i++) {
			switch (countString.charAt(i)) {
			case '(':
				stack.push('(');
				break;
			case ')':
				Character pop = stack.pop();
				
				break;
			}

		}

		return 0;
	}
}
