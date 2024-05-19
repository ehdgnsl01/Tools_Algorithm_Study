import java.util.Scanner;
public class Assignment10_1 {
	final static int MAX_RANDOM_NUMBER = 1000;
	final static int MAX_ARRAY_SIZE = 120;
	public static void main(String[] args) {
	
		int arr[] = new int[MAX_ARRAY_SIZE];
		for(int i = 0; i<MAX_ARRAY_SIZE; ++i) 
			arr[i] = (int)(Math.random()*MAX_RANDOM_NUMBER);

		System.out.println("Enter an index: ");
		Scanner input = new Scanner(System.in);
		int index = input.nextInt();
		try {
			System.out.printf("The element is " + arr[index]);
		}
		catch (IndexOutOfBoundsException ex) {
			System.out.printf("Index out of bound");
		}
	}
}
