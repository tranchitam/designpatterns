package org.tctam.designpatterns.creational.factorymethod;

public class Client {
    public static void main(String[] args) {
        Creator creatorA = new ProductACreator();
        creatorA.doOperation();

        Creator creatorB = new ProductBCreator();
        creatorB.doOperation();
    }
}
