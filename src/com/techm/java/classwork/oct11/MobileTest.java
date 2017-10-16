package com.techm.java.classwork.oct11;

public class MobileTest {

	
	public static void main(String[] args) {
		
		
		MusicPlayerInterface music = new Mobile();
		music.playMusic();
		music.stopMusic();
		
		CameraInterface cam = new Mobile();
		cam.takePic();
		cam.takeVid();
		
		
		
		
	}
}
