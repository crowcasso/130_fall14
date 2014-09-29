
public class Tortoise {

	private int position;
	
	public Tortoise() {
		position = 1;
	}
	
	public void move() {
		double r = Math.random();
		
		if (r < .5) {			// 50% fast plod
			position = position + 3;
		} else if (r < .7) {  	// 20% slip
			position = position - 6;
		} else {  				// 30% small plod
			position = position + 1;
		}
		
		if (position < 1) {		// cannot slip past the start
			position = 1;
		}
	}
	
	public int getPosition() {
		return position;
	}
	
	public String toString() {
		String dash = "";
		for (int i = 0; i < (position - 1); i++) {
			dash = dash + "-";
		}
		
		return dash + "T";
	}
	
}


