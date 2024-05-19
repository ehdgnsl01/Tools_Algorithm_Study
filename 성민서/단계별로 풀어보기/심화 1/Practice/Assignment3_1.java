import java.util.*;
public class Assignment3_1 {
	public static void main(String[] args) {
		System.out.print("Enter the number of lines: ");
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		
		for (int y = 1; y <= n; y++) {
			
			if (y <= 9) {
				if (n >= 10) {
					for (int x = 0; x <= n - 10; x++) {
						System.out.print(" ");
					}
				}

				for (int x = 2 * (n - 1); x > 2 * (y - 1); x--) {
					System.out.print(" ");
				}
			}

			if (y >= 10 ) {
				for (int x = 3 * (n - 5); x > 3 * (y - 5); x--) {
					System.out.print(" ");
				}
			}

			for (int x = y; x >= 2; x--) {
				System.out.print(x+" ");
			}

			for (int x = 1; x <= y; x++) {
				System.out.print(x+" ");
			}
			System.out.print("\n");
		}
	}
}
