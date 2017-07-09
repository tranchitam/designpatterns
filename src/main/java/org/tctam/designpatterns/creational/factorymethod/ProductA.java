package org.tctam.designpatterns.creational.factorymethod;

public class ProductA implements Product {

	public static final String NAME = ProductA.class.getName();

	public void doSomething() {
		System.out.println(NAME);
	}
}