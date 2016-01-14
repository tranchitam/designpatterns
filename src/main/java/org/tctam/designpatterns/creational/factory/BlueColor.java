package org.tctam.designpatterns.creational.factory;

public class BlueColor implements Color {
    public static final String NAME = BlueColor.class.getSimpleName();

    public void draw() {
        System.out.println(NAME);
    }
}
