//Circle.java: The circle class that extends GeometricObject
public class Circle extends GeometricObjectComparable implements Colorable{
	protected double radius;

	// Default constructor
	public Circle() {
		this(1.0, "white", 1.0);
	}

	// Construct circle with specified radius
	public Circle(double radius) {
 
		this.radius = radius;
	}

	// Construct a circle with specified radius, weight, and color
	public Circle(double radius, String color, double weight) {
 
		this.radius = radius;
	}

	// Getter method for radius
	public double getRadius() {
		return radius;
	}

	// Setter method for radius
	public void setRadius(double radius) {
		this.radius = radius;
	}
	//interface
	public void howToColor() {
		System.out.println("Color all four sides");
	}
	public void colorable() {
		if(filled == false)
			howToColor();
	}
	// Override the equals() method defined in the Object class
	@Override
	public boolean equals(Object circle) {
		return this.radius == ((Circle)circle).getRadius();
	}
	@Override
	public String toString() {
		return "[Circle] radius = " + radius;
	}
	@Override
	public double getArea() {
		return radius*radius*Math.PI;
	}
	@Override
	public double getPerimeter() {
		return radius*2*Math.PI;
	}
}