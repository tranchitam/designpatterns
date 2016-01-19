package org.tctam.designpatterns.creational.factorymethod;

public class ProductB implements Product {
    public static final String NAME = ProductB.class.getSimpleName();

    public void doOperation() {
        System.out.println(NAME);
    }

}
