package org.tctam.designpatterns.creational.builder;

public class MealBuilder {
	public Meal prepareBurgerMeal() {
		Meal m = new Meal();
		m.addItem(new Burger());
		return m;
	}

	public Meal prepareColddrinkMeal() {
		Meal m = new Meal();
		m.addItem(new Colddrink());
		return m;
	}
}
