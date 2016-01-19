package org.tctam.designpatterns.creational.factorymethod;

public class ProductBCreator extends Creator{
    
    protected Product getProduct() {
       return new ProductB();
    }

}
