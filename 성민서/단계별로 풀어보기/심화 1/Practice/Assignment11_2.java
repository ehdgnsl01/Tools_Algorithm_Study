public class Assignment11_2 {
	public static void main(String[] args) {
		GeometricObjectComparable[] objects =  {new Square(2), new
		Circle(5), new Square(5), new Rectangle(3, 4), new
		Square(4.5)};
		objects[1].setFilled(true);
		objects[2].setFilled(true);
		objects[3].setFilled(true);
		
		System.out.println("Area is "+ objects[0].getArea());
		objects[0].colorable();
		System.out.println("Area is "+ objects[1].getArea());
		objects[1].colorable();
		System.out.println("Area is "+ objects[2].getArea());
		objects[2].colorable();
		System.out.println("Area is "+ objects[3].getArea());
		objects[3].colorable();
		System.out.println("Area is "+ objects[4].getArea());
		objects[4].colorable();
	}
}
