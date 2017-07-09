package org.tctam.designpatterns.creational.singleton;

public class Client {
	public static void main(String[] args) {
		Singleton.getInstance().doSomething();
	}
}