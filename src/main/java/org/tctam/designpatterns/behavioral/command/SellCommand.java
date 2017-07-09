package org.tctam.designpatterns.behavioral.command;

public class SellCommand implements Command {

	private Request request;

	public SellCommand(Request r) {
		request = r;
	}

	public void execute() {
		request.sell();
	}
}
