package org.tctam.designpatterns.creational.singleton;

public class Singleton {
    public static final String NAME = Singleton.class.getSimpleName();
    private static Singleton instance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public void operation() {
        System.out.println(NAME);
    }
}
