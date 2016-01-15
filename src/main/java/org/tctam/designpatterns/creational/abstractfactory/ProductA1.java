package org.tctam.designpatterns.creational.abstractfactory;

public class ProductA1 implements ProductA {
    public static final String NAME = ProductA1.class.getSimpleName();

    public void operationA() {
        System.out.println(NAME);
    }
}
