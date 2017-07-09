package org.tctam.designpatterns.creational.factory;

public class GreenColor implements Color {
	public static final String NAME = GreenColor.class.getName();

	public void fill() {
		System.out.println(NAME);
	}
}