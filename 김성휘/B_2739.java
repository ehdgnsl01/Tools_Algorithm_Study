package 제출O;

import java.util.Scanner;

public class B_2739 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		for(int i = 1; i <= 9; i++) {
			
			System.out.printf("%d * %d = %d\n", n, i, n*i);  // printf를 사용하여 format 출력
		}
		scanner.close();
	}

}
