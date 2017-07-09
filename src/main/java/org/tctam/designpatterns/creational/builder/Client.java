package org.tctam.designpatterns.creational.builder;

public class Client {
	public static void main(String[] args) {
		MealBuilder mb = new MealBuilder();

		Meal bm = mb.prepareBurgerMeal();
		Meal cd = mb.prepareColddrinkMeal();

		System.out.println(bm.totalPrice());
		System.out.println(cd.totalPrice());
	}
}