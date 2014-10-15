package breakout;

import processing.core.PApplet;

/**
 * Represents a rectangle for the game of Breakout.
 * 
 * This class is minimally implemented. Needs work!
 * 
 * @author J. Hollingsworth
 */

public class Rectangle {
	
	// instance variables
	private float x, y;
	private float width, height;
	private int color;
	private PApplet p;
	
	// constructor
	public Rectangle(PApplet pApplet, float aX, float aY, 
			float aWidth, float aHeight, int aColor) {
		x = aX;
		y = aY;
		width = aWidth;
		height = aHeight;
		color = aColor;
		p = pApplet;
	}
	
	public float getX() {
		return x;
	}
	
	public float getY() {
		return y;
	}
	
	public float getWidth() {
		return width;
	}
	
	public float getHeight() {
		return height;
	}
	
	public void draw() {
		p.noStroke();
		p.fill(color);
		p.rect(x, y, width, height);
	}
}
