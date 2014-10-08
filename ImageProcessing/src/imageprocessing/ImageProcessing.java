package imageprocessing;

import java.io.File;

import processing.core.PApplet;
import processing.core.PImage;


public class ImageProcessing extends PApplet {

	private PImage img;
	private boolean fileLoaded = false;
	private boolean once = false;
	private int count = 0;

	public void setup() {
		selectInput("Select a file to process:", "fileSelected");
	}

	public void fileSelected(File selection) {
		img = loadImage(selection.getAbsolutePath());
		size(img.width, img.height);
		System.out.println(img.width + "," + img.height);
		fileLoaded = true;
	}

	public void tintRed() {
		if (!once) {
			loadPixels(); // messing with pixels in the canvas
			img.loadPixels(); // messing with the pixels in the image

			for (int y = 0; y < img.height; y++) {
				for (int x = 0; x < img.width; x++) {
					int loc = x + y * width;			// location of (x, y)
					float r = red(img.pixels[loc]); 	// red component
					pixels[loc] = color(r, 0, 0);		// set the canvas color
				}
			}

			updatePixels(); // done with pixels in the canvas
			once = true;
		}
	}

	public void draw() {
		if (fileLoaded) {
			System.out.println(count++);
			tintRed();
		}
	}
}
