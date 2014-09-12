/**
 * Draws an Owl on a mouse click.
 * 
 * @author Joel Hollingsworth
 */
package parliament;

import processing.core.PApplet;


public class Parliament extends PApplet {

	Owl fluffy;
	
	public void setup() {
		size(800, 300);
		smooth();
	}

	public void draw() {
		
	}
	
	public void mousePressed() {
		fluffy = new Owl(this, mouseX, mouseY);
		fluffy.displayOwl();
	}
	

}
