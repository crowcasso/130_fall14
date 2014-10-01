
public class ComputePi {

	public static void main(String[] args) {

		int count = 0;

		for (int i = 0; i < 100000000; i++) {
			double x = Math.random();
			double y = Math.random();

			double d = Math.sqrt(x*x + y*y);
			if (d <= 1) {
				count++;
			}
		}
		
		System.out.println(count/100000000.0 * 4);

	}

}
