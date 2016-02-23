package org.tctam.designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class ActionObservable {
    private List<ActionObserver> actionObservers;
    private ActionEvent event;

    public ActionObservable() {
        actionObservers = new ArrayList<ActionObserver>();
        event = ActionEvent.DEFAULT;
    }

    public void addActionObserver(ActionObserver observer) {
        actionObservers.add(observer);
    }

    public void removeActionObserver(ActionEvent observer) {
        actionObservers.remove(observer);
    }

    public void notifyAllListeners() {
        for (ActionObserver listener : actionObservers) {
            listener.actionPerformed(event);
        }
    }

    public void notifyTargetListeners() {
        for (ActionObserver observer : actionObservers) {
            if (observer.getType() == event) {
                observer.actionPerformed(event);
            }
        }
    }

    public void doDefault() {
        event = ActionEvent.DEFAULT;
        notifyAllListeners();
    }

    public void doClick() {
        event = ActionEvent.CLICK;
        notifyTargetListeners();
    }

    public void doMouseDown() {
        event = ActionEvent.MOUSE_DOWN;
        notifyTargetListeners();
    }
}
