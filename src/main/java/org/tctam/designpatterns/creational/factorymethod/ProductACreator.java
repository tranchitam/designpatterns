package org.tctam.designpatterns.creational.factorymethod;

public class ProductACreator extends Creator{

    protected Product getProduct() {
       return new ProductA();
    }

}
