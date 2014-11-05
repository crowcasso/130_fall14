package breakout;

/**
 * Represents the paddle in Breakout.
 * 
 * @author J. Hollingsworth
 */

import processing.core.PApplet;

public class Paddle {

	private int x;
	private PApplet p;

	private final int PADDLE_WIDTH = 60;
	private final int PADDLE_HEIGHT = 10;
	private final int PADDLE_Y_OFFSET = 60;

	// Constructor
	public Paddle(PApplet pApplet) {
		p = pApplet;
		x = p.getWidth()/2;
	}

	// move the paddle with the mouse
	public void update(int ux) {
		if (ux < PADDLE_WIDTH/2) {
			x = PADDLE_WIDTH/2;
		} else if (ux > p.getWidth() - PADDLE_WIDTH) {
			x = p.getWidth() - PADDLE_WIDTH/2;
		} else {
			x = ux;
		}
	}

	// display the paddle
	public void draw() {
		p.noStroke();
		p.fill(0);
		p.rect(x - PADDLE_WIDTH/2, p.getHeight() - PADDLE_Y_OFFSET, PADDLE_WIDTH, PADDLE_HEIGHT);
	}
	
	// check for ball collision
	public void collision(Ball ball) {
		if (ball.getX() + ball.getWidth()/2 <= x + PADDLE_WIDTH/2 &&
				ball.getX() + ball.getWidth()/2 >= x - PADDLE_WIDTH/2) {
			if (ball.getY() + ball.getHeight()/2 >= p.getHeight() - PADDLE_Y_OFFSET) {
				ball.bounce();
			}
		}
	}
}
