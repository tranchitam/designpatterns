package org.tctam.designpatterns.creational.builder;

public class Wrapper implements Packing {
	public static final String NAME = Wrapper.class.getName();

	public void pack() {
		System.out.println(NAME);
	}
}
