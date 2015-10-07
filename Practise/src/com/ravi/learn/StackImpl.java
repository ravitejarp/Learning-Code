package com.ravi.learn;

public class StackImpl {

	public static void main(String[] args) {

		String toSend = "This is a reverse";
		Stack s = new Stack(toSend.length());
		for (int i = 0; i < toSend.length(); i++) {
			s.push(toSend.charAt(i));
		}
		s.display();

		String delim = "a{b(c]d}e";
		Stack s1 = new Stack(delim.length());
		for (int i = 0; i < delim.length(); i++) {
			switch (delim.charAt(i)) {
			case '{':
			case '[':
			case '(':
				s1.push(delim.charAt(i));
				break;

			case '}':
			case ']':
			case ')':
				char pop = s1.pop();
				if ((pop == '{' && delim.charAt(i) != '}')
						|| (pop == '(' && delim.charAt(i) != ')')
						|| (pop == '[' && delim.charAt(i) != ']')) {
					System.out.println();
					System.out.println("Error at:" + i);
				}
				break;
			}
		}
	}

}
