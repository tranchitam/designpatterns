package org.tctam.designpatterns.behavioral.observer;

public interface ActionObserver {
    public abstract ActionEvent getType();

    public abstract void actionPerformed(ActionEvent event);
}
