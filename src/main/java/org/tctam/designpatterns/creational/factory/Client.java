package org.tctam.designpatterns.creational.factory;

public class Client {

    public static void main(String args[]) {
        Color red = ColorFactory.getColor(RedColor.NAME);
        red.draw();
        
        Color green = ColorFactory.getColor(GreenColor.NAME);
        green.draw();
        
        Color blue = ColorFactory.getColor(BlueColor.NAME);
        blue.draw();
    }
}
