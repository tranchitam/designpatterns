package org.tctam.designpatterns.structural.adapter;

public class VlcPlayer implements AdvanceMediaPlayer {

	public static final String NAME = VlcPlayer.class.getName();

	public void playVlc(String file) {
		System.out.println(NAME);
	}

	public void playMp4(String file) {
		throw new UnsupportedOperationException();
	}
}
