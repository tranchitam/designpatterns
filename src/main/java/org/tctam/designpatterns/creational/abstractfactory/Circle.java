package org.tctam.designpatterns.creational.abstractfactory;

public class Circle implements Shape {
	public static final String NAME = Circle.class.getName();

	public void draw() {
		System.out.println(NAME);
	}
}
