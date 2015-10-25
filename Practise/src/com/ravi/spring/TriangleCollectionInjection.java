package com.ravi.spring;

import java.util.Iterator;
import java.util.List;

public class TriangleCollectionInjection {

	private List<Point> points;

	public void draw() {
		Iterator<Point> iterator = points.iterator();
		while (iterator.hasNext()) {
			Point next = iterator.next();
			System.out.println("Point:" + next.getX() + "," + next.getY());

		}
		System.out.println("Triangle is completed");
	}

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}
}
