package 제출O;


import java.util.Scanner;

public class B_9498 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		
		if (a >= 90) {
			System.out.print("A");
		}
		else if (a >= 80) {
			System.out.print("B");
		}
		else if (a >= 70) {
			System.out.print("C");
		}
		else if (a >= 60) {
			System.out.print("D");
		}
		else {
			System.out.print("F");
		}
		
		scanner.close();
	}

}
