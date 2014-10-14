package tv;

import processing.core.PApplet;


public class TV extends PApplet {

	private final int SIZE = 20;

	public void setup() {
		size(500, 500);
		smooth();
		noStroke();
	}

	public void draw() {

		for (int y = 0; y < height; y += SIZE) {
			// draw a row of boxes
			for (int x = 0; x < width; x += SIZE) {
				int alpha = (int)(Math.random() * 256);
				int red = (int)(Math.random() * 256);
				int green = (int)(Math.random() * 256);
				int blue = (int)(Math.random() * 256);
				//fill(red, green, blue, alpha);
				fill(red, red, red, red);
				rect(x, y, SIZE, SIZE);
			}
		}


	}
}
