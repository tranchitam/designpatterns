package org.tctam.designpatterns.structural.filter;

import java.util.ArrayList;
import java.util.List;

public class FemaleFilter implements Filter<User> {

	public List<User> filter(List<User> list) {
		List<User> users = new ArrayList<User>();
		for (User user : list) {
			if (user.getGender().equals("FEMALE")) {
				users.add(user);
			}
		}
		return users;
	}
}
