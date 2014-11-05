package breakout;

/**
 * Represents the ball in Breakout.
 * 
 * @author J. Hollingsworth
 */

import processing.core.PApplet;

public class Ball {
	
	private PApplet p;
	
	// location
	private int x;
	private int y;
	
	// size
	private int width;
	private int height;
	private final int BALL_RADIUS = 6;
	
	// velocity
	private int vx;
	private int vy;
	
	// number of turns
	private int numTurns;
	
	// Constructor
	public Ball(PApplet pApplet, int nTurns) {
		p = pApplet;
		numTurns = nTurns;	// start with this many turns
		
		// place ball in the middle of the screen
		x = p.getWidth()/2;
		y = p.getHeight()/2;
		
		// randomize the x velocity
		vx = (int) (Math.random() * 3) + 1;
		if (Math.random() < 0.5) {
			vx = -vx;
		}
		vy = 3;  // fixed y velocity
	
		// set the size
		width = BALL_RADIUS * 2;
		height = BALL_RADIUS * 2;
	}
	
	// move the ball -- bounce on walls
	public void update() {
		// move the ball
		x += vx;
		y += vy;
		
		// right or left side collisions?
		if (x+width >= p.getWidth() || x <= 0) {
			vx = -vx;
		}
		
		// top collision?
		if (y <= 0) {
			vy = -vy;
		}
		
		// bottom collision?
		if (y+height >= p.getHeight() && numTurns > 0) {
			// reset the ball
			x = p.getWidth()/2;
			y = p.getHeight()/2;
			vx = (int) (Math.random() * 3) + 1;
			if (Math.random() < 0.5) {
				vx = -vx;
			}
			
			// lose a turn
			numTurns--;
		}
	}
	
	// display the ball
	public void draw() {
		p.noStroke();
		p.fill(0);
		p.ellipse(x, y, width, height);
	}
	
	// bounce the ball
	public void bounce() {
		vy = -vy;
	}

	// some useful getters
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}	
}
