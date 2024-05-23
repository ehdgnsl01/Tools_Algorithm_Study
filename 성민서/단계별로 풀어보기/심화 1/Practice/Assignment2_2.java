import java.util.*;
public class Assignment2_2 {
	public static void main(String[] args) {
		System.out.print("Enter three edges(length in double): ");
		
		Scanner input = new Scanner(System.in);
		double A = input.nextDouble();
		double B = input.nextDouble();
		double C = input.nextDouble();
		double max;
		max=A;
		if(max<B) max=B;
		if(max<C) max=C;
		
		if(max>=A+B+C-max) System.out.println("Input is invalid");
		else System.out.println("The perimeter is "+(A+B+C));
	}
}
