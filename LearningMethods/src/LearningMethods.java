
public class LearningMethods {

	public static void main(String[] args) {
		double a = distance(0, 0, 10, 10);
		
		System.out.println("Answer is " + (a * a));
	}
	
	public static double distance(double x1, double y1, double x2, double y2) {
		double d = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
		return d;
	}
}
