import java.util.Scanner;

public class HighLow {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int theNumber = (int) (Math.random() * 100) + 1;

		int guess = 101;
		while (guess != theNumber) {
			System.out.print("What is your guess? ");
			guess = sc.nextInt();

			if (guess > theNumber) {
				System.out.println("You are too high!");
			} else if (guess < theNumber) {
				System.out.println("You are too low!");
			} else {
				System.out.println("You are correct!!!!");
			}
		}
		
		System.out.println("Thanks for playing!");

	}

}
