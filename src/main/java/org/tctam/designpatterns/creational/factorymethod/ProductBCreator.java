package org.tctam.designpatterns.creational.factorymethod;

public class ProductBCreator extends Creator {

	@Override
	public Product getProduct() {
		return new ProductB();
	}
}
