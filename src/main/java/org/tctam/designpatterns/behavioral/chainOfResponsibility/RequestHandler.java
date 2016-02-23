package org.tctam.designpatterns.behavioral.chainOfResponsibility;

public interface RequestHandler {
    public void handleRequest(Request request);

    public void setNextRequestHandler(RequestHandler nextRequestHandler);
}
