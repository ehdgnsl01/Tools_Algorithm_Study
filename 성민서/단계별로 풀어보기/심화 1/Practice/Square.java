public class Square extends GeometricObjectComparable implements Colorable{
	  protected double side;

	  public Square() {
	    this(1.0, "white", 1.0);
	  }

	  public Square(double side) {
	    this.side = side;
	  }

	  public Square(double side, String color, double weight) {
	    this.side = side;
	  }

	  public double getside() {
	    return side;
	  }

	  public void setside(double side) {
	    this.side = side;
	  }
	  //interface
	  public void howToColor() {
		  System.out.println("Color all four sides");
	  }
	  public void colorable() {
		  if(filled == false)
			  howToColor();
	  }
	  @Override
	  public boolean equals(Object square) {
	    return this.side == ((Square)square).getside();
	  }
	  @Override
	  public String toString() {
	    return "[Circle] side = " + side;
	  }
	  @Override
	  public double getArea() {
		  return side*side;
	  }
	  @Override
	  public double getPerimeter() {
		  return 4*side;
	  }
}