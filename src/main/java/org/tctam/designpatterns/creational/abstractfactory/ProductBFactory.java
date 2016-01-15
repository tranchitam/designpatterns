package org.tctam.designpatterns.creational.abstractfactory;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("rawtypes")
public class ProductBFactory implements ProductFactory {
    public static final String NAME = ProductBFactory.class.getSimpleName();

    private Map<String, Class> productsB = new HashMap<String, Class>();

    {
        productsB.put(ProductB1.NAME, ProductB1.class);
        productsB.put(ProductB2.NAME, ProductB2.class);
    }

    public ProductA getProductA(String name) {
        return null;
    }

    public ProductB getProductB(String name) {
        Class productBClass = productsB.get(name);
        ProductB productB = null;
        try {
            productB = (ProductB) productBClass.newInstance();
        } catch (InstantiationException e) {

        } catch (IllegalAccessException e) {

        }
        return productB;
    }

}
