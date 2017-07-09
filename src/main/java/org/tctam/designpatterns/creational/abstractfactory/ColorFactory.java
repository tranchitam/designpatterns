package org.tctam.designpatterns.creational.abstractfactory;

import java.util.HashMap;
import java.util.Map;

public class ColorFactory implements AbstractFactory{
	public static final String NAME = ColorFactory.class.getName();

	private Map<String, Class> colors = new HashMap<String, Class>();

	{
		colors.put(RedColor.NAME, RedColor.class);
		colors.put(GreenColor.NAME, GreenColor.class);
		colors.put(BlueColor.NAME, BlueColor.class);
	}

	public Color getColor(String name) {
		Color color = null;
		Class c = colors.get(name);
		try {
			color = (Color) c.newInstance();
		} catch (InstantiationException e) {

		} catch (IllegalAccessException e) {

		}
		return color;
	}

	public Shape getShape(String name) {
		return null;
	}
}
