package exercise08;

public class Rectangle extends Shape {
	// Private property
	private double height;
	private double width;
	
	// Constructor to initialize the variables
	public Rectangle (double height, double width, String colour) {
		super(colour);
		this.height = height;
		this.width =  width;
	}
	
	// Height setter for the Rectangle
	public void setHeight (double height) {
		this.height = height;
	}
	
	// Height getter for the Rectangle
	public double getHeight () {
		return this.height;
	}
	
	// Width setter for the Rectangle
	public void setWidth (double width) {
		this.width = width;
	}
	
	// Width getter for the Rectangle
	public double getWidth () {
		return this.width;
	}
	
	// Implementation of the inherited abstract method getPerimeter
	public double getPerimeter () {
		return (this.width * 2 + this.height * 2);
	}
	
	// Implementation of the inherited abstract method getArea
	public double getArea () {
		return this.width * this.height;
	}
}
