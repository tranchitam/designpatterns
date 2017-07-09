package org.tctam.designpatterns.creational.prototype;

public class Client {
	public static void main(String[] args) {
		ShapeCache.loadCache();
		Shape c = ShapeCache.getShape("1");
		c.draw();

		Shape r = ShapeCache.getShape("2");
		r.draw();
	}
}