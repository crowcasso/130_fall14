
public class Probability {

	public static void main(String[] args) {

		PairOfDie pair = new PairOfDie(6);
		int count = 0;

		for (int i = 0; i < 1000000; i++) {
			pair.roll();
			int s = pair.sum();
			if (s % 2 == 1) {
				count = count + 1;
			}
		}

		System.out.println(count/1000000.0);

	}

}
