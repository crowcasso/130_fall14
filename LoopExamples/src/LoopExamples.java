
public class LoopExamples {

	public static void main(String[] args) {
		
		/* for-loop implementation
		for (int e = 0; e < 20; e++) {
			int ans = (int) (Math.pow(2, e));
			System.out.println("2^" + e + " = " + ans);
		}
		*/
		
		// while-loop implementation
		int e = 0;
		while (e < 20) {
			int ans = (int) (Math.pow(2, e));
			System.out.println("2^" + e + " = " + ans);
			e++;
		}
		
		System.out.println("AFTER");
		
		
		

	}

}
