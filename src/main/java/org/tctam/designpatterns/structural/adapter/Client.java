package org.tctam.designpatterns.structural.adapter;

public class Client {
	public static void main(String[] args) {
		MediaPlayer player = new AudioPlayer();
		player.play("mp3", "FILE.mp3");
		player.play("mp4", "FILE.mp4");
		player.play("vlc", "FILE.vlc");
	}
}
