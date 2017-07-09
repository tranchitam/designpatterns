package org.tctam.designpatterns.creational.prototype;

public abstract class Shape implements Cloneable {
	private String id;

	public abstract void draw();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Shape clone() {
		Shape clone = null;
		try {
			clone = (Shape) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}
}
