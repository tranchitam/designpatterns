package org.tctam.designpatterns.behavioral.chainOfResponsibility;

public class Request {
    private int level;

    public Request(int level) {
        super();
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "[Request level: " + level + "]";
    }
}
