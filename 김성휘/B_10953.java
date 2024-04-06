package Baek_Joon_새싹;

import java.util.Scanner;

public class B_10953 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);  // T 입력 받기
		
		int T = scanner.nextInt();  // 테스트 케이스의 개수 T

		// for 문으로 값 입력 받고 합 출력하기 
		for(int i = 1; i <= T; i++) {
			
			String[] s = scanner.next().split(",");
			
			int a = Integer.parseInt(s[0]);
			int b = Integer.parseInt(s[1]);
			System.out.println(a + b);
		}
	}

}
