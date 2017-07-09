package org.tctam.designpatterns.structural.filter;

import java.util.ArrayList;
import java.util.List;

public class Client {
	public static void main(String[] args) {
		List<User> users = new ArrayList<User>();
		users.add(new User("1", "MALE"));
		users.add(new User("2", "MALE"));
		users.add(new User("3", "FEMALE"));
		users.add(new User("4", "FEMALE"));

		Filter<User> male = new MaleFilter();
		Filter<User> female = new FemaleFilter();

		List<User> males = male.filter(users);
		List<User> females = female.filter(users);

		System.out.println(males);
		System.out.println(females);

		Filter<User> and = new AndFilter<User>(male, female);
		System.out.println(and.filter(users));

		Filter<User> or = new OrFilter<User>(male, female);
		System.out.println(or.filter(users));

	}
}
