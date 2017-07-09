package org.tctam.designpatterns.creational.builder;

public class Colddrink implements Item {
	public static final String NAME = Colddrink.class.getName();

	public String name() {
		return NAME;
	}

	public Packing packing() {
		return new Bottle();
	}

	public float price() {
		return 2.1f;
	}
}