package ball;

/**
 * Draw a ball that moves off the screen.
 * 
 * @author Joel Hollinsgworth
 */

import processing.core.PApplet;


public class Ball extends PApplet {
	
	int x;
	int y;

	public void setup() {
		// set the size of the screen
		size (512, 512);
		
		x = 50;
		y = 100;
	}

	public void draw() {
		// erase the screen
		background(128);
		
		// move the ball to the right
		x = x + 1;
		
		// draw the ellipse
		ellipse(x, y, 50, 50);
	}
}
