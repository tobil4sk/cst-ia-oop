package supo.week3;

public class StaticAndNonStatic {
	
	private static final double PI = 3.14159265;
	private double x = 10.;
	
	public static double convertRadiansToDegrees(double rad) {
		// cannot acccess x or calculate:
		// calculate(x); // "Cannot make a static reference to the non-static field x"
		
		return (rad / PI) * 180;
	}
	
	public double calculate(double y) {
		// Can access static field and method (PI and convertRadiansToDegrees)
		// but can also access non-static field x
		return PI * y * x * convertRadiansToDegrees(y);
	}
}
