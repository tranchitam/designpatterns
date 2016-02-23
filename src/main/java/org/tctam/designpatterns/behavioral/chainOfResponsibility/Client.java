package org.tctam.designpatterns.behavioral.chainOfResponsibility;

public class Client {
    public static void main(String[] args) {
        RequestHandler level1RequestHandler = new Level1RequestHandler();
        RequestHandler level2RequestHandler = new Level2RequestHandler();
        RequestHandler level3RequestHandler = new Level3RequestHandler();

        level1RequestHandler.setNextRequestHandler(level2RequestHandler);
        level2RequestHandler.setNextRequestHandler(level3RequestHandler);

        Request requestLevel1 = new Request(1);
        level1RequestHandler.handleRequest(requestLevel1);

        Request requestLevel2 = new Request(2);
        level1RequestHandler.handleRequest(requestLevel2);

        Request requestLevel3 = new Request(3);
        level1RequestHandler.handleRequest(requestLevel3);
    }
}
