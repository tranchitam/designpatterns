package org.tctam.designpatterns.creational.abstractfactory;

public class ProductB2 implements ProductB {
    public static final String NAME = ProductB2.class.getSimpleName();

    public void operationB() {
        System.out.println(NAME);
    }
}
