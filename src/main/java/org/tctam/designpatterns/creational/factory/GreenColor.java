package org.tctam.designpatterns.creational.factory;

public class GreenColor implements Color {
    public static final String NAME = GreenColor.class.getSimpleName();

    public void draw() {
        System.out.println(NAME);
    }
}
