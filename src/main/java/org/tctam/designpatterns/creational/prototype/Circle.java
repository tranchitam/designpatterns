package org.tctam.designpatterns.creational.prototype;

public class Circle extends Shape {
	public static final String NAME = Circle.class.getName();

	@Override
	public void draw() {
		System.out.println(NAME);
	}
}
