package org.tctam.designpatterns.structural.filter;

import java.util.ArrayList;
import java.util.List;

public class MaleFilter implements Filter<User> {

	public List<User> filter(List<User> list) {
		List<User> users = new ArrayList<User>();
		for (User user : list) {
			if (user.getGender().equals("MALE")) {
				users.add(user);
			}
		}
		return users;
	}
}
