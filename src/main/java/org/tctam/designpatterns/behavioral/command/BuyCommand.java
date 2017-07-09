package org.tctam.designpatterns.behavioral.command;

public class BuyCommand implements Command {

	private Request request;

	public BuyCommand(Request r) {
		request = r;
	}

	public void execute() {
		request.buy();
	}
}
