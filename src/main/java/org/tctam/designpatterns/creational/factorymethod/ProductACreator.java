package org.tctam.designpatterns.creational.factorymethod;

public class ProductACreator extends Creator {

	@Override
	public Product getProduct() {
		return new ProductA();
	}
}
