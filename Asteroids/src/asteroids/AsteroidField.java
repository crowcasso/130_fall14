package asteroids;

import processing.core.PApplet;


public class AsteroidField extends PApplet {
	
	private Asteroid asteroid;

	public void setup() {
		size(800, 600);
		asteroid = new Asteroid(this);
	}

	public void draw() {
		background(0);
		asteroid.update();
		asteroid.draw();
	}
}
