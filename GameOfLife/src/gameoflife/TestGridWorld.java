package gameoflife;

/**
 * The Game of Life
 * 
 * @author J. Hollingsworth
 */

import processing.core.PApplet;

public class TestGridWorld extends PApplet {
	
	private GridWorld world;
	private final int SIZE = 100;

	public void setup() {
		size(800, 600);
		frameRate(4);
		world = new GridWorld(this, SIZE, SIZE);
		world.randomize(.2f, world.BLACK);
		
		/*
		// blinker
		world.setColor(20, 20, world.BLACK);
		world.setColor(20, 21, world.BLACK);
		world.setColor(20, 22, world.BLACK);
		*/
	}

	public void draw() {
		
		// play the game of life
		for (int r = 1; r < SIZE - 1; r++) {
			for (int c = 1; c < SIZE - 1; c++) {
				
				// count alive neighbors
				int aliveCount = 0;
				for (int i = -1; i < 2; i++) {
					for (int j = -1; j < 2; j++) {
						if (i != 0 || j != 0) {
							if (world.getColor(r+i, c+j) == world.BLACK) {
								aliveCount++;
							}
						}
					}
				}
				
				// rule 1
				if (world.getColor(r, c) == world.BLACK && aliveCount < 2) {
					world.setColor(r, c, world.WHITE);
				} 
				
				// rule 2
				if (world.getColor(r, c) == world.BLACK && aliveCount >= 2 && aliveCount <= 3) {
					world.setColor(r, c, world.BLACK);
				} 
				
				// rule 3
				if (world.getColor(r, c) == world.BLACK && aliveCount > 3) {
					world.setColor(r, c, world.WHITE);
				}
				
				// rule 4
				if (world.getColor(r, c) == world.WHITE && aliveCount == 3) {
					world.setColor(r, c, world.BLACK);
				}
			}
		}
		
		// draw the world
		world.draw();
	}
}