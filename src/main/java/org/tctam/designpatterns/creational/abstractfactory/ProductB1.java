package org.tctam.designpatterns.creational.abstractfactory;

public class ProductB1 implements ProductB {
    public static final String NAME = ProductB1.class.getSimpleName();

    public void operationB() {
        System.out.println(NAME);
    }
}
