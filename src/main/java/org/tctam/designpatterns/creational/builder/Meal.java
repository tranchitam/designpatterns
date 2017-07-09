package org.tctam.designpatterns.creational.builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {
	private List<Item> items;

	public Meal() {
		items = new ArrayList<Item>();
	}

	public void addItem(Item item) {
		items.add(item);
	}

	public float totalPrice() {
		float total = 0.0f;
		for (Item item : items) {
			total += item.price();
		}
		return total;
	}
}
