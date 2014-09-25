
public class PairOfDie {

	private int numSides;
	private int value1;
	private int value2;
	
	public PairOfDie(int sides) {
		numSides = sides;
		roll();
	}
	
	public void roll() {
		value1 = (int) (Math.random() * numSides) + 1;
		value2 = (int) (Math.random() * numSides) + 1;
	}
	
	public int getValue1() {
		return value1;
	}
	
	public int getValue2() {
		return value2;
	}
	
	public int sum() {
		return value1 + value2;
	}
	
	public String toString() {
		return "[" + value1 + "," + value2 + "]";
	}
	
}


