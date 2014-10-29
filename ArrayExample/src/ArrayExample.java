
public class ArrayExample {

	public static void main(String[] args) {
		
		// Declare and create the array
		int [] numbers = new int[100];
		
		// Fill the array with random values
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random() * 100) + 1;
		}
		
		// Find the Average
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];
		}
		System.out.println("Average = " + ((double)sum / numbers.length));
		
		// Find the Max
		int max = -1;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		System.out.println("max = " + max);
	
		// Find the Min
		int min = 101;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < min) {
				min = numbers[i];
			}
		}
		System.out.println("min = " + min);
		
		// Find the range
		int range = max - min;
		System.out.println("range = " + range);
		
		/*
		// Display the array
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("numbers[" + i + "] = " + numbers[i]);
		}
		*/

	}

}
