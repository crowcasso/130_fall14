package parliament;

import processing.core.PApplet;

public class Owl {
	
	private float x;
	private float y;
	
	private PApplet p;
	
	public Owl(PApplet pApplet, float x1, float y1) {
		p = pApplet;
		x = x1;
		y = y1;
	}
	
	public void displayOwl() {
		p.pushMatrix();
		p.translate(x, y);
		
		// body
		p.strokeWeight(70);
		p.line(0, -35, 0, -65);
		
		// eye sockets
		p.noStroke();
		p.fill(255);
		p.ellipse(17, -65, 35, 35);
		p.ellipse(-17, -65, 35, 35);
		
		// mouth area
		p.fill(255);
		p.strokeWeight(1);
		p.arc(0, -65, 70, 70, 0, p.PI);
	
		// eyes
		p.stroke(0);
		p.strokeWeight(1);
		p.fill(0);
		p.ellipse(17, -65, 5, 5);
		p.ellipse(-17, -65, 5, 5);
		
		// nose
		p.quad(0, -60, 3, -55, 0, -50, -3, -55);
		
		p.popMatrix();
	}

}
