import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an number: ");
		int n = sc.nextInt();
		
		if (n % 2 == 0) {
			System.out.println("not a prime");
			return;
		}

		for (int d = 3; d < (int)(Math.sqrt(n)); d = d + 2) {
			if (n % d == 0) {
				System.out.println("not a prime");
				return;
			} 
		}
		
		System.out.println("is a prime");
	}

}
