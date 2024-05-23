//GeometricObject.java: The abstract GeometricObject class
public abstract class GeometricObjectComparable implements 
	Comparable<GeometricObjectComparable>, Colorable{
	protected String color = "white";
	protected boolean filled;

	/**Default construct*/
	protected GeometricObjectComparable() {
		filled = false;
	}

	/**Construct a geometric object*/
	protected GeometricObjectComparable(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}

	/**Getter method for color*/
	public String getColor() {
		return color;
	}

	/**Setter method for color*/
	public void setColor(String color) {
		this.color = color;
	}

	/**Getter method for filled. Since filled is boolean,
  	so, the get method name is isFilled*/
	public boolean isFilled() {
		return filled;
	}

	/**Setter method for filled*/
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	//interface1
	public int compareTo(GeometricObjectComparable obj) {
		if (this.getArea() > obj.getArea()) {
			return 1;
	    	}
	    	else if(this.getArea() < obj.getArea()) {
	    		return -1;
	    	}
	    	else {
	    		return 0;
	    	}
	}

	public static GeometricObjectComparable max(GeometricObjectComparable obj1, GeometricObjectComparable obj2) {
		int compare = obj1.compareTo(obj2);
		if(compare ==1)
			return obj1;
		else if(compare ==-1)
			return obj2;
		else
			return obj1;
	}
	//interface2
	public void howToColor() {
		System.out.println("Color all four sides");
	}
	public void colorable() {
		if(filled == false)
			howToColor();
	}
	/**Abstract method findArea*/
	public abstract double getArea();

	/**Abstract method getPerimeter*/
	public abstract double getPerimeter();
}