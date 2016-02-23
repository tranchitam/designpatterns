package org.tctam.designpatterns.behavioral.chainOfResponsibility;

public class Level2RequestHandler extends AbstractRequestHandler {
    private final int level = 2;

    @Override
    public boolean canHandle(Request request) {
        return request.getLevel() <= level;
    }

    @Override
    public void doHandleRequest(Request request) {
        System.out.println(Level2RequestHandler.class.getSimpleName() + ": handled request " + request);
    }

}
