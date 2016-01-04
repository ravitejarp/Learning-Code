package com.ravi.job;

public class OverLapRectangles {
	public static boolean doOverlap(Point l1, Point r1, Point l2, Point r2) {
		if ((l1.getY() > l2.getY() && l2.getY() > r1.getY())
				&& (l1.getX() < l2.getX() && l2.getX() < r1.getX())) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Point l1 = new Point(0, 10);
		Point r1 = new Point(10, 0);
		Point l2 = new Point(5, 5);
		Point r2 = new Point(15, 0);
		System.out.println(doOverlap(l1, r1, l2, r2));
	}
}
