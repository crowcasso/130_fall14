package breakout;

/**
 * The classic arcade game of Breakout.
 * 
 * @author J. Hollingsworth
 */

import processing.core.PApplet;

public class Breakout extends PApplet {

	private final int WIDTH = 400;
	private final int HEIGHT = 600;
	
	private final int NBRICKS_PER_ROW = 10;
	private final int NBRICKS_ROWS = 10;
	private final int BRICK_SEP = 2;
	private final int BRICK_WIDTH = WIDTH / NBRICKS_PER_ROW - BRICK_SEP;
	private final int BRICK_HEIGHT = 8;
	private final int BRICK_Y_OFFSET = 70;
	
	private final int RED = color(230, 11, 24);
	private final int ORANGE = color(253, 152, 39);
	private final int YELLOW = color(254, 203, 46);
	private final int GREEN = color(41, 253, 46);
	private final int BLUE = color(45, 255, 254);
	
	private final int NTURNS = 3;
	
	BrickWall brickWall;
	Paddle paddle;
	Ball ball;

	public void setup() {
		// setup the canvas
		size(WIDTH, HEIGHT);
		smooth();

		// build the pieces needed to play
		brickWall = new BrickWall(this);
		buildBrickWall();
		ball = new Ball(this, NTURNS-1);
		paddle = new Paddle(this);
	}
	
	// check for collisions between the ball and bricks
	private void brickWallCollisions() {
		Rectangle brick = brickWall.getBrickAt(ball.getX() - ball.getWidth()/2, 
				ball.getY() - ball.getHeight()/2);
		if (brick != null) {
			brickWall.remove(brick);
			ball.bounce();
			return; // only allow one brick removal per check
		}
		
		brick = brickWall.getBrickAt(ball.getX() + ball.getWidth()/2, 
				ball.getY() - ball.getHeight()/2);
		if (brick != null) {
			brickWall.remove(brick);
			ball.bounce();
			return;
		}
		
		brick = brickWall.getBrickAt(ball.getX() - ball.getWidth()/2, 
				ball.getY() + ball.getHeight()/2);
		if (brick != null) {
			brickWall.remove(brick);
			ball.bounce();
			return;
		}
		
		brick = brickWall.getBrickAt(ball.getX() + ball.getWidth()/2, 
				ball.getY() + ball.getHeight()/2);
		if (brick != null) {
			brickWall.remove(brick);
			ball.bounce();
			return;
		}
	}

	// display the game
	public void draw() {
		background(255);
		
		// check for collisions
		brickWallCollisions();
		paddle.collision(ball);
		
		// draw the updated board
		brickWall.draw();
		
		// draw the ball
		ball.update();
		ball.draw();
		
		// draw the paddle
		paddle.update(mouseX);
		paddle.draw();
	}
	
	// build the brick wall
	private void buildBrickWall() {
		for (int i = 0; i < NBRICKS_ROWS; i++) {
			for (int j = 0; j < NBRICKS_PER_ROW; j++) {
				int x = BRICK_SEP/2 + j * (BRICK_WIDTH + BRICK_SEP);
				int y = BRICK_Y_OFFSET + i * (BRICK_HEIGHT + BRICK_SEP);
				int color = RED;
				if (i < 2)
					color = RED;
				else if (i < 4) 
					color = ORANGE;
				else if (i < 6) 
					color = YELLOW;
				else if (i < 8) 
					color = GREEN;
				else 
					color = BLUE;
				Rectangle rect = new Rectangle(this, x, y, 
						BRICK_WIDTH, BRICK_HEIGHT, color);
				brickWall.add(rect);
			}
		}
	}
}
