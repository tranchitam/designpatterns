package org.tctam.designpatterns.structural.adapter;

public class MediaAdapter implements MediaPlayer {
	private AdvanceMediaPlayer player;

	public MediaAdapter(String type) {
		if (type.equals("mp4")) {
			player = new Mp4Player();
		} else {
			player = new VlcPlayer();
		}
	}

	public void play(String type, String file) {
		if (type.equals("vlc")) {
			player.playVlc(file);
		} else if (type.equals("mp4")) {
			player.playMp4(file);
		}
	}
}
