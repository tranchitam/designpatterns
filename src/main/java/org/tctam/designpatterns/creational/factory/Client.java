package org.tctam.designpatterns.creational.factory;

public class Client {
	public static void main(String[] args) {
		Color red = ColorFactory.getColor(RedColor.NAME);
		red.fill();

		Color green = ColorFactory.getColor(GreenColor.NAME);
		green.fill();

		Color blue = ColorFactory.getColor(BlueColor.NAME);
		blue.fill();
	}
}