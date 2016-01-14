package org.tctam.designpatterns.creational.factory;

public class RedColor implements Color {
    public static final String NAME = RedColor.class.getSimpleName();

    public void draw() {
        System.out.println(NAME);
    }
}
