
public class Computer {

	public int move(int numMarbles) {
		int n = (int)(Math.random() * numMarbles/2) + 1;
		System.out.println("Computer took " + n + " marbles.");
		
		return n;
	}
	
	public int moveSmart(int numMarbles) {
		for (int p = 0; p < 7; p++) {
			int target = (int)(Math.pow(2, p)) - 1;
			int takeThisMany = numMarbles - target;
			if (takeThisMany > 0 && takeThisMany < numMarbles/2) {
				System.out.println("Computer took " + takeThisMany + " marbles.");
				return takeThisMany;
			}
		}
		
		int n = (int)(Math.random() * numMarbles/2) + 1;
		System.out.println("Computer took " + n + " marbles.");
		return n;
	}
	
}



