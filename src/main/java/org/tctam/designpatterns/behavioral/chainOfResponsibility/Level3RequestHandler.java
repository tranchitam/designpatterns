package org.tctam.designpatterns.behavioral.chainOfResponsibility;

public class Level3RequestHandler extends AbstractRequestHandler {
    private final int level = 3;

    @Override
    public boolean canHandle(Request request) {
        return request.getLevel() <= level;
    }

    @Override
    public void doHandleRequest(Request request) {
        System.out.println(Level3RequestHandler.class.getSimpleName() + ": handled request " + request);
    }

}
