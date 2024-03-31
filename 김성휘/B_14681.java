package Baek_Joon_새싹;

import java.util.Scanner;

public class B_14681 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		
		if(a > 0 && b > 0) System.out.print("1");  // 1사분면
		else if(a < 0 && b > 0) System.out.print("2");  // 2사분면
		else if(a < 0 && b < 0) System.out.print("3");  // 3사분면
		else System.out.print("4");  // 4사분면
		
		scanner.close();
	}

}
