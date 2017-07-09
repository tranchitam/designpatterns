package org.tctam.designpatterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class ShapeCache {
	private static Map<String, Shape> shapes = new HashMap<String, Shape>();

	public static void loadCache() {
		Shape c = new Circle();
		c.setId("1");

		Shape r = new Rectangle();
		r.setId("2");

		shapes.put(c.getId(), c);
		shapes.put(r.getId(), r);
	}

	public static Shape getShape(String id) {
		Shape s = shapes.get(id);
		return s.clone();
	}
}
