package org.tctam.designpatterns.creational.abstractfactory;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory implements AbstractFactory {
	public static final String NAME = ShapeFactory.class.getName();

	private Map<String, Class> shapes = new HashMap<String, Class>();

	{
		shapes.put(Rectangle.NAME, Rectangle.class);
		shapes.put(Circle.NAME, Circle.class);
	}

	public Shape getShape(String name) {
		Shape s = null;
		Class c = shapes.get(name);
		try {
			s = (Shape) c.newInstance();
		} catch (InstantiationException e) {

		} catch (IllegalAccessException e) {

		}
		return s;
	}

	public Color getColor(String name) {
		return null;
	}
}
