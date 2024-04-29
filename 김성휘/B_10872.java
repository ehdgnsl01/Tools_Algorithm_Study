package 제출O;

import java.util.Scanner;

public class B_10872 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int factorial = 1;
		
		for(int i = 1; i <= n; i++) {  // for문으로 팩토리얼에 1부터 n까지의 곱 누적시키기
			factorial = factorial * i;
		}
		
		System.out.print(factorial);
		
		scanner.close();
	}

}
