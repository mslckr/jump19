package com.collabora.wordGame;

public class WordTestThreads {
	public static void main(String[] args) {
		Runnable getTiles = new GetTheTiles();
		
		Runnable getTilesAgain = new GetTheTiles();
		
		new Thread(getTiles).start();
		new Thread(getTilesAgain).start();
	}
}
