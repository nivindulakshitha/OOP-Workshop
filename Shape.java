package exercise08;

public abstract class Shape {
	// Private property
	private String colour;
	
	// Abstract methods
	public abstract double getPerimeter();
	public abstract double getArea();
	
	// Constructor for the Shape class
	public Shape (String colour) {
		this.colour = colour;
	}
	
	// Setter method to set out the colour of the shape
	public void setColour (String colour) {
		this.colour = colour;
	}
	
	// Getter method to return the colour of the shape
	public String getColour () {
		return this.colour;
	}
}
