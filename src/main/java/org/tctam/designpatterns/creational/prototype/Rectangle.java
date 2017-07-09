package org.tctam.designpatterns.creational.prototype;

public class Rectangle extends Shape {
	public static final String NAME = Rectangle.class.getName();

	@Override
	public void draw() {
		System.out.println(NAME);
	}
}
