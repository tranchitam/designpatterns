package org.tctam.designpatterns.creational.factorymethod;

public class ProductB implements Product {

	public static final String NAME = ProductB.class.getName();

	public void doSomething() {
		System.out.println(NAME);
	}
}