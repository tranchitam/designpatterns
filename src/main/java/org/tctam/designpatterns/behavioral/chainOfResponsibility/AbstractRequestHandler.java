package org.tctam.designpatterns.behavioral.chainOfResponsibility;

public abstract class AbstractRequestHandler implements RequestHandler {
    protected RequestHandler nextRequestHandler;

    public void handleRequest(Request request) {
        if (canHandle(request)) {
            doHandleRequest(request);
        } else {
            System.out.println("Pass " + request + " to next handler: " + this.nextRequestHandler.getClass().getSimpleName());
            this.nextRequestHandler.handleRequest(request);
        }
    }

    public void setNextRequestHandler(RequestHandler nextRequestHandler) {
        this.nextRequestHandler = nextRequestHandler;
    }

    public abstract boolean canHandle(Request request);

    public abstract void doHandleRequest(Request request);

}
