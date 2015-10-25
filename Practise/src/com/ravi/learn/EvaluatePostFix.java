//package com.ravi.learn;
//
//public class EvaluatePostFix {
//
//	public static void main(String[] args) {
//		String s = "345+*612+/-";
//		Stack st = new Stack(s.length());
//		for (int i = 0; i < s.length(); i++) {
//			char charAt = s.charAt(i);
//			if (s.charAt(i) == '+' || s.charAt(i) == '-' || s.charAt(i) == '*'
//					|| s.charAt(i) == '/') {
//				int fist = st.pop();
//				int second = st.pop();
//				switch (charAt) {
//				case '+':
//					st.push(fist + second);
//					break;
//				case '-':
//					st.push(fist - second);
//					break;
//				case '*':
//					st.push(fist * second);
//					break;
//				case '/':
//					st.push(fist / second);
//					break;
//
//				}
//
//			} else {
//				System.out.println(charAt);
//				st.push(int)(charAt-'0');
//			}
//		}
//
//		System.out.println(st.pop());
//	}
//}
