
public class Automata {

	public static void main(String[] args) throws InterruptedException {

		int [] cells = new int[101];
		cells[cells.length/2] = 1;
		//int [] rules = {0, 1, 0, 1, 1, 0, 1, 0};  // rule 90
		//int [] rules = {0, 1, 1, 1, 1, 0, 1, 1};  // rule 222
		//int [] rules = {0, 1, 1, 1, 1, 1, 0, 1}; // rule 190
		int [] rules = {0, 1, 1, 1, 1, 0, 0, 0}; // rule 30
		//int [] rules = {0, 1, 1, 1, 0, 1, 1, 0}; // rule 110

		for (int j = 0; j < 50; j++) {
			// display the generation
			for (int i = 0; i < cells.length; i++) {
				if (cells[i] == 0) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
			
			Thread.sleep(400);

			// apply the rules
			int [] second = new int[cells.length];
			for (int i = 1; i < cells.length - 1; i++) {
				int which = cells[i-1] * 4 + cells[i] * 2 + cells[i+1];
				second[i] = rules[which];
			}
			
			cells = second;
		}
	}
}