package Baek_Joon_새싹;

import java.util.Scanner;

public class B_10869 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		System.out.println(a + b);  // 더하기
		System.out.println(a - b);  // 빼기
		System.out.println(a * b);  // 곱하기
		System.out.println(a / b);  // 몫
		System.out.println(a % b);  // 나머지
		
		scanner.close();
	}

}
