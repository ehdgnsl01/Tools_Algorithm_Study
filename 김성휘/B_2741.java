package 제출O;

import java.util.Scanner;

public class B_2741 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();  // 입력 받기
		int a = 1;  // 1부터 N까지 출력
		
		while(N >= a) {
			System.out.println(a);
			a += 1;
		}
		
		scanner.close();
	}
	
}
