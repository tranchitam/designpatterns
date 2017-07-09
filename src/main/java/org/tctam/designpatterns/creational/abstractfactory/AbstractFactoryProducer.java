package org.tctam.designpatterns.creational.abstractfactory;

import java.util.HashMap;
import java.util.Map;

public class AbstractFactoryProducer {
	public static final String NAME = AbstractFactoryProducer.class.getName();

	private static Map<String, AbstractFactory> factories = new HashMap<String, AbstractFactory>();

	static {
		factories.put(ShapeFactory.NAME, new ShapeFactory());
		factories.put(ColorFactory.NAME, new ColorFactory());
	}

	public static AbstractFactory getFactory(String name) {
		return factories.get(name);
	}
}