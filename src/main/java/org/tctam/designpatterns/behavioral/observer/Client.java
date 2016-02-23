package org.tctam.designpatterns.behavioral.observer;

@SuppressWarnings("unused")
public class Client {

    public static void main(String[] args) {
        ActionObservable actionObservable = new ActionObservable();
        ActionObserver defaultActionObserver = new DefaultActionObserver(actionObservable);
        ActionObserver clickActionObserver = new ClickActionObserver(actionObservable);
        ActionObserver mouseDownActionObserver = new MouseDownActionObserver(actionObservable);

        // 2 events are fired
        actionObservable.doDefault();
        // 1 event is fired
        actionObservable.doClick();
        // 1 event is fired
        actionObservable.doMouseDown();
    }

}
