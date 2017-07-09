package org.tctam.designpatterns.behavioral.command;

public class Client {
	public static void main(String[] args) {
		Request r = new Request();

		Command buy = new BuyCommand(r);
		Command sell = new SellCommand(r);

		Broker b = new Broker();
		b.addComamnd(buy);
		b.addComamnd(sell);

		b.execute();
	}
}
