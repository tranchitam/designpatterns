package org.tctam.designpatterns.creational.abstractfactory;

import java.util.HashMap;
import java.util.Map;

public class ProductFactoryProducer {
    private static Map<String, ProductFactory> productFactories = new HashMap<String, ProductFactory>();

    static {
        productFactories.put(ProductAFactory.NAME, new ProductAFactory());
        productFactories.put(ProductBFactory.NAME, new ProductBFactory());
    }

    public static ProductFactory getProductFactory(String name) {
        ProductFactory productFactory = productFactories.get(name);
        return productFactory;
    }
}
