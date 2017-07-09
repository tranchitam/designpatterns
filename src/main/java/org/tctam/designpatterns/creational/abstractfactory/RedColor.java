package org.tctam.designpatterns.creational.abstractfactory;

public class RedColor implements Color {
	public static final String NAME = RedColor.class.getName();

	public void fill() {
		System.out.println(NAME);
	}
}
