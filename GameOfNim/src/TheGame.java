
public class TheGame {

	public static void main(String[] args) {
		Computer com = new Computer();
		Player pla = new Player();

		int marbles = (int)(Math.random() * 90) + 10;
		System.out.println("Game of Nim with " + marbles + " marbles");

		boolean playerFirst = false;
		if (Math.random() < .5) {
			playerFirst = true;
		}

		while(marbles > 1) {

			if (playerFirst) {
				int n = pla.move(marbles);
				marbles = marbles - n;
				if (marbles == 1) {
					System.out.println("Player won!");
					break;
				}

				int m = com.moveSmart(marbles);
				marbles = marbles - m;
				if (marbles == 1) {
					System.out.println("Computer won!");
					break;
				}
			} else {
				int m = com.moveSmart(marbles);
				marbles = marbles - m;
				if (marbles == 1) {
					System.out.println("Computer won!");
					break;
				}

				int n = pla.move(marbles);
				marbles = marbles - n;
				if (marbles == 1) {
					System.out.println("Player won!");
					break;
				}
			}

		}
	}

}
