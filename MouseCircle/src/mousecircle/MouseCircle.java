package mousecircle;

import processing.core.PApplet;


public class MouseCircle extends PApplet {

	public void setup() {
		size(500, 500);
	}

	public void draw() {
		
		int red = (int) (Math.random() * 256);
		int green = (int) (Math.random() * 256);
		int blue = (int) (Math.random() * 256);
		int alpha = (int) (Math.random() * 256);
		
		int x = (int) (Math.random() * width);
		int y = (int) (Math.random() * height);
		
		int w = (int) (Math.random() * 100);
		int h = (int) (Math.random() * 100);
		
		noStroke();
		fill(red, green, blue, alpha);
		ellipse(x, y, w, h);
		
	}
}
