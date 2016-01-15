package org.tctam.designpatterns.creational.abstractfactory;

public class ProductA2 implements ProductA {
    public static final String NAME = ProductA2.class.getSimpleName();

    public void operationA() {
        System.out.println(NAME);
    }
}
