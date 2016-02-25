package com.ravi.job;

import static org.junit.Assert.assertEquals;

import java.awt.geom.Point2D;

import org.junit.Test;

public class CoordinatesTest {

	@Test
	public void test_1() {
		Point2D result = new CoordinatesInspector().coordinates(1090.0,10000.0);
		System.out.println(result.getX());
		System.out.println(result.getY());
		assertEquals("Incorrect coordinates", new Point2D.Double(0.0, 1.0),
				result);
	}
}
