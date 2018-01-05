package dev.vall.hunted;

import dev.vall.hunted.display.Display;

public class Launcher {
	
	public static void main(String[]args) {
		Game game = new Game("HUNted game", 640, 360);
		game.start();
	}

}
