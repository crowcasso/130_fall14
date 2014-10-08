
public class NestedLoopExample {

	public static void main(String[] args) {
	
		for (int i = 0; i < 10; i++) {
			System.out.print(i + ": "); 
			for (int j = 0; j < 5; j = j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	
	}
}
