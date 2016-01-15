package org.tctam.designpatterns.creational.abstractfactory;

public class Client {
    public static void main(String args[]) {
        ProductFactory productAFactory = ProductFactoryProducer.getProductFactory(ProductAFactory.NAME);
        ProductA productA1 = productAFactory.getProductA(ProductA1.NAME);
        productA1.operationA();
        ProductA productA2 = productAFactory.getProductA(ProductA2.NAME);
        productA2.operationA();
        
        ProductFactory productBFactory = ProductFactoryProducer.getProductFactory(ProductBFactory.NAME);
        ProductB productB1 = productBFactory.getProductB(ProductB1.NAME);
        productB1.operationB();
        ProductB productB2 = productBFactory.getProductB(ProductB2.NAME);
        productB2.operationB();
    }
}
