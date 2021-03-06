package org.tctam.designpatterns.creational.factory;

import java.util.HashMap;
import java.util.Map;

public class ColorFactory {
	private static final Map<String, Class> colors = new HashMap<String, Class>();
	static {
		colors.put(RedColor.NAME, RedColor.class);
		colors.put(GreenColor.NAME, GreenColor.class);
		colors.put(BlueColor.NAME, BlueColor.class);
	}

	public static Color getColor(String name) {
		Color color = null;
		Class c = colors.get(name);
		try {
			color = (Color) c.newInstance();
		} catch (InstantiationException e) {

		} catch (IllegalAccessException e) {

		}
		return color;
	}
}
