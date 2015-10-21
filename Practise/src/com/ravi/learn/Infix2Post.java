package com.ravi.learn;

public class Infix2Post {

	public static void main(String[] args) {
		int currentPrecedence = 0;
		int nextPrecedence = 0;
		String s = "A+B*(C-D)";
		Stack st = new Stack(s.length());
		for (int i = 0; i < s.length(); i++) {
			char charAt = s.charAt(i);
			if (charAt == '%' || charAt == '+' || charAt == '*'
					|| charAt == '/') {
				if (st.isEmpty()) {
					st.push(charAt);
				} else {
					char peek = st.peek();
					currentPrecedence = getPrecedence(charAt);
					nextPrecedence = getPrecedence(peek);
					if (currentPrecedence < nextPrecedence) {
						st.push(charAt);
					}
					else{
						while(currentPrecedence < nextPrecedence){
							st.pop();
						}
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
	}

	public static int getPrecedence(char c) {
		switch (c) {
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
		case '%':
			return 2;
		default:
			return 0;
		}
	}

}
