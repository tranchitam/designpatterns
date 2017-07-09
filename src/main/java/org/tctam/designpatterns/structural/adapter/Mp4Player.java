package org.tctam.designpatterns.structural.adapter;

public class Mp4Player implements AdvanceMediaPlayer {

	public static final String NAME = Mp4Player.class.getName();

	public void playVlc(String file) {
		throw new UnsupportedOperationException();
	}

	public void playMp4(String file) {
		System.out.println(NAME);
	}
}