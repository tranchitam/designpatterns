package org.tctam.designpatterns.creational.abstractfactory;

public class Client {
  public static void main(String args[]) {
    AbstractFactory colorFactory = AbstractFactoryProducer.getFactory(ColorFactory.NAME);
    Color blue = colorFactory.getColor(BlueColor.NAME);
    System.out.println(blue.toString());

    AbstractFactory shapeFactory = AbstractFactoryProducer.getFactory(ShapeFactory.NAME);
    Shape circle = shapeFactory.getShape(Circle.NAME);
    System.out.println(circle.toString());
  }
}
