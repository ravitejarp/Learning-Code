package com.ravi.spring;

public class TriangleObjectInjection {

	private Point pointA;
	private Point pointB;
	private Point pointC;

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public void draw() {
		System.out.println("Triangle drawn at:" + getPointA().getX() + ","
				+ getPointA().getY());
		System.out.println("Triangle drawn at:" + getPointB().getX() + ","
				+ getPointB().getY());
		System.out.println("Triangle drawn at:" + getPointC().getX() + ","
				+ getPointC().getY());
	}
}
