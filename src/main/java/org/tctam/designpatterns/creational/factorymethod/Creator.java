package org.tctam.designpatterns.creational.factorymethod;

public abstract class Creator {
	
	public void doSomething() {
		Product p = getProduct();
		p.doSomething();
	}

	public abstract Product getProduct();
}
