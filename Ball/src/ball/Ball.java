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
	int speedX;
	int speedY;

	public void setup() {
		// set the size of the screen
		size (512, 512);
		
		x = 50;
		y = 100;
		speedX = 3;
		speedY = 2;
	}

	public void draw() {
		// erase the screen
		background(128);
		
		// bounce ball off left and right wall
		if (x > width || x < 0) {
			speedX = speedX * -1;
		} 
	
		if (y > height) {	// bounce ball off the bottom wall
			speedY = -2;
		} else if (y < 0) { // bounce ball off top wall
			speedY = 2;
		}
		
		// move the ball
		x = x + speedX;
		y = y + speedY;
		
		// draw the ellipse
		ellipse(x, y, 50, 50);
	}
}