package org.tctam.designpatterns.creational.builder;

public class Burger implements Item {
	public static final String NAME = Burger.class.getName();

	public String name() {
		return NAME;
	}

	public Packing packing() {
		return new Wrapper();
	}

	public float price() {
		return 1.2f;
	}
}
