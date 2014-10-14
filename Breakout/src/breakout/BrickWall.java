package breakout;

/**
 * Just another brick(s) in the wall!
 * 
 * This class is complete. Please do not change this code.
 * 
 * @author J. Hollingsworth
 */

import java.util.ArrayList;

import processing.core.PApplet;

public class BrickWall {

	private PApplet p;
	ArrayList<Rectangle> wall;  // contains all of the Rectangle objects

	public BrickWall(PApplet pApplet) {
		p = pApplet;
		wall = new ArrayList<Rectangle>();
	}

	// add a brick to the wall
	public void add(Rectangle brick) {
		wall.add(brick);
	}
	
	// given a (x, y) coordinate, find a brick around that coordinate
	public Rectangle getBrickAt(float ballX, float ballY) {
		for (Rectangle brick : wall) {
			float x = brick.getX();
			float w = brick.getWidth();
			if (x <= ballX && x + w >= ballX) {  // inside x box
				float y = brick.getY();
				float h = brick.getHeight();
				if (y <= ballY && y + h >= ballY) {  // inside y box
					return brick;
				}
			}
		}
		
		return null;
	}

	// draw the wall
	public void draw() {
		for (Rectangle brick : wall) {
			brick.draw();
		}
	}
}