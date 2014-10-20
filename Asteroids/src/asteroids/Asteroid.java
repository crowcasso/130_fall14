package asteroids;

import processing.core.PApplet;
import processing.core.PImage;

public class Asteroid {

	// Instance Variables
	private PImage image;
	private float x, y;
	private float vx, vy;
	private float angle;
	private PApplet p;
	
	// Constructor
	public Asteroid(PApplet pApplet) {
		p = pApplet;
		
		x = p.getWidth()/2; //(float) (Math.random() * p.getWidth());
		y = p.getHeight()/2; //(float) (Math.random() * p.getHeight());

		
		angle = 0;
		
		vx = (float) (Math.random() * 2) + 1;
		vy = (float) (Math.random() * 2) + 1;
		
		if (Math.random() < .5) {
			vx = -vx;
		}
		
		if (Math.random() < .5) {
			vy = -vy;
		}
		
		image = p.loadImage("asteroid.png");
		int size = (int)(Math.random() * 128) + 128;
		image.resize(size, size);
	}
	
	public void update() {
		x = x + vx;
		y = y + vy;
		
		angle = angle + 0.01f;
		
		
	}
	
	public void draw() {
		p.pushMatrix();
		p.translate(x + image.width/2, y + image.height/2);
		p.rotate(angle);
		p.image(image, x, y);
		p.popMatrix();
	}
	
}



