package Baek_Joon_새싹;

import java.util.Scanner; // Scanner를 사용하기 위해

public class B_1001 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		// Scanner 객체명 = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		int sub = a - b;
		
		System.out.print(sub);
		
		scanner.close(); // scanner 사용 후 닫아줘야 함
	}

}
