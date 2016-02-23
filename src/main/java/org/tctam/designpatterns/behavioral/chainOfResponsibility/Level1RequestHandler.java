package org.tctam.designpatterns.behavioral.chainOfResponsibility;

public class Level1RequestHandler extends AbstractRequestHandler {
    private final int level = 1;
    
    @Override
    public boolean canHandle(Request request) {
        return request.getLevel() <= level;
    }

    @Override
    public void doHandleRequest(Request request) {
        System.out.println(Level1RequestHandler.class.getSimpleName() + ": handled request " + request);
    }

}
