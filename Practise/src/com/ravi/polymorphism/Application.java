package com.ravi.polymorphism;

public class Application {
	public static void drawShapes(Shape shape) {
		shape.draw();
	}

	public static void main(String[] args) {
		drawShapes(new Triangle());
		drawShapes(new Circle());
	}
}
