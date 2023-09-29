public class MyArea {
	private static final double PI = 3.14;

	public static void areaOfCircle(int radius) {
		int squaredNumber = radius * radius;
		double circleSquare = squaredNumber * PI;
		System.out.println("Area of circle: " + circleSquare);
	}
}
