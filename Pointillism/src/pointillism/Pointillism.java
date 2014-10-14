package pointillism;

import java.io.File;

import processing.core.PApplet;
import processing.core.PImage;


public class Pointillism extends PApplet {
	
	private PImage img;
	private boolean fileLoaded = false;
	
	private final int SIZE = 10;

	public void setup() {
		smooth();
		noStroke();
		selectInput("Select an image file", "fileSelected");
	}
	
	public void fileSelected(File selection) {
		img = loadImage(selection.getAbsolutePath());
		size(img.width, img.height);
		fileLoaded = true;
	}

	public void draw() {
		if (fileLoaded) {
			img.loadPixels();
			int x = (int) (Math.random() * img.width);
			int y = (int) (Math.random() * img.height);
			int loc = x + y * img.width;
			int r = (int) red(img.pixels[loc]);
			int g = (int) green(img.pixels[loc]);
			int b = (int) blue(img.pixels[loc]);
			int a = 128; //(int) alpha(img.pixels[loc]);
			
			fill(r, g, b, a);
			ellipse(x, y, SIZE, SIZE);
		}
	}
}





