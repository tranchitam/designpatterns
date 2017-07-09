package org.tctam.designpatterns.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class Broker {
	private List<Command> commands = new ArrayList<Command>();

	public void addComamnd(Command c) {
		commands.add(c);
	}

	public void execute() {
		for (Command c : commands) {
			c.execute();
		}
	}
}