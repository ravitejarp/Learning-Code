package com.ravi.job;

public class SquareDigit {

	public int squareDigits(int n) {
		String s = String.valueOf(n);
		String newString = "";
		for (int i = 0; i < s.length(); i++) {
			int val = Character.getNumericValue(s.charAt(i))
					* Character.getNumericValue(s.charAt(i));
			newString = newString + String.valueOf(val);
		}
		int i = Integer.parseInt(newString);

		return i;
	}

	public static void main(String[] args) {
		double diff = 73323709 - 73319468;
		double d = 745635565 - 745631245;
		SquareDigit s = new SquareDigit();
//		String string = Double.toString(d / 360);
//		System.out.println(string.split("\\.")[1]);
//		System.out.println(Double.toString(diff / 360).split(".")[0]);
		System.out.println(s.getClass());
	}
}