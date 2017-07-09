package org.tctam.designpatterns.creational.factorymethod;
public class Client {
	public static void main(String[] args) {
		Creator a = new ProductACreator();
		a.doSomething();
		
		Creator b = new ProductBCreator();
		b.doSomething();
	}
}
