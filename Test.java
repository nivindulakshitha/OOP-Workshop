package exercise08;

public class Test {

	public static void main(String[] args) {
		Shape rectangle = new Rectangle(5.5, 2.3, "Red");
		Shape circle = new Circle(7, "Orange");

		System.out.println("\nQ3. 2. Perimeters");
		System.out.println("\tRectangle: " + rectangle.getPerimeter());
		System.out.println("\tCircle: " + circle.getPerimeter());
		
		System.out.println("\nQ3. 2. Areas");
		System.out.println("\tRectangle: " + rectangle.getArea());
		System.out.println("\tCircle: " + circle.getArea());
		
		Shape[] someShapes = {
				new Rectangle(4, 9, "Green"),
				new Rectangle(3.1, 4.5, "Black"),
				new Circle(22, "Purple"),
				new Circle(7, "Brown"),
		};
		
		System.out.println("\nQ3. 4.");
		for (Shape theShape: someShapes) {
			System.out.println("\tPerimeter: " + theShape.getPerimeter());
			System.out.println("\tArea: " + theShape.getArea() + "\n");
		}
		
		Car myCar = new Car();
		Truck yourTruck = new Truck();
		
		System.out.println("\nQ4. 4.");
		myCar.drive();
		yourTruck.drive();
		
		double result = devide(4, 0);
		if (!(Double.isNaN(result))) {
			System.out.println("\nQ5.");
			System.out.println("\t" + result);
		}
	}
	
	public static double devide (double dividend, double divisor) {
		if (divisor != 0) {
			return dividend / divisor;
		} else {
			System.out.println("\nQ5.");
			System.out.println("\tCannot divide by zero");
			return Double.NaN;
		}
	}
}
