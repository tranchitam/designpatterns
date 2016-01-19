package org.tctam.designpatterns.creational.factorymethod;

public class ProductA implements Product {
    public static final String NAME = ProductA.class.getSimpleName();

    public void doOperation() {
        System.out.println(NAME);
    }

}
