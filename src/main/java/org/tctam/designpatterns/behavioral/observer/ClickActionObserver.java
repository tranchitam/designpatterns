package org.tctam.designpatterns.behavioral.observer;

public class ClickActionObserver implements ActionObserver {

    private ActionObservable actionObservable;

    public ClickActionObserver(ActionObservable actionObservable) {
        this.actionObservable = actionObservable;
        this.actionObservable.addActionObserver(this);
    }

    public void actionPerformed(ActionEvent event) {
        System.out.println(ClickActionObserver.class.getSimpleName() + ": " + event + " event is fired");
    }

    public ActionEvent getType() {
        return ActionEvent.CLICK;
    }
}
