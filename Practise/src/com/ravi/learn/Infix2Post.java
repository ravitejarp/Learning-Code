package com.ravi.learn;

public class Infix2Post {
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
		int currentPrecedence = 0;
		int previousPrecedence = 0;
//		 String s = "A+B*(C-D)";
//		String s = "A+B*C";
		
		 String s = "A+B-C";
		Stack st = new Stack(s.length());
		for (int i = 0; i < s.length(); i++) {
			char charAt = s.charAt(i);
			if (charAt == '%' || charAt == '+' || charAt == '*'
					|| charAt == '/' || charAt == '-') {
				if (st.isEmpty()) {
					st.push(charAt);
				} else {
					char peek = st.peek();
					currentPrecedence = getPrecedence(charAt);
					previousPrecedence = getPrecedence(peek);
					if (currentPrecedence >= previousPrecedence) {
						if (i + 2 < s.length()) {
							char charAt2 = s.charAt(i + 2);
							if (getPrecedence(charAt2) >= getPrecedence(charAt)) {
								st.push(charAt);
							} else if (getPrecedence(charAt2) == 0) {
								st.push(charAt);
							} else {
								System.out.print(charAt);
							}
						} else
							System.out.print(charAt);
					} else {
						st.push(charAt);
					}
				}

			} else if (charAt == '(') {
				st.push(charAt);
			} else if (charAt == ')') {
				char pop = st.pop();
				while (pop != '(') {
					System.out.print(pop);
					pop = st.pop();
				}
			} else {
				System.out.print(charAt);
			}
		}
		while (!st.isEmpty()) {
			System.out.print(st.pop());
		}
	}

}
