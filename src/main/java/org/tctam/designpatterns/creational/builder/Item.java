package org.tctam.designpatterns.creational.builder;

public interface Item {
	public abstract String name();

	public abstract Packing packing();

	public abstract float price();
}
