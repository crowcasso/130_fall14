package testgridworld;

import processing.core.PApplet;


public class TestGridWorld extends PApplet {
	
	private GridWorld world;

	public void setup() {
		size(800, 600);
		world = new GridWorld(this, 10, 10);
		
		// test code
		world.setColor(0, 0, world.RED);
		world.setColor(1, 0, world.GREEN);
	}

	public void draw() {
		int r = (int) (Math.random() * 10);
		int c = (int) (Math.random() * 10);
		
		//world.setColor(r, c, world.RED);
		world.draw();
	}
}
