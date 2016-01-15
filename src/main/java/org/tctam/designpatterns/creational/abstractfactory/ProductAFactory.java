package org.tctam.designpatterns.creational.abstractfactory;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("rawtypes")
public class ProductAFactory implements ProductFactory {
    public static final String NAME = ProductAFactory.class.getSimpleName();

    private Map<String, Class> productsA = new HashMap<String, Class>();

    {
        productsA.put(ProductA1.NAME, ProductA1.class);
        productsA.put(ProductA2.NAME, ProductA2.class);
    }

    public ProductA getProductA(String name) {
        Class productAClass = productsA.get(name);
        ProductA productA = null;
        try {
            productA = (ProductA) productAClass.newInstance();
        } catch (InstantiationException e) {

        } catch (IllegalAccessException e) {

        }
        return productA;
    }

    public ProductB getProductB(String name) {
        return null;
    }

}
