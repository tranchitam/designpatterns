package org.tctam.designpatterns.creational.factory;

public class BlueColor implements Color {
	public static final String NAME = BlueColor.class.getName();

	public void fill() {
		System.out.println(NAME);
	}
}
