package com.ravi.datastructures;

public class WellFormed {
	Stack<Character> stac = new Stack<>();

	public boolean isWelformed(String param) {
		for (int i = 0; i < param.length(); i++) {
			char character = param.charAt(i);
			if (character == ')' || character == ']' || character == '}') {
				try {
					switch (character) {
					case ')':
						if (stac.pop() != '(') {

						}
						break;
					case ']':
						if (stac.pop() != '[') {

						}
						break;
					case '}':
						if (stac.pop() != '{') {

						}
						break;
					}

				} catch (StackEmptyException e) {
					// TODO Auto-generated catch block
					System.out.println("Empty");
					return false;
				}

			} else {
				if (character == '+' || character == '-' || character == '*'
						|| character == '/' || character == '('
						|| character == '{' || character == '[') {
					stac.push(character);
				}
			}
		}

		return stac.isEmpty();
	}

	public static void main(String[] args) {
		WellFormed check = new WellFormed();
		System.out.println(check.isWelformed("(ABC){DEF}[XYZ(LMN)]{}"));
	}
}
