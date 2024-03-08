package exercise08;

public class Circle extends Shape {
	// Private property
	private double radius;
		
	// Constructor to initialize the variables
	public Circle (double radius, String colour) {
		super(colour);
		this.radius = radius;
	}
		
	// Radius setter for the Circle
	public void setRadius (double radius) {
		this.radius = radius;
	}
	
	// Radius getter for the Circle
	public double getRadius () {
		return this.radius;
	}
	
	// Implementation of the inherited abstract method getPerimeter
	public double getPerimeter () {
		return (2 * (22/7) * this.radius);
	}
	
	// Implementation of the inherited abstract method getArea
	public double getArea () {
		return ((22/7) * this.radius * this.radius);
	}
}
