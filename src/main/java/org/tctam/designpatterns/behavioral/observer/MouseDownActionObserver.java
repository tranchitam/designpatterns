package org.tctam.designpatterns.behavioral.observer;

public class MouseDownActionObserver implements ActionObserver {

    private ActionObservable actionObservable;

    public MouseDownActionObserver(ActionObservable actionObservable) {
        this.actionObservable = actionObservable;
        this.actionObservable.addActionObserver(this);
    }

    public void actionPerformed(ActionEvent event) {
        System.out.println(MouseDownActionObserver.class.getSimpleName() + ": " + event + " event is fired");
    }

    public ActionEvent getType() {
        return ActionEvent.MOUSE_DOWN;
    }
}
