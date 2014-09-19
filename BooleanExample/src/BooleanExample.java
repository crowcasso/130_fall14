public class BooleanExample {

	public static void main(String[] args) {
		
		int x = 90;
		int y = 78;
		
		boolean isLarger = x > y;
		System.out.println("is x is larger than y? " + isLarger);
		
		if (x < y) {
			System.out.println("x is smaller");
			System.out.println(x);
		} else if (x > y) {
			System.out.println("x is greater!");
		} else {
			System.out.println("x is the same");
		}
		
		System.out.println("hello class!");
	}
}