package org.tctam.designpatterns.creational.factorymethod;

public abstract class Creator {

    public void doOperation() {
        Product product = getProduct();
        product.doOperation();
    }

    protected abstract Product getProduct();
}
