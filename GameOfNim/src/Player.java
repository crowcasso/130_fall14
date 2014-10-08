import java.util.Scanner;


public class Player {

	public int move(int numMarbles) {
		Scanner sc = new Scanner(System.in);
		System.out.println("There are " + numMarbles + " marbles left in the game.");

		int n = 0;
		while (n < 1 || n > numMarbles/2) {
			System.out.print("How many would you like to take? ");
			n = sc.nextInt();
		}

		return n;
	}

}
