package com.ravi.learn;

public class InfixPostFixed {
	public static int getPrecedence(char c) {
		switch (c) {
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
		case '%':
			return 2;
		case '(':
		case ')':
			return 3;
		default:
			return 0;
		}
	}

	public static void main(String[] args) {
		String s = "A*(B+C)-D/(E+F)";
		Stack stac = new Stack(s.length());
		for (int i = 0; i < s.length(); i++) {
			char currentValue = s.charAt(i);
			if (currentValue == '+' || currentValue == '-'
					|| currentValue == '*' || currentValue == '/') {
				if (stac.isEmpty()) {
					stac.push(currentValue);
				} else {
					int previousPrecedence = getPrecedence(stac.peek());
					int currentPrecedence = getPrecedence(currentValue);
					if (currentPrecedence > previousPrecedence) {
						stac.push(currentValue);
						continue;
					} else {
						System.out.print(currentValue);
					}
				}

			} else if (currentValue == '(') {
				stac.push(currentValue);
				continue;
			} else if (currentValue == ')') {
				char pop = stac.pop();
				while (pop != '(') {
					System.out.println(pop);
					pop = stac.pop();
				}
			}

			else {
				System.out.print(currentValue);
			}
		}
		while (!stac.isEmpty()) {
			System.out.print(stac.pop());
		}

	}
}
