package org.tctam.designpatterns.creational.abstractfactory;

public interface AbstractFactory {
	public Shape getShape(String name);

	public Color getColor(String name);
}