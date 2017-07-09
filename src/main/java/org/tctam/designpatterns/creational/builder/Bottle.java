package org.tctam.designpatterns.creational.builder;

public class Bottle implements Packing {
	public static final String NAME = Bottle.class.getName();

	public void pack() {
		System.out.println(NAME);
	}
}
