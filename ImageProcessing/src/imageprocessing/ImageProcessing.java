package imageprocessing;

import java.io.File;

import processing.core.PApplet;
import processing.core.PImage;


public class ImageProcessing extends PApplet {

	private PImage img;
	private boolean fileLoaded = false;

	public void setup() {
		selectInput("Select a file to process:", "fileSelected");
	}

	public void fileSelected(File selection) {
		img = loadImage(selection.getAbsolutePath());
		size(img.width, img.height);
		fileLoaded = true;
	}

	public void tintRed() {
		loadPixels(); // messing with pixels in the canvas
		img.loadPixels(); // messing with the pixels in the image

		for (int y = 0; y < img.height; y++) {
			for (int x = 0; x < img.width; x++) {
				int loc = x + y * img.width;			// location of (x, y)
				float red = red(img.pixels[loc]); 	// red component
				pixels[loc] = color(red, 0, 0);		// set the canvas color
			}
		}

		updatePixels(); // done with pixels in the canvas
	}

	public void draw() {
		if (fileLoaded) {
			tintRed();
		}
	}
}
