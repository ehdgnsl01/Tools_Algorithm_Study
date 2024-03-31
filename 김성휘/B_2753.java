package Baek_Joon_새싹;

import java.util.Scanner;

public class B_2753 {
	public static void main(String[] args) {
		
		// 윤년 찾기
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		
		if(a % 4 == 0) {  // 4의 배수인지 확인
			if(a % 100 != 0 || a % 400 == 0) System.out.print("1");  // 100의 배수가 아니거나 400의 배수인지 확인
			else System.out.print("0");  // 조건 2의 나머지
		}
		else System.out.print("0");  // 조건 1의 나머지
		
		scanner.close();
	}

}
