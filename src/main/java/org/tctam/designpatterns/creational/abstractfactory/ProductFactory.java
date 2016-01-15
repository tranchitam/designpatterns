package org.tctam.designpatterns.creational.abstractfactory;

public interface ProductFactory {
    public abstract ProductA getProductA(String name);

    public abstract ProductB getProductB(String name);

}
