package org.tctam.designpatterns.creational.abstractfactory;

public class Rectangle implements Shape {
	public static final String NAME = Rectangle.class.getName();

	public void draw() {
		System.out.println(NAME);
	}
}
