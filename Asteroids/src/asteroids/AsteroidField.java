package asteroids;

import processing.core.PApplet;


public class AsteroidField extends PApplet {
	
	private Asteroid [] asteroids;

	public void setup() {
		size(800, 600);
		asteroids = new Asteroid[50];
		for (int i = 0; i < asteroids.length; i++) {
			asteroids[i] = new Asteroid(this);
		}
	}

	public void draw() {
		background(0);
		for (int i = 0; i < asteroids.length; i++) {
			asteroids[i].update();
			asteroids[i].draw();
		}
	}
}
