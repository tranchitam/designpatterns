package org.tctam.designpatterns.structural.adapter;

public class AudioPlayer implements MediaPlayer {
	private MediaAdapter mediaAdapter;

	public void play(String type, String file) {
		if (type.equals("mp3")) {
			System.out.println("Play mp3 file");
		} else if (type.equals("mp4") || type.equals("vlc")) {
			mediaAdapter = new MediaAdapter(type);
			mediaAdapter.play(type, file);
		}
	}
}