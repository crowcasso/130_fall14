package breakout;

/**
 * The classic arcade game of Breakout!
 * 
 * @author YOUR_NAME_HERE and J. Hollingsworth
 */

import processing.core.PApplet;


public class Breakout extends PApplet {

	// constants
	private final int SCREEN_WIDTH = 400;
	private final int SCREEN_HEIGHT = 600;

	private final int NUM_BRICKS_PER_ROW = 10;
	private final int NUM_BRICKS_ROW = 10;
	private final int BRICK_SEP = 2;
	private final int BRICK_WIDTH = SCREEN_WIDTH / NUM_BRICKS_PER_ROW - BRICK_SEP;
	private final int BRICK_HEIGHT = 8;
	private final int BRICK_Y_OFFSET = 70;

	private final int RED = color(230, 11, 24);
	private final int ORANGE = color(253, 152, 39);
	private final int YELLOW = color(254, 203, 46);
	private final int GREEN = color(41, 253, 46);
	private final int BLUE = color(45, 255, 254);

	private final int NUM_TURNS = 3;


	// instance variables
	BrickWall brickWall;


	public void setup() {
		size(SCREEN_WIDTH, SCREEN_HEIGHT);
		brickWall = new BrickWall(this);
		
		/* FIXME: Create and add Rectangle objects to brickWall */
		Rectangle rect = new Rectangle(this, 30, 70, 80, 8, RED);
		brickWall.add(rect);
	}

	public void draw() {
		
		// white background
		background(255); 
		
		// draws the brick wall
		brickWall.draw();
	}
}