/**
 * Compute Celsius given Fahrenheit
 * 
 * @author Joel Hollingsworth
 */
public class Celsius {

	public static void main(String[] args) {
		
		int fahr = 56;
		
		// compute celsius from fahrenheit
		double celsius = (5.0 / 9.0) * (fahr - 32);
		
		// display the answer
		System.out.println(fahr + " is " + celsius + " in celsius");	
	}
}