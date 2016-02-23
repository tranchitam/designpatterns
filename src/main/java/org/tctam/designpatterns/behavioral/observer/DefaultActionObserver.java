package org.tctam.designpatterns.behavioral.observer;

public class DefaultActionObserver implements ActionObserver {

    private ActionObservable actionObservable;

    public DefaultActionObserver(ActionObservable actionObservable) {
        this.actionObservable = actionObservable;
        this.actionObservable.addActionObserver(this);
    }

    public void actionPerformed(ActionEvent event) {
        System.out.println(DefaultActionObserver.class.getSimpleName() + ": " + event + " event is fired");
    }

    public ActionEvent getType() {
        return ActionEvent.DEFAULT;
    }
}
