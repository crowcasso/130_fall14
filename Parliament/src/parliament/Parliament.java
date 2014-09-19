/**
 * Draws an Owl on a mouse click.
 * 
 * @author Joel Hollingsworth
 */
package parliament;

import processing.core.PApplet;


public class Parliament extends PApplet {

	Owl fluffy;
	Owl fluffyjr;
	
	public void setup() {
		size(800, 600);
		smooth();
		
		fluffy = new Owl(this, width/2, height/2);
		//fluffyjr = new Owl(this, 500, 150);
	}

	public void draw() {
		background(128);
		
		fluffy.move();
		fluffy.displayOwl();
		
		//fluffyjr.displayOwl();
	}

}
